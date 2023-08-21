//insert an element in an array

import java.util.Scanner;

public class A {
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the length of an array");
		int n=scan.nextInt();
		int a[]=new int[n];
		int b[]=new int[n+1];
		for (int i = 0; i < a.length; i++) {
			System.out.println("Enter the values for "+i+" position");
			a[i]=scan.nextInt();
		}
		System.out.println("Enter the position where u want to insert the values");
		int p=scan.nextInt();
		System.out.println("Enter the value for the specified position");
		int m=scan.nextInt();
		for (int i = 0; i < b.length; i++) {
			if (i<p) {
				b[i]=a[i];
			}
			else if (i==p) {
				b[i]=m;
			}
			else {
				b[i]=a[i-1];
			}
			
			System.out.println(b[i]);
		}
		
	}

}
