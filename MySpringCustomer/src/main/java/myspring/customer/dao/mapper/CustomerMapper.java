package myspring.customer.dao.mapper;
import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import myspring.customer.vo.CustomerVO;


public interface CustomerMapper {
	//@Select("select * from users where userid=#{id}")
	//UserVO selectUserById(@Param("id") String id);
	List<CustomerVO> selectCustomerList();
}