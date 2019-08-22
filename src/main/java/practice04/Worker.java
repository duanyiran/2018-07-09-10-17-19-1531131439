package practice04;

public class Worker extends Person {

	public Worker(String name, int age) {
		super(name, age);
		// TODO Auto-generated constructor stub
	}

	public String introduce() {
		//定义了变量m继承父类的introduce方法
		String m = super.introduce();
		//并且在上述基础上添加了子类的introduce方法
		return m + " I am a Worker. I have a job.";
	}

}
