package assignment;

class Person {
	private String lastName;
	private String firstName;
	private int age;

	public Person(String last, String first, int a) {
		lastName = last;
		firstName = first;
		age = a;
	}

	public void displayPerson() // Display fisrtName, lastName and age
	{
		System.out.println("[First Name:" + this.firstName + " Last Name:" + this.lastName + " Age :" + this.age + "]");

	}

	public String getLastName() // get only the last name
	{
		return lastName;
	}
}

class PersonArrayOpe {
	private Person[] a; // reference to array
	private int size;

	public PersonArrayOpe(int max) // constructor to initialize person array
									// with size max and nElems;
	{
		size = 0;
		a = new Person[max];

	}

	public Person find(String searchName) // Pass Lastname as an argument
	{
		for (int i = 0; i < size; i++) {
			if (a[i].getLastName().equalsIgnoreCase(searchName)) {
				return a[i];
			}
		}

		return null;
	}

	public void insert(String last, String first, int age)// Insert at last
	{
		if (size == a.length) {
			resize();
		}
		a[size++] = new Person(last, first, age);
	}

	public boolean delete(String searchName) // Shift down the elements.
												// Argument should be lastname
	{
		if (size == 0) {
			return false;
		}
		int index = -1;
		for (int i = 0; i < size; i++) {
			if (a[i].getLastName().equals(searchName)) {
				index = i;
				break;
			}

		}
		if (index == -1) {
			return false;
		}
		Person[] temp = new Person[a.length];

		System.arraycopy(a, 0, temp, 0, index);
		System.arraycopy(a, index + 1, temp, index, a.length - (index + 1));
		a = temp;
		--size;
		return true;

	}

	public void displayAll() // displays array contents
	{
		for (int i = 0; i < size; i++) {
			a[i].displayPerson();
		}
	}

	public int size() // Return the number of persons stored in the array
	{
		return size;
	}

	private void resize() {
		System.out.println("Resizing array");
		Person[] temp = new Person[a.length * 2];
		System.arraycopy(a, 0, temp, 0, size);
		a = temp;

	}
}

public class PersonMain {

	public static void main(String[] args) {

		PersonArrayOpe aa = new PersonArrayOpe(1);
		aa.insert("thapa", " ram", 20);
		aa.insert("shyam", "asdas", 45);
		aa.insert("tapa", "first", 4);
		aa.displayAll();
		aa.delete("shyam");
		aa.displayAll();
		Person pp = aa.find("tapa");
		pp.displayPerson();

	}

}

/*
 * Output Resizing array Resizing array [First Name: ram Last Name:thapa Age
 * :20] [First Name:asdas Last Name:shyam Age :45] [First Name:first Last
 * Name:tapa Age :4] [First Name: ram Last Name:thapa Age :20] [First Name:first
 * Last Name:tapa Age :4] [First Name:first Last Name:tapa Age :4]
 */
