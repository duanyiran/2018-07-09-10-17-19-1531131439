package practice06;

public class Teacher extends Person{
	private int klass;

	
	
	public int getKlass() {
		return klass;
	}
	public void setKlass(int klass) {
		this.klass = klass;
	}
	public Teacher(String name, int age,int klass) {
		super(name, age);
		this.klass=klass;
		// TODO Auto-generated constructor stub
	}
	public Teacher(String name, int age) {
		super(name, age);
		// TODO Auto-generated constructor stub
	}
	public String introduce() {
		String m = super.introduce();
		if(this.klass==0) {
			return m+" I am a Teacher. I teach No Class.";
		}else
			return m+" I am a Teacher. I teach Class "+this.klass+".";
	}
}
