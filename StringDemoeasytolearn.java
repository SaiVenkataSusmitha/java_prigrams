import java.util.Scanner;
class Strings{
	Scanner sc = new Scanner(System.in);
	String str1;
	str1 = sc.nextLine();
	String str2;
	str2 = sc.nextLine();
}
public String(String str1,String str2){
	this.str1=str1;
	this.str2=str2;
}
void display(){
	System.out.println(str1);
	System.out.println(str2);
	
}
void length(){
	System.out.println("the length of string"+str1+ "is: "+str1.length()");
	System.out.println("return the count of the number of characters");
	System.out.println("The syntax = string name.length()");
}
int char(){
	System.out.println("Enter the index of char to found:");
	int num = sc.nextInt();
	System.out.println("the char at the given posion (or) index "+num+"is" +str1.charAt(num));
	System.out.println("return a character that is available at the specified index position.");
	System.out.println("syntax=Stringname.charAt(index)");
}
public class StringDemoeasytolearn{
	public static void main(String[] args){
		String s=new String();
		s.display();
		s.length();
		s.char();
	}
}