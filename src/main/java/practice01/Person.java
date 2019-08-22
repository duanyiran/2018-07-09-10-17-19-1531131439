package practice01;

public class Person {

	//定义一个类型为字符串的变量name，类型为整数的变量age
	private String name;
	private int age;
   //get set方法？
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

	//这是一个构造函数person，与类同名
	public Person(String string, int i) {
		this.name = string;
		this.age=i;
	}
    //这是一个方法introduce
	public String introduce() {
		// TODO Auto-generated method stub
		return "My name is "+this.name+". I am "+this.age+" years old.";
	}
}
