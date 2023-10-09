
/*package com.cdac.Tester;
import com.cdac.core.*;
*/
import java.util.Scanner;
public class Tester{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		/*
		 * System.out.println("Enter side of cube "); Box cube = new
		 * Box(sc.nextDouble()); Box beatbox = new Box(10,10,10);
		 * System.out.println("Ans of comparison is : "+cube.isEqual(beatbox));
		 * System.out.println("details of cube:"); cube.showBox();
		 * System.out.println("details of beatbox:"); beatbox.showBox(); Box
		 * neighbourBox= new Box(); neighbourBox = beatbox.newBox(-10.0,0.3,98.0);
		 * System.out.println("details of neighbourBox:"); neighbourBox.showBox();
		 */
		Box[] boxes;
		boxes = new Box[10]; 
		int j=0;
		/*
		 * for(Box i : boxes) { j++; System.out.print("Value of Box "+j+" is ");
		 * System.out.println(i); }
		 */	
		j=1;
		for(int i = 0 ; i < boxes.length;i++) {
			boxes[i]= new Box(j*2,j*3,j*4);
			j++;
			System.out.println(boxes[i]);
		}
		System.out.println(boxes.getClass());
		//boxes[0] = new Box(1,2,3);
		//boxes[0].showBox();
		sc.close();
	}
}