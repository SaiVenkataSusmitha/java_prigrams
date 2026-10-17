interface Animals{
	void makesound();
}
class Cat implements Animals{
	public void makesound(){
		System.out.println("meow meow");
	}
}
class Dog implements Animals{
	public void makesound(){
		System.out.println("BOW BOW");
	}
}
public class InterfaceDemo{
	public static void main(String[] args){
		Cat obj1 = new Cat();
		obj1.makesound();
		Dog obj2 = new Dog();
		obj2.makesound(); 
	}
}

	