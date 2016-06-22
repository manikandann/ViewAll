package order;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class OrderRowMapper implements RowMapper<Order> {

	@Override
	public Order mapRow(ResultSet rs, int rowNum) throws SQLException {
		Order item = new Order();
		item.setItemId((rs.getInt("ITEM_ID")));
		item.setItemName((rs.getString("ITEM_NAME")));
		item.setItemPrice((rs.getInt("ITEM_PRICE")));
		return item;
	}

}
