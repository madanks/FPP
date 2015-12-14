package assignment;

public class PhoneDirectoryAPP {

	public static void main(String[] args) {
		DirectoryOpr directoryOpr = new DirectoryOpr();
		System.out.println("Directory is empty?" + directoryOpr.isEmpty());
		directoryOpr.insertFirst("Madan", 12);
		directoryOpr.insertFirst("Govinda", 13);
		directoryOpr.displayList();
		directoryOpr.insertLast("Hari", 14);
		directoryOpr.displayList();
		directoryOpr.deleteFirst();
		Directory directory = directoryOpr.find(12);
		directory.displayDirectory();
		System.out.println(directoryOpr.size());
		System.out.println(directoryOpr.isEmpty());

	}

}

class Directory {
	String name;
	long pno; // Phone number
	Directory next;

	public Directory(String name, long pno) { // Initialize values
		this.name = name;
		this.pno = pno;

	}

	// -------------------------------------------------------------
	public void displayDirectory() // display values of single element
	{
		System.out.println("Name : " + name + " Phone Number: " + pno);
	}
}

class DirectoryOpr {
	private Directory first; // ref to first Directory
	private Directory last; // ref to last Directory

	// -------------------------------------------------------------
	public DirectoryOpr() // constructor
	{
		first = null;
		last = null;
	}

	// -------------------------------------------------------------
	public boolean isEmpty() // true if no Directory in your list
	{
		if (first == null) {
			return true;
		}
		return false;
	}

	// -------------------------------------------------------------
	public void insertFirst(String name, long pno) // insert at front of list
	{
		if (isEmpty()) {
			first = new Directory(name, pno);
			first.next = null;
			last = first;
		} else {
			Directory temp = first;
			first = new Directory(name, pno);
			first.next = temp;
		}
	}

	// -------------------------------------------------------------
	public void insertLast(String name, long pno) // insert at end of list
	{
		if (isEmpty()) {
			first = new Directory(name, pno);
			first.next = null;
			last = first;
		} else {
			Directory temp = last;
			last = new Directory(name, pno);
			temp.next = last;
			last.next = null;
			// last=temp;
		}
	}

	// -------------------------------------------------------------
	public Directory deleteFirst() // delete first Directory
	{
		if (isEmpty()) {
			return null;
		} else {
			Directory temp = first.next;
			first.next = null;
			Directory dd = first;
			first = temp;
			return dd;
		}
	}

	// -------------------------------------------------------------
	public int size() {
		int count = 0;
		Directory dd = first;
		while (dd != null) {
			count++;
			dd = dd.next;
		}
		return count;
	}

	// -------------------------------------------------------------
	public void displayList() {
		Directory dd = first;
		while (dd != null) {
			dd.displayDirectory();
			dd = dd.next;
		}
	}

	// -------------------------------------------------------------
	public Directory find(long key) // find link with given key
	{
		Directory dd = first;
		while (dd != null) {
			if (dd.pno == key) {
				return dd;
			}
			dd = dd.next;
		}

		return null;
	}
}
/*Output
Directory is empty?true
Name : Govinda Phone Number: 13
Name : Madan Phone Number: 12
Name : Govinda Phone Number: 13
Name : Madan Phone Number: 12
Name : Hari Phone Number: 14
Name : Madan Phone Number: 12
2
false*/