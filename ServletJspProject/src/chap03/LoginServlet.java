
package chap03;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class LoginServlet extends HttpServlet {

    public void doGet( HttpServletRequest req, HttpServletResponse res ) throws ServletException, IOException {

        generateResponse( req, res );
    }
    
    public void doPost( HttpServletRequest req, HttpServletResponse res ) throws ServletException, IOException {
        generateResponse( req, res );
    }
    
    public void generateResponse( HttpServletRequest req, HttpServletResponse res )throws ServletException, IOException {
        res.setContentType( "text/html;charset=euc-kr" );

        PrintWriter out = res.getWriter();
        out.println( "<html>" );
        out.println( "<head>" );
        out.println( "<title>�α��� ���</title>" );
        out.println( "</head>" );
        out.println( "<body>" );

        /* login.html �� �� �����Ϳ��� ����ڰ� �̸��� �н����� �� �� �Է��Ͽ�����,
         * XXX �� ȯ���մϴ�. ��� �޽����� �ϳ��� �Է��� ���� �ʾ�����,
         * �̸� �Ǵ� �н����尡 �Էµ��� �ʾҽ��ϴ�. ��� �޽����� Ŭ���̾�Ʈ�� ��������
         *  ����ϵ��� �ϴ� Servlet�� �ۼ�
         */
        String name = req.getParameter( "name" );
        String pass = req.getParameter( "pass" );
        
        if ( ( name == null || name.equals("") ) || ( pass == null || pass.equals("")) ) {
            out.println( "�̸� �Ǵ� �н����尡 �Էµ��� �ʾҽ��ϴ�" );
        } else {
            out.println( name + "�� ȯ���մϴ�." );
        }
        
        out.println( "</body>" );
        out.println( "</html>" );
        out.close();
    }
}
