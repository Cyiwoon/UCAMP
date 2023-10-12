package chap09;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class EnrollServlet extends HttpServlet {
    public void doPost( HttpServletRequest req, HttpServletResponse res ) throws IOException,
            ServletException {
             
        boolean result = false;

        // 1. ����ڷκ��� ���� request�� ó���Ѵ�.
        Member member = processFormData( req );

        // 2. biz logic �����Ѵ�.
        MemberService service = new MemberService();
        result = service.register(member);
        // 3. view �����Ѵ�. (������ �� �Ǿ�����, ������ �ȵǾ������)
        if ( result ) {
            RequestDispatcher view = req.getRequestDispatcher("/result.jsp");
            req.setAttribute("member", member);
            view.forward(req, res);
        } else {
            res.sendRedirect("/error.html");
        }

    }

    public Member processFormData( HttpServletRequest req ) {

        Member member = new Member();
        try {
            req.setCharacterEncoding( "euc-kr" );
            member.setTfMemberID( req.getParameter( "tfMemberID" ) );
            member.setTfName( req.getParameter( "tfName" ) );
            member.setTfPassword( req.getParameter( "tfPassword" ) );
            member.setTfAddress( req.getParameter( "tfAddress" ) );
            member.setTfPhone( req.getParameter( "tfPhone" ) );
            member.setSelPasswordQuestion( req.getParameter( "selPasswordQuestion" ) );
            member.setTfPasswordAnswer( req.getParameter( "tfPasswordAnswer" ) );
            member.setRdMarriage( req.getParameter( "rdMarriage" ) );
            member.setChkHobby( makeHobby( req.getParameterValues( "chkHobby" ) ) );
            member.setEtc( req.getParameter( "etc" ) );
        } catch ( Exception e ) {
            System.out.println( e );
        }
        return member;
    }

    public String makeHobby( String[] inputValues ) {

        String record = "";
        if ( inputValues != null ) {
            for ( int inx = 0 ; inx < inputValues.length ; inx++ ) {
                if ( inx != 0 )
                    record += " ";
                record += inputValues[inx];
            }
        }
        return record;
    }

}
