package practice03;

public class Person {
	private String name;
	private int age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Person(String string, int i) {
		this.name = string;
		this.age=i;
	}

	public String introduce() {
		// TODO Auto-generated method stub
		return "My name is "+this.name+". I am "+this.age+" years old.";
	}
}
