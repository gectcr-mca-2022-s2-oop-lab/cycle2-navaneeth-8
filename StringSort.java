package cycle2;
import java.util.Scanner;
public class StringSort {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array:");
		int size = sc.nextInt();
		String n[] = new String[size];
		System.out.println("Enter the strings:");
		for (int i = 0; i < size; i++) {
			n[i] = sc.next();
		}
		String temp="";
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				int compare = (n[i].toLowerCase()).compareTo((n[j].toLowerCase()));
				if(compare < 0)
				{
					temp = n[i];
					n[i] = n[j];
					n[j] = temp;		
				}
			}
		}
		for (int i = 0; i < size; i++) {
			System.out.println(n[i]);
		}
		sc.close();
	}
}