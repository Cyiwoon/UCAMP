
package chap07;

import javax.servlet.*;
import javax.servlet.http.*;

import java.io.*;
import java.util.ArrayList;


/**
 * <pre>
 *  ����� �α��� �� ���Ǵ� ���� Ŭ����
 * </pre>
 * 
 * @author LG CNS ������п�
 * @version 1.0, 2006/01/01
 */
public class LoginServlet extends HttpServlet {
    /**
     * servlet service �޼ҵ�. �ùٸ� �α������� Ȯ���ϰ� �����Ǹ� Session�� �����Ѵ�. �ش��ϴ� ȭ������ �����ش�.
     * 
     * @param request HttpServletRequest
     * @param response HttpServletResponse
     */
    public void doPost( HttpServletRequest request, HttpServletResponse response )
            throws IOException, ServletException {

        request.setCharacterEncoding( "euc-kr" );
        response.setContentType( "text/html;charset=euc-kr" );

        String id = request.getParameter( "loginId" );
        String pw = request.getParameter( "password" );
        System.out.println( "����� ���̵�  : " + id + "<br>" );
        HttpSession session = request.getSession();

        session.setAttribute( "loginId", id );
        session.setAttribute( "password", pw );

        PrintWriter out = response.getWriter();
        out.println( "<html><body>" );
        out.println( "�α��� �Ǿ����ϴ� <br>" );
        out.println( "<a href=/info>My Information</a>" );
        out.println( "</body></html>" );
        out.close();

    }
}
