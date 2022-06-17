package login.web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import login.bean.LoginBean;
import login.database.LoginDao;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private LoginDao loginDao;
       
	public void init(){
		loginDao = new LoginDao();
	}
	
    public LoginServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		LoginBean loginBean = new LoginBean();
		loginBean.setUsername(username);
		loginBean.setPassword(password);
		
		try{
			if(loginDao.validate(loginBean)){
				HttpSession session = request.getSession();
//				session.setAttribute("username", username);
				response.sendRedirect("Loginsuccess.jsp");
			}else{
				HttpSession session = request.getSession();
//				session.setAttribute("user", username);
				response.sendRedirect("Login.jsp");
			}
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}
		
	}

}
