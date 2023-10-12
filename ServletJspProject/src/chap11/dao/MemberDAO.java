package chap11.dao;

import chap11.entity.Member;
import common.DBService;
import java.sql.*;

public class MemberDAO {
    public boolean insertMember(Member member) {
        boolean result = false;
        int rowcnt = 0;
        Connection conn = null;
        Statement stmt = null;

        // 1. Connection Pool���� connection ���
        conn = DBService.getConnection();
        try {          
            //2. Statememt ��ü �����ϱ�
            stmt = conn.createStatement();
            
            //3. Query �ۼ�
            String query = "INSERT INTO CS_MEMBER VALUES('" + 
                           member.getTfMemberID() + "','" + 
                           member.getTfName() + "','" +
                           member.getTfPassword() + "','" + 
                           member.getTfAddress() + "','" + 
                           member.getTfPhone()  + "','" + 
                           member.getSelPasswordQuestion() + "','" +
                           member.getTfPasswordAnswer() + "','" + 
                           member.getRdMarriage() + "','" +
                           member.getChkHobby()   + "','" + 
                           member.getEtc() +"')";
            
            //4. SQL�������ϱ�
            rowcnt =  stmt.executeUpdate( query );
            
            //5. ��� ó�� 
            if ( rowcnt > 0 )
                result = true;
            else
                System.out.println ( "insert�� �����߻�" );   
         
        }
        catch( Exception e ) {
            System.out.println( e );
        }
        finally {
            // 6. Statement close
            if ( stmt != null ) {
                try {
                    stmt.close();
                } catch ( SQLException e ) {
                    e.printStackTrace();
                }
            } 
            //7. DBService���� connection ��ȯ�ϱ�
            DBService.releaseConnection( conn );
        }
        
        return result;
    }
}
