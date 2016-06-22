package itemview;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import org.springframework.stereotype.Component;

@Component
public class ViewallDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;


	public List<Map<String, Object>> getallItem(Item e) {
		return this.jdbcTemplate.queryForList("select * from item_menu where status='available'");
	}

}