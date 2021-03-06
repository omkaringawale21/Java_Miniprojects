package Java_Project5;

import java.util.Properties;
import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.Authenticator;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
  
// Problem Statement :- Send Email using Java Program

public class EmailSending {

	public static void main(String[] args) {
		
		// Email ID of Recipient i.e. Receiver
		String reciver = "omkaringawale21@gmail.com";
		
		// Email ID of Sender
		String sender = "omkaringawale2108@gmail.com";
				
		Properties props = new Properties();
	    props.put("mail.smtp.host", "smtp.gmail.com");
	    props.put("mail.smtp.port", "465");
	    props.put("mail.smtp.auth", "true");
	    props.put("mail.smtp.starttls.enable", "true");
	    props.put("mail.smtp.socketFactory.port", "465");
        props.put("mail.smtp.socketFactory.class",
            "javax.net.ssl.SSLSocketFactory");
	    
	    // Authentication auth
        Authenticator auth = new Authenticator() {
            public PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(sender, "Omkar@@@21");
            }
        };
	    		
		// Creating Session object to get properties
		//Session session = Session.getDefaultInstance(props, auth);
        Session session = Session.getInstance(props, new javax.mail.Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(sender, "Omkar@@@21");
            }
        });
		
		try{
			
			// MimeMessage object
			Message message = new MimeMessage(session);
			
			// Set from Field: Adding Senders email to from field
			message.setFrom(new InternetAddress(sender));
			
			// Set to Field: Adding Recipients email to from field
			message.addRecipient(Message.RecipientType.TO, new InternetAddress(reciver));
			
			// Set Subject: subject of the email
			message.setSubject("This is Subject");
			
			// Creating MimeMessage Object
//			BodyPart mb1 = new MimeBodyPart();
//			mb1.setText("This is a body of the email");
			
			// Creating MimeMessage Object
//			BodyPart mb2 = new MimeBodyPart();
//			String filename = "attachment.txt";
//			DataSource source = new FileDataSource(filename);
//			mb2.setDataHandler(new DataHandler(source));
//			mb2.setFileName(filename);
			
			// Creating MultiPart Object
//			Multipart multipartObject = new MimeMultipart();
//			multipartObject.addBodyPart(mb1);
//			multipartObject.addBodyPart(mb2);
			
			// Set body of the email
//			message.setContent(multipartObject);
			
			// Set body of the email
			message.setText("This is a test email");
			
			// Send email
			Transport.send(message);
			System.out.println("Mail successfully send!");
			
		}catch(MessagingException mex){
			System.out.println("Fail to send Mail! \n");
			mex.printStackTrace();
		}
			
	}

}