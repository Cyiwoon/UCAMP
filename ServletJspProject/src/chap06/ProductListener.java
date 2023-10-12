
package chap06;

import javax.servlet.*;
/**
 * @author ������п� 
 *
 */
public class ProductListener implements ServletContextListener {
    
    public void contextInitialized( ServletContextEvent sce ) {
        ServletContext context = sce.getServletContext();
        
        String str = context.getInitParameter( "myName" );
        context.setAttribute( "myName", str );
      
        context.setAttribute( "product1", "�����2" );   
        context.setAttribute( "product2", "��Ź��" );
        context.setAttribute( "product3", "���ڷ���" );   
        
        System.out.println( "ProductListener.." );
        System.out.println( "context�� ���۵Ǿ����ϴ�.." );   
        System.out.println( "myName is " +  (String)context.getAttribute( "myName" ) );  
  }     
  public void contextDestroyed( ServletContextEvent sce ) {
        System.out.println( "context�� ����Ǿ����ϴ�.." );
 }   
}

