package orders;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class CustomerMapper implements RowMapper<Customer> {

	@Override
	public Customer mapRow(ResultSet rs, int rowNum) throws SQLException {
		Customer cr = new Customer();

		cr.setCustomerID(rs.getInt(1));
		cr.setName(rs.getString(2));
		cr.setEmail(rs.getString(3));
		cr.setPhone(rs.getString(4));
		cr.setDate((rs.getDate(5)).toString());
		cr.setAddressID(rs.getInt(6));
		return cr;
	}

}
