package itemview;


import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ViewallController {

	@Autowired
	private ViewallDao viewallDao;
	
    
    @RequestMapping("/itemviewall")
    public List<Map<String, Object>> itemviewall(){
    	Item e =new Item();
    	
    	return viewallDao.getallItem(e);
    	
    }
  

}
