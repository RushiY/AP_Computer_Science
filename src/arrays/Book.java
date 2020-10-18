package arrays;
public class Book {
	// instance variables
	private String studentName;
	private String bookNumber;

	// constructors
	public Book(String s, String number) {
		studentName = s;
		bookNumber = number;
	}

	// accessor methods
	public void setStudentName(String s) {
		studentName = s;
	}

	public void setBookNumber(String b) {
		bookNumber = b;
	}
	
	public String getST() {
		return studentName;
	}
	
	public String getBN() {
		return bookNumber;
	}

	// toString method
	@Override
	public String toString() {
		return "Student Name = " + studentName + "\n" +
				"Book Number = " + bookNumber;
	}
}