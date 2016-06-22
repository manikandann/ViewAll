package menu;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

@Component
public class AvilableMenuDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	
	private static final RowMapper<AvilableMenu> avilableMenuRowMapper = new AvilableMenuRowMapper();
	
	public int addItem(AvilableMenu e) {
		String query = "insert into item_menu values( '" + e.getItemId() + "','" + e.getItemName() + "','" + e.getItemPrice()
		+ "','" + e.getTime()+ "','"+ e.getStatus()	+ "')";
		System.out.println("Item " + e.getItemId() + "created successfully");
		return jdbcTemplate.update(query);
	}

	public int updateItem(AvilableMenu e) {
		String query = "update item_menu set item_name='" + e.getItemName() + "',item_price='" + e.getItemPrice() + "',status='" + e.getStatus() + "' where item_id='"
				+ e.getItemId() + "' ";
		System.out.println("Item " + e.getItemId() + " got Updated successfully");
		System.out.println(query);
		
		return jdbcTemplate.update(query);
	}

	public int deleteItem(AvilableMenu e) {
		String query = "delete from item_menu where item_id='" + e.getItemId() + "' ";
		System.out.println("Item " + e.getItemId() + " got deleted successfully");
		return jdbcTemplate.update(query);
	}

	public AvilableMenu getItem(AvilableMenu e) {
		String query = "select * from item_menu where item_id='" + e.getItemId() + "' ";
         AvilableMenu item = jdbcTemplate.queryForObject(query, avilableMenuRowMapper);
		return item;
	}

	public int lastid(){
		String query ="select max(item_id) from item_menu";
		return jdbcTemplate.queryForObject(query, Integer.class);
	}
	
}