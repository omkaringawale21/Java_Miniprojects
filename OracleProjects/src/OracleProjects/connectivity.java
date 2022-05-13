package OracleProjects;

import java.sql.*;

class connectivity
{
  public static void main(String args[ ])
   {
     Connection con=null;

      try
        {
            //Loading driver in memory
//            Class.forName("oracle.jdbc.driver.OracleDriver");

            //Building bridge between java language& database
            // url oracle = "jdbc:oracle:thin:@localhost:1521:XE"   user = "system" pass = "Omkar@21"
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/info1", "root", "Omkar@21");

            //Building query
            String query = "Select * from students order by sno";

            //Firing query to database 
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(query);

            //Itearting data
            while(rs.next())
             {
               System.out.println(rs.getInt("sno") + " " + rs.getString("sname") + " " + rs.getInt("age"));
             }
        
             System.out.println("Fetching Completed!");

            //Closing objects   
            rs.close();
            stmt.close();
            con.close(); 
        }
      catch(Exception e)
        {
          System.out.println(e);
        }
 
   }
}

/*
Method of 'DriverManager'class:
getConnection() :
Syntax:  public static synchronized Connection getConnection(String url, String userid, String password)
                throws SQLException

Method of 'Connection' interface:
createStatement() :
Statement createStatement()
   
Methods of 'Statement' interface :
i) executeQuery():
   ResultSet executeQuery(String query) throws SQLException

Methods of 'ResultSet' interface :
 i) next(): boolean next()
ii) getString(): String getString(String columnName)
ii) getInt(): int getInt(String columnName)
*/
