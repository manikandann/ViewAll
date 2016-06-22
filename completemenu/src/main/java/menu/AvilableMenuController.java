package menu;

import java.text.SimpleDateFormat;
import java.util.Date;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AvilableMenuController {
	
	@Autowired
	private AvilableMenuDao avilableMenuDao;
	
    
    @RequestMapping("/itemview")
    public AvilableMenu itemView(@RequestParam(value="itemId") int itemId) {
    	AvilableMenu e =new AvilableMenu(itemId);
    	return avilableMenuDao.getItem(e);
    	
    }
    @RequestMapping("/itemdelete")
    public AvilableMenu itemdelete(@RequestParam(value="itemId") int itemId) {
    	AvilableMenu e =new AvilableMenu(itemId);
    	avilableMenuDao.deleteItem(e);
    	return new AvilableMenu(itemId);
    }
     @RequestMapping("/itemadd")
    public AvilableMenu itemAdd(/*@RequestParam(value="itemId") int itemId ,*/@RequestParam(value="itemName") String itemName ,@RequestParam(value="itemPrice") double itemPrice,@RequestParam(value="status") String status) {
         int itemId=avilableMenuDao.lastid()+1;
         System.out.println("item id is " + itemId);
    	 SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
    	 Date date = new Date();
    	 String time =dateFormat.format(date);
    	 AvilableMenu e =new AvilableMenu(itemId,itemName,itemPrice,time,status);
    	avilableMenuDao.addItem(e);
    	return new AvilableMenu(itemId,itemName,itemPrice,time,status);
    }
     @RequestMapping("/itemmodify")
     public AvilableMenu itemModify(@RequestParam(value="itemId") int itemId ,@RequestParam(value="itemName") String itemName ,@RequestParam(value="itemPrice") double itemPrice,@RequestParam(value="status" , defaultValue="avilable") String status) {
     	AvilableMenu e =new AvilableMenu(itemId,itemName,itemPrice,status);
     	avilableMenuDao.updateItem(e);
     	return new AvilableMenu(itemId,itemName,itemPrice,status);
     }
    

}
