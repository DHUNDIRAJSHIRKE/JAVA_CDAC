import java.util.Scanner;
class Assignment_2{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		boolean check1=false,check2=false,check=false,exit=false;
		double avg=0,num1=0,num2=0;
		while(!exit){
			System.out.println("Enter first double:");
			check1=sc.hasNextDouble();
			if(check1==true){
				System.out.println("inside if of 1st");	
				num1=sc.nextDouble();
			}
			else{
				System.out.println("Not a double!!!");	
				exit=false;
			}
			System.out.println("Enter second double:");
			check2=sc.hasNextDouble();
			if(check1==true){
				System.out.println("inside if of 1st");
				num2=sc.nextDouble();
			}
			else{

				System.out.println("Not a double!!!");
				exit=false;
			}
			check= (check2 && check1 );
			if(check==true){
				avg=(num1+num2)/2;
				exit=true;
			}		
			System.out.println("average of "+num1+"and "+num2+" is : "+avg);
		
			//System.out.println("val of check: "+check);
			sc.close();
		}
	}
}