package com.employee.managemen;

import java.util.Scanner;

public class CRUDDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		 int ch;
do {
	System.out.println("1.Insert");
	System.out.println("2.Display");
	System.out.println("3.Serch");
	System.out.println("4.Delete");	
	System.out.println("1.Update");
	System.out.print("Enter Your Choice : ");
	ch = s.nextInt();
}while(ch!=0);
	}

}
