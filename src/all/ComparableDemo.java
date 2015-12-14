package all;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

class Elephant implements Comparable
{
	public float weight;
	public int age;
	Elephant(float weight, int age)
	{
		this.weight = weight;
		this.age = age;
	}
	public int compareTo(Object obj)
	{
		Elephant AObj = (Elephant)obj;
		if (this.age > AObj.age) 
		return 1;
		else 
			if (this.age < AObj.age) 
				return -1;
			else 
				return 0;
	}
}

public class ComparableDemo {
	
	public static void main(String[] args) {
		ArrayList <Elephant> list = new ArrayList<Elephant>();
		list.add(new Elephant(156.90f, 20));
		list.add(new Elephant(166.90f, 15));
		list.add(new Elephant(146.90f, 18));
		Collections.sort(list);
		for(Elephant obj : list)
			System.out.println(obj.age);
	}

}
