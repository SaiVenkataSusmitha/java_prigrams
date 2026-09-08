import java.util.Scanner;

class Main
{
	public static void main (String[] args) 
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int n= sc.nextInt();
		int[] arr=new int[n];
		for(int i = 0; i< n;i++){
		    arr[i] = sc.nextInt();
		    
		}
		int x=sc.nextInt();
		
		boolean frist = true;
		for(int i=0;i<n;i++){
		    if(arr[i]!=x){
		        if(!frist) {
		            System.out.print(" ");
		            
		        }
		        System.out.print(arr[i]);
		        frist = false;
		    }
		        
		}
		System.out.println();

	}
}
