import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.Servlet;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;

/**
* Servlet implementation class InterfaceDemo
*/
@WebServlet("/InterfaceDemo")
public class InterfaceDemo implements Servlet {
        
        ServletConfig config=null;
          public void init(ServletConfig config){
              this.config=config;
              System.out.println("Initialization complete");
           }

           public void service(ServletRequest req,ServletResponse res)
           throws IOException,ServletException{
               res.setContentType("text/html");
               PrintWriter pwriter=res.getWriter();
               pwriter.print("<html>");
               pwriter.print("<body>");
               pwriter.print("In the service() method<br>");
               pwriter.print("</body>");
               pwriter.print("</html>");
           }
           public void destroy(){
               System.out.println("In destroy() method");
           }
           public ServletConfig getServletConfig(){
               return config;
           }
           public String getServletInfo(){
               return "This is a sample servlet info";
           }
}
           
