package orders;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class OrdersMapper implements RowMapper<Product> {

	public Product mapRow(ResultSet rs, int i) throws SQLException {
		Product pdt = new Product();

		pdt.setProductID(rs.getInt("prod_id"));
		pdt.setProductName(rs.getString("name"));
		pdt.setDescription(rs.getString("description"));
		pdt.setHsnCode(Integer.parseInt(rs.getString("hsncode")));
		pdt.setImage(rs.getString("image_url"));
		pdt.setCategory(rs.getString("category"));
		pdt.setPrice(rs.getDouble("price"));

		return pdt;
	}
}
