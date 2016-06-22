package login;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class AdminRowMapper implements RowMapper<Admin> {

	@Override
	public Admin mapRow(ResultSet rs, int rowNum) throws SQLException {
		Admin emp = new Admin();
		emp.setAdminName(rs.getString("ADMIN_NAME"));
		emp.setAdminPassword(rs.getString("ADMIN_PWD"));
		return emp;
	}

}
