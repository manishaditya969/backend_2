import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
* Servlet implementation class NameServlet
*/
@WebServlet("/NameServlet")
public class NameServlet extends HttpServlet {
        private static final long serialVersionUID = 1L;
       
    /**
* @see HttpServlet#HttpServlet()
*/
    public NameServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

        /**
         * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
         */
        protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
                // TODO Auto-generated method stub
                String fname = request.getParameter("fname");
                String lname = request.getParameter("lname");
                
                PrintWriter out = response.getWriter();
            out.println("<html><body>");
            out.println("Your full name is " + fname + " " + lname);
            out.println("</body></html>");
        }

        /**
         * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
         */
        protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
                // TODO Auto-generated method stub
                doGet(request, response);
        }

}
