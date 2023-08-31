package orders;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class GSTMapper implements RowMapper<GST> {

	@Override
	public GST mapRow(ResultSet rs, int rowNum) throws SQLException {

		GST gst = new GST();

		gst.setHsncode(rs.getInt(1));
		gst.setGst(rs.getInt(2));
		return gst;
	}
}
