package MyPackage;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

 
@WebServlet("/calserv")
public class Calserv extends HttpServlet {
	 
	private static final long serialVersionUID = 1L;
	private String[] joke = 
		{
	        "Why do Java developers wear glasses? Because they don't C#!",
	        "I told my computer I needed a break, and now it won't stop sending me Kit Kat bars.",
	        "Why don't programmers like nature? It has too many bugs.",
	        "How many programmers does it take to change a light bulb? None, it's a hardware problem.",
	         
	    };
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		
		
		
		 PrintWriter out=response.getWriter(); 
		
		 String str1=request.getParameter("num1");
		 String str2=request.getParameter("num2");
		 String str3=request.getParameter("btn1");

		 
		 int a=Integer.parseInt(str1);
		 int b=Integer.parseInt(str2);
		 int Ans;
		 
		 if(str3.equals("1"))Ans = a+b ;
		  
		 else if(str3.equals("2")) Ans = a-b ; 
		 
		 else if(str3.equals("3"))Ans = a*b ;
		 
		 else Ans = a/b ;
		 
		 int randomIndex = (int) (Math.random() * joke.length);
	     String randomJoke = joke[randomIndex];
		 
		 response.sendRedirect("My.jsp?Ans="+Ans+"&joke="+randomJoke);
		 
		 
		  
    }

	 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
	  doGet(request, response);
	}

}
