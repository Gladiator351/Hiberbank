package dao;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class CustomerDaoServices {
	
	public int addNewCustomer(Customer cust)
	{
		JdbcTemplate jtemp = (JdbcTemplate) new ClassPathXmlApplicationContext("spring-config.xml").getBean("jt");
		return jtemp.update("insert into customer_hiberbank values(?,?,?,?,?,?,?)", 
				new Object[] {cust.getId(),
						cust.getUsername(),
						cust.getPassword(),
						cust.getName(), 
						cust.getPhone(), 
						cust.getAddress(),
						cust.getStatus()},
				new dao.CustomerMapper());
	}

}
