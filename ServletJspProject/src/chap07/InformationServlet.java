
package chap07;

import java.io.*;  
import javax.servlet.*;  
import javax.servlet.http.*; 
import java.util.*;

/**
 * @author ������п� 
 *
 */
public class InformationServlet extends HttpServlet {
    public void doGet( HttpServletRequest req, HttpServletResponse res ) 
                 throws ServletException, IOException {

        req.setCharacterEncoding( "euc-kr" );
        res.setContentType( "text/html;charset=euc-kr" );

        PrintWriter out = res.getWriter();
        out.println( "<html><body>" );
        out.println( "ȸ�� ����<br>" );

        HttpSession session = req.getSession( false );

        if ( session != null ) {
        	String id = (String)session.getAttribute( "loginId" );
        	String pw = (String)session.getAttribute( "password" );
            out.println( "ȸ�� ���̵� : " + id + "<br>" );
            out.println( "��й�ȣ : " + pw + "<br>" );
            out.println( session.getId() );
        } else {
            out.println( "No Session" );
        }
        out.println( "</body></html>" );
        out.close();
    }
}

