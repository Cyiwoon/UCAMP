
package chap02;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class LoginServlet extends HttpServlet {

    public void doGet( HttpServletRequest req, HttpServletResponse res ) throws ServletException, IOException {

        res.setContentType( "text/html;charset=euc-kr" );

        PrintWriter out = res.getWriter();
        out.println( "<html>" );
        out.println( "<head>" );
        out.println( "<title>�α��� ���</title>" );
        out.println( "</head>" );
        out.println( "<body>" );
        out.println( "ȫ�浿�� ȯ���մϴ�." );
        out.println( "</body>" );
        out.println( "</html>" );
        out.close();
    }
}
