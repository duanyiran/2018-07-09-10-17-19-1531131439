package practice02;


//extend继承父类
public class Student extends Person{
	private int klass;
	public Student(String name, int age,int klass) {
		//super方法是继承父类的name和age两个属性
		super(name, age);

		//直接用this给子类添加新属性？
		this.klass=klass;
	}
	public int getKlass() {
		return klass;
	}
	public void setKlass(int klass) {
		this.klass = klass;
	}

	//子类新的introduce方法
	public String introduce() {
		//继承了父类的introduce方法？为什么要super introduce
		super.introduce();
		//子类introduce方法的返回值
		return "I am a Student. I am at Class "+this.klass+".";
		
	}
}
