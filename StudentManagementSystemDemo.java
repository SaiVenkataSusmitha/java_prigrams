import java.util.Scanner;
class StudentManagementSystem {
	double cgpa;
	String name,rollno,branch;
	Scanner sc= new Scanner(System.in);

	void read(){
		System.out.print("Enter your name:");
		name=sc.nextLine();

		System.out.println("Enter your branch:");
		branch=sc.nextLine();

		System.out.print("Enter your roll number:");
		rollno=sc.nextLine();

		System.out.print("Enter your cgpa:");
 		cgpa=sc.nextDouble();
	}
	
	void display(){
		System.out.println("your name:"+name);
		System.out.println("your branch:"+branch);
		System.out.println("your roll number:"+rollno);
		System.out.println("your cgpa:"+cgpa);
		
	}
	
	
	void cgpa(){
		if(cgpa >=10){
		System.out.println("grade is 10 & A");
		}
		else if(cgpa>=9){
		System.out.println("grade is 9 & B");
		}
		else if(cgpa>=8){
		System.out.println("grade is 8 & C");
		}
		else if(cgpa>=7){
		System.out.println("grade is 7 & D");
		}
		else if(cgpa>=6){
		System.out.println("grade is 6 & E");
		}
		else{
		System.out.println("FAIL");
		}
	}
	
}	
public class StudentManagementSystemDemo{
	public static void main(String[] args){
		StudentManagementSystem s = new StudentManagementSystem();

		s.read();
		s.display();
		s.cgpa();
	}
}	
		
