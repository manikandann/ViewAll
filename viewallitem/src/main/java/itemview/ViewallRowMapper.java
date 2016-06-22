package itemview;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class ViewallRowMapper implements RowMapper<Item> {

	@Override
	public Item mapRow(ResultSet rs, int rowNum) throws SQLException {
		Item item = new Item();
		item.setItemId((rs.getInt("ITEM_ID")));
		item.setItemName((rs.getString("ITEM_NAME")));
		item.setItemPrice((rs.getInt("ITEM_PRICE")));
		return item;
	}

}
