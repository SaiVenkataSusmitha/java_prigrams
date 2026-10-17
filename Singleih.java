class Person{
	int uni;
	String name;
	public Person(){
		this(12345,"suresh");
		System.out.println("parent class constructor");
	}
	public Person(int x,String y){
		uni = x;
		name = y;
	}
}
class Employees extends Person{
	String occupation;
	public Employees(String occup){
		occupation = occup;
		System.out.println("child class constructor");
	}

	void display(){
		System.out.println("uid:"+uni);
		System.out.println("name:"+name);
		System.out.println("occupation:"+occupation);
	}

}
public class Singleih{
	public static void main(String[] args){
		Employees emp= new Employees("software");
		emp.display();
	}
}
	
  