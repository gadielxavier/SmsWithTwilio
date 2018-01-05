

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;

/**
 * Servlet implementation class TwilioSms
 */
@WebServlet("/TwilioSms")
public class TwilioSms extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			 throws ServletException, IOException { 
		
		 		// Find your Account Sid and Auth Token at twilio.com/console
	    		String ACCOUNT_SID = "AC94601d1660f44fce7408d103075bddd8";
	    		String AUTH_TOKEN = "ba924a4fa256bef38e59d48260062415";
	    		
	    		Twilio.init(ACCOUNT_SID, AUTH_TOKEN);

	            Message message = Message
	            		.creator(new PhoneNumber(request.getParameter("callTo")), // to
	                            new PhoneNumber(request.getParameter("callFrom")), // from
	                            request.getParameter("callText"))
	                   .create();

			 	// reading the user input  
			 	PrintWriter out = response.getWriter();
			 	out.print(message.getSid());
			 }

}
