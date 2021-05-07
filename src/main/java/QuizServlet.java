import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/")
public class QuizServlet   extends HttpServlet {




    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session=req.getSession();
        Quiz quiz=new Quiz();
        session.setAttribute("quiz",quiz);
        session.setAttribute("questionNumber",0);
        resp.setContentType("text/html;charset=UTF-8");
        // layout
        PrintWriter printWriter=resp.getWriter();
        String style="<link rel='stylesheet' type='text/css' href='src/main/resources/css/stylecss.css'>";


        printWriter.print("<html> <head><title>" +
                " Home page" +
                "</title>" +
                style+
                "</head>");
       printWriter.print("<body>");
       printWriter.println("<div ><h1>The Number Quiz</h1>");
        printWriter.println();

        printWriter.print("<p>Your current score is : "+(Integer)session.getAttribute("questionNumber") +"</p>");

        printWriter.println();
        printWriter.println("<p>Guess the next number in the sequence</p>");

        printWriter.print("</div>");
        printWriter.print("</body></html>");




    }




    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }



}
