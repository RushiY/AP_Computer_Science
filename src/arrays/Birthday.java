package arrays;
public class Birthday {
	private String name;
	private String bday;

	public Birthday() {
		name = "";
		bday = "";
	}

	public Birthday(String name, String bday) {
		this.name = name;
		this.bday = bday;
	}

	public String getName() {
		return name;
	}

	public String getBday() {
		return bday;
	}

	public void setBday(String bday) {
		this.bday = bday;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String toString() {
		String str = "";

		str = "Enter name = " + name + "\n" + "Enter Bday  = " + bday;

		return str;
	}

}
