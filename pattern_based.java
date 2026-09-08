import java.util.Scanner;

class Codechef
{
	public static void main (String[] args) 
	{
		// your code goes here
		Scanner s = new Scanner(System.in);
		int x= s.nextInt();
		int[] arr = new int[x];
		for(int i =0; i<x; i++){
		    arr[i]=s.nextInt();
		}
		int X=s.nextInt();
		System.out.println(X+" ");
		for(int i=0;i<x;i++){
		    System.out.println(arr[i]+" ");
		}
		System.out.print(X);
		System.out.println();

	}
}
