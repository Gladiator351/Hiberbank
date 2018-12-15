package dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class TransactionMapper implements RowMapper<Transaction> {

	@Override
	public Transaction mapRow(ResultSet result, int arg1) throws SQLException {
		Transaction trans = new Transaction();
		trans.setTid(result.getInt(1));
		trans.setTime(result.getString(2));
		trans.setWithdrawal(result.getInt(3));
		trans.setDeposit(result.getInt(4));
		trans.setAmount(result.getInt(5));
		return trans;
	}

}
