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

import dao.UserDAO;
import vo.UserVO;

/**
 * Servlet implementation class UserListServlet
 */
//@WebServlet("/UserList")
public class UserListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    UserDAO userDao;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserListServlet() {
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
    	
    	userDao = new UserDAO(driver, url, username, password);
//    	System.out.println(driver);
//    	System.out.println(url);
//    	System.out.println(username);
//    	System.out.println(password);
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println(">> doGet");
		//response(응답) 데이터를 utf-8로 인코딩
		response.setContentType("text/html;charset=UTP-8");
		//userDAO를 호출해서 DB 데이터를 가져오기
		List<UserVO> userList = userDao.getUserList();
		//Request 객체에 UserList를 저장하기
		request.setAttribute("users", userList);
		//RequestDispatcer 생성하기
		 RequestDispatcher dispatcher = request.getRequestDispatcher("userList.jsp");
		 //userList.jsp 페이지로 포워딩하기
		 dispatcher.forward(request, response);
	}
	
	@Override
	public void destroy() {
		System.out.println(">> destroy");
		// TODO Auto-generated method stub
		super.destroy();
	}

}
