package practice03;


//woker类继承父类person
public class Worker extends Person{

	public Worker(String name, int age) {
		//继承父类的name，age
		super(name, age);
		// TODO Auto-generated constructor stub
	}
	//子类的introduce方法
	public String introduce() {
		return "I am a Worker. I have a job.";
	}
	
}
