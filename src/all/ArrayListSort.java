package all;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
class Employe {
	private String name;
	private int age;
	
	public Employe(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	public int getAge() {
		return age;
	}	
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	public static final Comparator NAME = new Comparator(){
		public int compare(Object o1, Object o2) {
						
			//System.out.println("Name comparator is " + NAME.getClass().getName());
						
			//System.out.println(NAME.getClass());
		
			String name1 = ((Employe)o1).getName();
			String name2 = ((Employe)o2).getName();
			return name1.compareTo(name2);
		}
	};
	
	public static final Comparator AGE = new Comparator(){
		public int compare(Object o1, Object o2){
						
			//System.out.println("Age Comparator is  " + AGE.getClass());
			
			Integer age1 = new Integer(((Employe)o1).getAge()) ;
			Integer age2 = new Integer(((Employe)o2).getAge());
			return age1.compareTo(age2);
		}
	};
		
}

public class ArrayListSort {

		public static void main(String[] args) {
			ArrayList <Employe> list = new ArrayList<Employe>();
			Employe e1 = new Employe("Manokar", 25);
			Employe e2 = new Employe("Jai", 30);
			Employe e3 = new Employe("Sunil", 22);
			
					
			list.add(e1);
			list.add(e2);
			list.add(e3);
			list.set(0, new Employe("Manokar",35));
			
			System.out.println("Before sort: ");
			for(int i=0; i<list.size(); i++){
				Employe e = list.get(i);
				System.out.println(e.getName());
			}
			
			Collections.sort(list, Employe.NAME);
			
			System.out.println("After sort by Name: ");
			for(int i=0; i<list.size(); i++){
				Employe e = list.get(i);
				System.out.println(e.getName());
			}
			
			Collections.sort(list, Employe.AGE);
			
			System.out.println("After sort by Age: ");
			for(int i=0; i<list.size(); i++){
				Employe e = list.get(i);
				System.out.println(e.getAge());
			}  		
	}

}
