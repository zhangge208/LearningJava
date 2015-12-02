package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Date;
/**
 * 
 * @author zhangge
 *
 */
public class TestCollection {
	//Collection c;
	
	public static void main(String[] args) {
		List lst = new ArrayList();
		lst.add("asdf");
		lst.add(new Date());
		lst.add(1234);
		System.out.println(lst.size()); 

	}
	
	
	
	
}
