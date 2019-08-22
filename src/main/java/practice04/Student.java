package practice04;

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
		//定义了变量m继承父类的introduce方法
		String m = super.introduce();
		//并且在上述基础上添加了子类的introduce方法
		return m + " I am a Student. I am at Class " + this.klass + ".";

	}
}
