// Import section
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

// Hello World
public class com.jcmeynard.HelloWorld extends HttpServlet {

    public void init() throws ServletException
    {
	// Do nothing
    }

    public void doGet(HttpServletRequest request,
		      HttpServletReponse reponse)
		throws ServletException, IOException
    {
	// response type
	reponse.setContentType("text/html");

	// Body
	PrinterWriter out = reponse.getWriter();
	out.println("<h1>Hello World</h1>");
    }

    public void destroy()
    {
	// do nothing
    }

}
