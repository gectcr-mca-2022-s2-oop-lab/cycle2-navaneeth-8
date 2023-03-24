package cycle2;
import java.util.Scanner;
public class StringFunctions {
	public static void main(String[] args) {
		   Scanner sc = new Scanner(System.in);
	       System.out.println("Enter String1: ");
	       String str = sc.nextLine();
	       System.out.println("Enter String2: ");
	       String str2 = sc.nextLine();
	       System.out.println("Enter a character: ");
	       String ch = sc.nextLine();
	       System.out.println("Enter a number: ");
	       int n = sc.nextInt();
	       System.out.println("1. Length of String1: " + str.length());
	       System.out.println("2. Upper Case Representation: " + str.toUpperCase());
	       System.out.println("3. Lower Case Representation: " + str.toLowerCase());
	       System.out.println("4. String1 + String2: " + str.concat(str2));
	       System.out.println("5. Is String1 and String2 the same: " + str.equalsIgnoreCase(str2));
	       System.out.println("6. Does String1 starts with the character entered (case-sensitive): " + str.startsWith(ch));
	       System.out.println("7. Does String1 ends with the character entered (case-sensitive): " + str.endsWith(ch));
	       System.out.println("8. First occurence of character entered in String1: " + str.indexOf(ch));
	       System.out.println("9. Last occurence of character entered in String1: " + str.lastIndexOf(ch));
	       System.out.println("10. Character at position " + n + ": " + str.charAt(n));
	       System.out.println("11. Is String1 empty: " + str.isEmpty());
	       sc.close();
	}

}