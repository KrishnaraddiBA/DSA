//deletion of an array

import java.util.Scanner;

public class C {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the length of an array");
		int n=scan.nextInt();
		int[]a=new int[n];
		int []b=new int[n-1];
		for (int i = 0; i < a.length; i++) {
			System.out.println("Enter the value in an array "+i+" position");
		a[i]=scan.nextInt();
		}
		System.out.println("Enter the position or an index which u want to delete with");
		int p=scan.nextInt();
		for (int i = 0; i < b.length; i++) {
			if (i!=p) {
				b[i]=a[i];
				
			}
			System.out.println(b[i]);
			
			
		}
	}

}
