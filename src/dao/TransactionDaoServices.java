package dao;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class TransactionDaoServices {

	public int addNewTransaction(Transaction trans)
	{
		JdbcTemplate jtemp = (JdbcTemplate)new ClassPathXmlApplicationContext("spring-config.xml").getBean("jt");
		return jtemp.update("insert into hibertrantest values(?,?,?,?,?)",
				new Object[] {trans.getTid(), trans.getTime(), trans.getWithdrawal(), trans.getDeposit(), trans.getAmount()});
	}
	
	public static void main(String s[])
	{
		Transaction trans = new Transaction();
		trans.setTid(2);
		trans.setTime("askhdf");
		trans.setWithdrawal(300);
		trans.setDeposit(200);
		trans.setAmount(100);
		System.out.println(new TransactionDaoServices().addNewTransaction(trans));		
	}
}
