package practice05;

public class Student extends Person {
	private int klass;

	public Student(String name, int age, int klass) {
		super(name, age);

		this.klass = klass;
	}

	public int getKlass() {
		return klass;
	}

	public void setKlass(int klass) {
		this.klass = klass;
	}

	public String introduce() {
		//“调用Person的introduce方法来获得”和“调用Person的basicIntroduce来返回”好像没有区别，都是定义了一个新的string m去继承，然后return m
		String m = super.introduce();
		return m + " I am a Student. I am at Class " + this.klass + ".";

	}
}
