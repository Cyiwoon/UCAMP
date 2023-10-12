package chap12.dao;


import java.sql.*;

import common.DBService;

import chap12.entity.Member;


public class MemberDAO {
    public boolean insertMember(Member member) {
        boolean result = false;
        
        //2. DBService���� connection ���
        Connection conn = DBService.getConnection();
             
        try {          
            //3. Statememt ��ü �����ϱ�
            Statement stmt = conn.createStatement();
            
            //4. SQL�������ϱ�
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
            
            int rowcnt =  stmt.executeUpdate( query );
            
            //5. ��� ���� 
            if ( rowcnt > 0 )
                result = true;
            else
                System.out.println ( "insert�� �����߻�" );   
              
            stmt.close();
         
        }
        catch( Exception e )
        {
            System.out.println( e );
        }
        finally
        {
            //6. DBService���� connection ��ȯ�ϱ�
            DBService.releaseConnection( conn );
        }
        
        return result;
    }
}
