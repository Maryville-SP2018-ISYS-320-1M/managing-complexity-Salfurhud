
/*
	ISYS 320
	Name(s):AlfurhudSolomon
	Date: March25, 2018
*/

import java.util.Scanner;
public class P5_ScalableBox {

	public static void main(String[] args) {
		drawBoxCap();
		drawBoxInsides();
		drawBoxCap();
	}

	
	public static void drawBoxCap() {
           Scanner input=new Scanner(System.in);
            System.out.print("Enter boundary");
          int boundary=input.nextInt();
		System.out.print("+");

		
		for( int capDashIndex = 1; capDashIndex <= boundary - 2; capDashIndex++ ) {
			System.out.print("-");
		}

		
		System.out.println("+");
	}

	
	public static void drawBoxInsides() {
//            Scanner input=new Scanner(System.in);
//            System.out.print("Enter boundary");
//            int boundary=input.nextInt();
		for( int insideRowIndex = 1; insideRowIndex <= 10 - 2; insideRowIndex++ ) {
			drawBoxInsideLine();
		}
	}

	
	public static void drawBoxInsideLine() {
		System.out.print("|");

		
		for( int insideRowIndex = 1; insideRowIndex <= 8 - 2; insideRowIndex++ ) {
			System.out.print(".");
		}

		
		System.out.println("|");
	}

}

