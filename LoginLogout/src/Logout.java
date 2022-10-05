import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

/**
* Servlet implementation class Logout
*/
@WebServlet("/Logout")
public class Logout extends HttpServlet {
        private static final long serialVersionUID = 1L;
       
    /**
* @see HttpServlet#HttpServlet()
*/
    public Logout() {
        super();
        // TODO Auto-generated constructor stub
    }

        /**
         * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
         */
        protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
                // TODO Auto-generated method stub
                HttpSession session=request.getSession();  
                session.invalidate();           
                PrintWriter out = response.getWriter();
                out.println("<html><body>");
            out.println("Logged out of session.<br>");
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
