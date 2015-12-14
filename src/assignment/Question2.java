package assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Marketing {
	static enum SortMethod {
		BYNAME, BYAMOUNT
	};

	private String employeeName;
	private String productName;
	private double price;

	public Marketing(String employeeName, String productName, double price) {
		super();
		this.employeeName = employeeName;
		this.productName = productName;
		this.price = price;
	}

	public Marketing() {
	}

	public void sort(List<Marketing> marketing, SortMethod method) {
		Collections.sort(marketing, (m1, m2) -> {
			if (method == SortMethod.BYNAME) {
				return m1.employeeName.compareToIgnoreCase(m2.employeeName);
			} else {
				if (m1.price == m2.price)
					return 0;
				else if (m1.price < m2.price)
					return -1;
				else
					return 1;
			}
		});
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Marketing [employeeName=" + employeeName + ", productName=" + productName + ", price=" + price + "]";
	}

}

public class Question2 {

	public static void main(String[] args) {
		List<Marketing> marketing = new ArrayList<>();
		Marketing m1 = new Marketing("Prabat", "Laptop", 500.00);
		Marketing m2 = new Marketing("Govinda", "Mouse", 5.00);
		Marketing m3 = new Marketing("Rajiv", "Mobile", 200.00);
		Marketing m4 = new Marketing("Gunjan", "Shoes", 50.00);
		Marketing m5 = new Marketing("Madan", "Mac Book", 1500.00);
		marketing.add(m1);
		marketing.add(m2);
		marketing.add(m3);
		marketing.add(m4);
		marketing.add(m5);
		System.out.println("After Adding");
		displayArrayList(marketing);

		System.out.println("\nAfter Removing Data");
		marketing.remove(m5);
		displayArrayList(marketing);

		System.out.println("\nAfter Modify some objects using set() method");
		marketing.set(3, m5);
		displayArrayList(marketing);
		Marketing m = new Marketing();
		System.out.println("\nAfter Sorting by name ");
		m.sort(marketing, Marketing.SortMethod.BYNAME);
		displayArrayList(marketing);
		
		System.out.println("\nAfter Sorting by price ");
		m.sort(marketing, Marketing.SortMethod.BYAMOUNT);
		displayArrayList(marketing);
		
		System.out.println("\nSize of Array list is:  "+marketing.size());

	}

	private static void displayArrayList(List<Marketing> marketing) {
		for (Marketing m : marketing) {
			System.out.println(m.toString());
		}

	}

}

/*After Adding
Marketing [employeeName=Prabat, productName=Laptop, price=500.0]
Marketing [employeeName=Govinda, productName=Mouse, price=5.0]
Marketing [employeeName=Rajiv, productName=Mobile, price=200.0]
Marketing [employeeName=Gunjan, productName=Shoes, price=50.0]
Marketing [employeeName=Madan, productName=Mac Book, price=1500.0]

After Removing Data
Marketing [employeeName=Prabat, productName=Laptop, price=500.0]
Marketing [employeeName=Govinda, productName=Mouse, price=5.0]
Marketing [employeeName=Rajiv, productName=Mobile, price=200.0]
Marketing [employeeName=Gunjan, productName=Shoes, price=50.0]

After Modify some objects using set() method
Marketing [employeeName=Prabat, productName=Laptop, price=500.0]
Marketing [employeeName=Govinda, productName=Mouse, price=5.0]
Marketing [employeeName=Rajiv, productName=Mobile, price=200.0]
Marketing [employeeName=Madan, productName=Mac Book, price=1500.0]

After Sorting by name 
Marketing [employeeName=Govinda, productName=Mouse, price=5.0]
Marketing [employeeName=Madan, productName=Mac Book, price=1500.0]
Marketing [employeeName=Prabat, productName=Laptop, price=500.0]
Marketing [employeeName=Rajiv, productName=Mobile, price=200.0]

After Sorting by price 
Marketing [employeeName=Govinda, productName=Mouse, price=5.0]
Marketing [employeeName=Rajiv, productName=Mobile, price=200.0]
Marketing [employeeName=Prabat, productName=Laptop, price=500.0]
Marketing [employeeName=Madan, productName=Mac Book, price=1500.0]

Size of Array list is:  4*/
