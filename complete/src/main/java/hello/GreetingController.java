package hello;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

	@Autowired
	private EmployeeDao employeeDao;
	
    private static final String template = "Ramesh , %s!";
    
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/greeting")
    public Greeting greeting(@RequestParam(value="name", defaultValue="Welcome to Express") String name) {
        return new Greeting(counter.incrementAndGet(),
                            String.format(template, name));
    }
    
    @RequestMapping("/employeeview")
    public Employee employeeview(@RequestParam(value="id"/*, defaultValue="251746"*/) int id/* ,@RequestParam(value="name", defaultValue="Manikandan") String name ,@RequestParam(value="salary", defaultValue="500") long salary*/) {
    	Employee e =new Employee(id);
    	return employeeDao.getEmployee(e);
    	//return new Employee(id);
    }
    @RequestMapping("/employeedelete")
    public Employee employeedelete(@RequestParam(value="id") int id /*,@RequestParam(value="name") String name ,@RequestParam(value="salary") long salary*/) {
    	Employee e =new Employee(id);
    	employeeDao.deleteEmployee(e);
    	return new Employee(id);
    }
     @RequestMapping("/employeeadd")
    public Employee employeeadd(@RequestParam(value="id") int id ,@RequestParam(value="name"/*, defaultValue="Manikandan"*/) String name ,@RequestParam(value="salary"/*, defaultValue="500"*/) long salary) {
    	Employee e =new Employee(id,name,salary);
    	employeeDao.saveEmployee(e);
    	return new Employee(id,name,salary);
    }
     @RequestMapping("/employeemodify")
     public Employee employeemodify(@RequestParam(value="id") int id ,@RequestParam(value="name") String name ,@RequestParam(value="salary", defaultValue="500") long salary) {
     	Employee e =new Employee(id,name,salary);
     	employeeDao.updateEmployee(e);
     	return new Employee(id,name,salary);
     }
    

}
