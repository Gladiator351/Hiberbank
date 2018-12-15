package dao;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class CustomerMapper implements RowMapper<Customer> {


    @Override
    public Customer mapRow(ResultSet result, int i) throws SQLException {
    	Customer cust = new Customer();
		cust.setId(result.getInt(1));
		cust.setUsername(result.getString(2));
		cust.setPassword(result.getString(3));
		cust.setName(result.getString(4));
		cust.setPhone(result.getString(5));
		cust.setAddress(result.getString(6));
		cust.setStatus(result.getString(7));
		return cust;
    }
}
