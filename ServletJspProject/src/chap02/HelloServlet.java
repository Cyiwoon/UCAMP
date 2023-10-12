package chap02;

import java.io.*;
import java.util.*;
import javax.servlet.http.*;

public class HelloServlet extends HttpServlet {
    public void doGet( HttpServletRequest request,
            HttpServletResponse response ) throws IOException {

        response.setContentType( "text/html;charset=euc-kr" );
        PrintWriter out = response.getWriter();
        out.println( "<html><html>" );
        out.println( "<title>Hello Servlet</title></head>" );
        out.println( "<body>" );
        out.println( "<b>Hello, World!!! �ȳ�~</b><br>" );
        out.println( "���� �ð��� " + new Date() + "�Դϴ�." );
        out.println( "</body>" );
        out.println( "</html>" );
        out.close();
    }
}
