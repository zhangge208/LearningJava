package Store;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
//import java.util.Date;
import java.util.List;

public class store {
	public static void main(String[] args) throws ParseException {
		//一个对象对应一行记录，一个类对应一个表结构
		Employee e = new Employee();
		e.setId(0301);
		e.setName("aaa");
		e.setSalary(5000);
		e.setDepartment("project");
		String strDate ="2007-10";
		DateFormat format = new SimpleDateFormat("yyyy-MM");
		e.setHireDate(format.parse(strDate));
		Employee e1 = new Employee(0302, "zg", 5000,"dev","2006-10");
		Employee e2 = new Employee(0303, "sdf", 5000,"apap","2013-11");
		
		List<Employee> list = new ArrayList<Employee>();
		
		list.add(e);
		list.add(e1);
		list.add(e2);
		
	
		
	}
}
