package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.CustomerDAO;
import vo.CustomerVO;

/**
 * Servlet implementation class UserListServlet
 */
//@WebServlet("/UserList")
public class CustomerListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    CustomerDAO customerDao;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CustomerListServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    
    @Override
    public void init(ServletConfig config) throws ServletException {
    	// TODO Auto-generated method stub
    	System.out.println(">> init ");
    	String driver = config.getInitParameter("driverClass");
    	String url = config.getInitParameter("dbUrl");
    	String username = config.getInitParameter("dbUsername");
    	String password = config.getInitParameter("dbPassword");
    	
    	customerDao = new CustomerDAO(driver, url, username, password);

    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println(">> doGet");
		//response(����) �����͸� utf-8�� ���ڵ�
		response.setContentType("text/html;charset=UTP-8");
		//userDAO�� ȣ���ؼ� DB �����͸� ��������
		List<CustomerVO> customerList = customerDao.getCustomerList();
		//Request ��ü�� UserList�� �����ϱ�
		request.setAttribute("users", customerList);
		//RequestDispatcer �����ϱ�
		 RequestDispatcher dispatcher = request.getRequestDispatcher("customerList.jsp");
		 //userList.jsp �������� �������ϱ�
		 dispatcher.forward(request, response);
	}
	
	@Override
	public void destroy() {
		System.out.println(">> destroy");
		// TODO Auto-generated method stub
		super.destroy();
	}

}
