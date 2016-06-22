package hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

@Component
public class EmployeeDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	
	private static final RowMapper<Employee> employeeRowMapper = new EmployeeRowMapper();
	
	public int saveEmployee(Employee e) {
		String query = "insert into employee values( '" + e.getId() + "','" + e.getName() + "','" + e.getSalary()
				+ "')";
		System.out.println("employee " + e.getId() + "created successfully");
		return jdbcTemplate.update(query);
	}

	public int updateEmployee(Employee e) {
		String query = "update employee set name='" + e.getName() + "',salary='" + e.getSalary() + "' where id='"
				+ e.getId() + "' ";
		System.out.println("Employee " + e.getId() + " got Updated successfully");
		return jdbcTemplate.update(query);
	}

	public int deleteEmployee(Employee e) {
		String query = "delete from employee where id='" + e.getId() + "' ";
		System.out.println("Employee " + e.getId() + " got deleted successfully");
		return jdbcTemplate.update(query);
	}

	public Employee getEmployee(Employee e) {
		String query = "select * from employee where id='" + e.getId() + "' ";
         Employee emp = jdbcTemplate.queryForObject(query, employeeRowMapper);
		return emp;
	}

}