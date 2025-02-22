// Import required java libraries
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;


public class Hello extends HttpServlet {


   public void doGet(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {


      response.setContentType("text/html");

      message = "============";
      PrintWriter out = response.getWriter();
      out.println("<h1>" + message + "</h1>");
   }
}
