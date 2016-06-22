package order;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

@Component
public class OrderDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	private static final RowMapper<Order> orderRowMapper = new OrderRowMapper();

	public Order getorderedItem(Order e) {
		return jdbcTemplate.queryForObject(
				"select * from item_menu where status='available' and ITEM_ID ='" + e.getItemId() + "'", orderRowMapper);
	}

}