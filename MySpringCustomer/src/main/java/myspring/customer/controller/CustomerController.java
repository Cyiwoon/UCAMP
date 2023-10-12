package myspring.customer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import myspring.customer.service.CustomerService;
import myspring.customer.vo.CustomerVO;

@Controller
public class CustomerController {
	@Autowired
	private CustomerService customerService;
	
	public CustomerController() {
		System.out.println(this.getClass().getName()+"생성자 호출됨");
	}
	@RequestMapping("/customerList.do")
	public ModelAndView customerList() {
		List<CustomerVO> customerVOList = customerService.getCustomerList();
		//ModelAndView(viewName, keyName, vlaueObject)
		return new ModelAndView("customerList", "customerList", customerVOList);
	}
	
	

}
