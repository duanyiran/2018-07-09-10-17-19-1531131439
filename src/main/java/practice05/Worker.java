package practice05;

public class Worker extends Person{

	public Worker(String name, int age) {
		super(name, age);
		// TODO Auto-generated constructor stub
	}

	public String introduce() {
		String m = super.introduce();
		return m + " I am a Worker. I have a job.";
	}
}
