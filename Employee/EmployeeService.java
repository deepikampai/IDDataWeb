package com.idDataWeb.assessment.Employee;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class EmployeeService {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1 = new Employee(10001, "Rita",12555);
		Employee e2 = new Employee(10002, "Pita",1212);
		Employee e3 = new Employee(10003, "Mita",10253);
		Employee e4 = new Employee(10004, "Sita",10051);
		
//		List<Employee> empList = List.of(e1,e2,e3,e4);
		
		List<Employee> empList = new ArrayList<>();
		empList.add(e1);
		empList.add(e2);
		empList.add(e3);
		empList.add(e4);
		
		System.out.println(empList);
		
		Iterator<Employee> itr = empList.iterator();
		
		while(itr.hasNext()) {
			Employee e = (itr.next());
			if(e.getSalary() < 10000 ) {
				itr.remove();
			}
				
		}
		
		



		System.out.println(empList);
		
//		for(Employee e : empList) {
//			System.out.println(e);
//		}
	}

}
