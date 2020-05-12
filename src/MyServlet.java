import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

@javax.servlet.annotation.WebServlet(name = "MyServlet")
public class MyServlet extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

        HttpSession session = request.getSession();

        Integer count = (Integer) session.getAttribute("count");

        if (count == null) {
            session.setAttribute("count", 1);
            count = 1;
        } else {
            count++;
            session.setAttribute("count", count);
        }

        PrintWriter writer = response.getWriter();
        writer.println("<html>");
        writer.println("<head>");
        writer.println("<link href=\"test.css\" rel=\"stylesheet\" type=\"text/css\">");
        writer.println("</head>");
        String name = request.getParameter("name");
        if (name != null) {
            writer.println("<p>Hello, " + name + "</p>");
        } else {
            writer.println("<p>Hello World!</p>");
        }
        writer.println("<p>Count: " + count + "</p>");
        writer.println("</html>");

//        response.sendRedirect("first-jsp");
        /*RequestDispatcher requestDispatcher = request.getRequestDispatcher("first-jsp");
        requestDispatcher.forward(request, response);*/
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("http://wikipedia.org");
        requestDispatcher.forward(request, response);
    }
}
