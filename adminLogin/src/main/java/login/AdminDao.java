package login;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

@Component
public class AdminDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	
	private static final RowMapper<Admin> adminRowMapper = new AdminRowMapper();
	
	public int addAdmin(Admin e) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
	   	 Date date = new Date();
	   	 String time =dateFormat.format(date);
		String query = "insert into cdcadmin values( '" + e.getAdminName() + "','" + e.getAdminPassword()+"','"+time+ "')" ;
		System.out.println("addAdmin query  "+query);
		return jdbcTemplate.update(query);
	}


	public Admin validateAdmin(Admin e) {
		String query = "select * from cdcadmin where ADMIN_NAME='" + e.getAdminName()+"'";
		System.out.println("validate query  "+query);
         Admin admin = jdbcTemplate.queryForObject(query, adminRowMapper);
		return admin;
	}

}