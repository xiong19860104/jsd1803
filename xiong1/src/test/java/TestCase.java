

import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import dao.TripDAO;
import entity.Trip;

public class TestCase {
	
	  /**
     * 查询所有部门
     */
    @Test
  
public static void main(String[] args){

    	String config = 
				"applicationContext.xml";
		ApplicationContext ac =
		new ClassPathXmlApplicationContext(
					config);
	     TripDAO	dao = ac.getBean("tripDAO",
				TripDAO.class);
	     List<Trip> t=dao.find();
	      //System.out.println(t);
	      t=dao.findByPage(1, 2);
	      System.out.println(t);
    }
}
