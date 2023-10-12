
package chap06;

import javax.servlet.*;

public class ProductListListener implements ServletContextListener {

    public void contextInitialized( ServletContextEvent sce ) {

        ServletContext context = sce.getServletContext();
        context.setAttribute( "product1", "�����" );
        context.setAttribute( "product2", "��Ź��" );
        context.setAttribute( "product3", "���ڷ���" );

        String str = context.getInitParameter( "myName" );
        context.setAttribute( "myName", str );

        System.out.println( "ProductListListener.." );
        System.out.println( "contextInit�޼ҵ尡 ����Ǿ���" );
    }

    public void contextDestroyed( ServletContextEvent sce ) {

    }
}
