package order;

import java.util.ArrayList;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
/*import org.springframework.web.bind.annotation.RequestParam;*/
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {

	@Autowired
	private OrderDao orderDao;

	@RequestMapping(value = "/order/getAllOrders", method = RequestMethod.POST, produces = "application/json", consumes = "application/json")
	public List<Order> itemviewall(@RequestBody List<Integer> itemIdList)  {
		List<Order> priceMapList = new ArrayList<>();
		try{
		for (Integer integer : itemIdList) {
			Order e = new Order(integer);
			Order retrievedOrder = orderDao.getorderedItem(e);
			if (retrievedOrder != null) {
				priceMapList.add(retrievedOrder);
			}
			
		}
		}catch(Exception ex){
			System.out.println("Exception occured " + ex);
			throw new RuntimeException("Data is Empty");
		}

		return priceMapList;

	}

}
