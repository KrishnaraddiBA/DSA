import java.util.Scanner;

public class Abc {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		boolean flag=true;
		
		while(flag) {
		System.out.println("Press  1 for the insert an element in an array");
		System.out.println("Press 2 for delete an element in an array");

		int key=scan.nextInt();
		switch (key) {
		case 1:
		
			System.out.println("Enter the index u want to add a number");
			int index=scan.nextInt();
			System.out.println("Entre the value u want to add with");
			int value=scan.nextInt();
			addElement( index, value);
			break;
			
		case 2:
			System.out.println("Enter the index u want to delete with");
			index=scan.nextInt();
			removeElement(index);
			break;

		default:
		
			System.out.println("Sorry u have entered invalid input please try again!!!");
			flag=false;
			break;
		}
		
		}
		}

	public static void removeElement(int index) {
		System.out.println("Enter the size of an array");
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int a[]=new int[n];
		int b[]=new int[n-1];
		System.out.println("Enter the values of an array");
		for (int i = 0; i < a.length; i++) {
			a[i]=scan.nextInt();
		}
		for (int i = 0; i < b.length; i++) {
			if (i<index) {
				b[i]=a[i];
			}
			else if (i==index) {
				continue;
			}
			else {
				b[i]=a[i+1];
			}
		}
	}

	public static void addElement(int index, int value) {
		System.out.println("Enter the size of an array");
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int a[]=new int[n];
		int b[]=new int[n+1];
		System.out.println("Enter the values of an array");
		for (int i = 0; i < a.length; i++) {
			a[i]=scan.nextInt();
		}
		for (int i = 0; i < b.length; i++) {
			if (i<index) {
				b[i]=a[i];
			}
			else if (i==index) {
				b[i]=value;
			}
			else {
				b[i]=a[i-1];
			}
		
			System.out.println("the value of b are "+b[i]);
		}
		

		
	}

}
