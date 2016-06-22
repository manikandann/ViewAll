package login;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdminController {

	@Autowired
	private AdminDao adminDao;
	


   @RequestMapping("/authenticate")
    public Admin validateAdmin(@RequestParam(value="adminName") String adminName ,String  adminPassword) {
    	try{
    		Admin a =new Admin(adminName,adminPassword);
    	adminPassword= adminDao.validateAdmin(a).getAdminPassword();
    	}
    	catch(Exception e){
    		System.out.println("Exception occured" + e);
    	}
    	 return new Admin(adminName,adminPassword);
    }

     @RequestMapping("/addadmin")
    public Admin addadmin(@RequestParam(value="adminName") String adminName ,@RequestParam(value="adminPassword") String adminPassword ) {
    	Admin a =new Admin(adminName,adminPassword);
    	adminDao.addAdmin(a);
    	return new Admin(adminName,adminPassword);
    }
 

}
