package orders;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class AddressMapper implements RowMapper<Address> {

	@Override
	public Address mapRow(ResultSet rs, int rowNum) throws SQLException {

		Address ac = new Address();

		ac.setAddressID(rs.getInt(1));
		ac.setStreet(rs.getString(2));
		ac.setCity(rs.getString(3));
		ac.setState(rs.getString(4));
		ac.setPostalCode(rs.getString(5));
		return ac;
	}

}
