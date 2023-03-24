package cycle2;

import java.util.Scanner;

public class Search {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array:");
		int size = sc.nextInt();
		int n[] = new int[size];
		int j = 0;
		System.out.println("Enter the elements:");
		for (int i = 0; i < size; i++) {
			n[i] = sc.nextInt();
		}
		System.out.println("Enter the element to search:");
		int ele = sc.nextInt();
		int x = 0;
		for (j = 0; j < size; j++) {
			if (n[j] == ele) {
				x = x + 1;
				break;
			}
		}
		if (x > 0)
			System.out.println("Element found at position: " + (j + 1));
		else
			System.out.println("Element does not exist.");
		sc.close();
	}
}
