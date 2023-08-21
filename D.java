import java.util.Scanner;

public class D {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int n=scan.nextInt();
		int a[]=new int[n];
		int b[]=new int[n-1];
		System.out.println("Enter the values of an array of index ");
		for (int i = 0; i < a.length; i++) {
			
			a[i]=scan.nextInt();
		}
		System.out.println("Enter the index position u want to delete with");
		int p=scan.nextInt();
		for (int i = 0; i < b.length; i++) {
			if (i<p) {
				b[i]=a[i];
			}
			else if (i==p) {
				continue;
			}
			else {
				b[i-1]=a[i];
			}
		}
		
		for (int i : b) {
			System.out.println(i);
		}
	}

}
