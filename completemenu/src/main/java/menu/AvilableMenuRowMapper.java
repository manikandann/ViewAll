package menu;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class AvilableMenuRowMapper implements RowMapper<AvilableMenu> {

	@Override
	public AvilableMenu mapRow(ResultSet rs, int rowNum) throws SQLException {
		AvilableMenu item = new AvilableMenu();
		item.setItemId(rs.getInt("ITEM_ID"));
		item.setItemName(rs.getString("ITEM_NAME"));
		item.setItemPrice(rs.getDouble("ITEM_PRICE"));
		item.setTime(rs.getString("Time"));
		item.setStatus(rs.getString("status"));
		return item;
	}

}
