package lesson8comparato;

import java.util.*;

public class NameComparator2 implements Comparator<Employee>{

	@Override
	public int compare(Employee e1, Employee e2) {
		String name1 = e1.getName();
		String name2 = e2.getName();
		Date hireDate1 = e1.getHireDay();
		Date hireDate2 = e2.getHireDay();
		if(name1.compareTo(name2) != 0) {
			return name1.compareTo(name2);
		}
		//in this case, name1.equals(name2) is true
		return hireDate1.compareTo(hireDate2);
	}	

	
	public static void main(String[] args) {
		Employee e1 = new Employee("Joe", 1999, 10, 2);
		Employee e2 = new Employee("Joe", 2001, 9, 4);
		NameComparator2 comp = new NameComparator2();
		System.out.println(e1.equals(e2));
		System.out.println(comp.compare(e1,e2));
	}
}
