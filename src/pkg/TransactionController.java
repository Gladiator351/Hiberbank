package pkg;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import dao.Transaction;
import dao.TransactionDaoServices;

@Controller
public class TransactionController {
	
	@RequestMapping(value="/viewconfirmation")
	public String viewconfirmation()
	{
		return "viewconfirmation";
	}	
	
	@RequestMapping(value="/newtransactionform")
	public String viewnewtransactionform(ModelMap map)
	{
		map.addAttribute("command", new Transaction());
		return "transactionform";
	}
	
	@RequestMapping(value="/savetransaction")
	public String save(@ModelAttribute("trans") Transaction trans)
	{
		if(new TransactionDaoServices().addNewTransaction(trans)==1)
			return "redirect:/viewconfirmation";
		else
			return "error";
	}
}
