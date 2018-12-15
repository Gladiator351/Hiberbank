package pkg;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import dao.CustomerDaoServices;
import dao.Customer;

@Controller
public class NewCustomerController {
	
	@RequestMapping(value = "insertnewcustomerform")
	public String viewnewcustomerform(ModelMap map)
	{
		map.addAttribute("command", new Customer());
		return "newcustomerform";
	}
	
	@RequestMapping(value = "/")
	public String test()
	{
		return "menu";
	}
	
	@RequestMapping(value = "savecustomerservice")
	public String save(@ModelAttribute Customer cust)
	{
		if(new CustomerDaoServices().addNewCustomer(cust) == 1)
			return "redirect:/";
		else
			return "error";
	}
	
}
