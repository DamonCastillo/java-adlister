import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


@WebServlet(name = "testServlet", urlPatterns = "/count")
public class testServlet extends HttpServlet {
    int count;

    public void init() {
        count = 0;
    }

    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
       if(req.getServletPath().equals("name")) {
           String firstName = req.getParameter("name");
           res.setContentType("text/html");
           PrintWriter out = res.getWriter();
           out.println("<h1>Hello, " + firstName + "<h1>");
       } else{
           res.setContentType("text/html");
           PrintWriter out = res.getWriter();
           out.println("Hello World");
       }
          String reset = req.getParameter("/reset");
        if(reset == null)
        {
            count++;
        } else {
            count = 0;
            res.sendRedirect("/count");

        }

            //Counter Code
            res.setContentType("text/html");
            PrintWriter out =res.getWriter();



            String title = "Total Number of Visits";
            String docType = "<!doctype html public \"-//w3c//dtd html 4.0 " + "transitional//en\">\n";

            out.println(docType +
                    "<html>\n" +
                    "<head><title>" + title + "</title></head>\n" +
                    "<body bgcolor = \"#f0f0f0\">\n" +
                    "<h1 align = \"center\">" + title + "</h1>\n" +
                    "<h2 align = \"center\">" + count + "</h2>\n" +
                    "</body> " +
                    "</html>"

            );
        }
    }



