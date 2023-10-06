import java.util.*;
class compare
	{
	public static void main(String[] args)
		{
		int age=0;
		System.out.println("Enter the ages");
		Scanner sc=new Scanner(System.in);
		age=sc.nextInt();
		if(age<18)
		{
			System.out.println("No License");	
		}
		else
		{
			System.out.println("License");
		}
		System.out.println("Test Done!!");
		int age2;
		System.out.println("Enter the second age ");	
		age2=sc.nextInt();
		if(age2%2==0){
		
			System.out.println("Number is even");	
		}
		else
		{
			System.out.println("Number is odd");
		}


		sc.close();
	}
}