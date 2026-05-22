package problems_number;

import java.util.*;
import java.lang.*;

public class Reverse_num {

	public static int rev(int num) {
		int rev_num = 0;
		while (num != 0) {
			int digit = num % 10; // Extract the last digit (e.g., 4)
			rev_num = rev_num * 10 + digit; // Append it to the reversed number
			num /= 10; // Remove the last digit from original (e.g., 123)
		}
		return rev_num;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("eneter the number:");
		int n = sc.nextInt();
		System.out.println("reverse the given number" + rev(n));

	}

}
