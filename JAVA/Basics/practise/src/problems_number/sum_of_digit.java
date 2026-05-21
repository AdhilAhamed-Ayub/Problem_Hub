package problems_number;

import java.util.Scanner;

public class sum_of_digit {
	
	public static int sum(int num) {
		int temp =0;
		while(num!=0) {
		int a = num%10;
		temp +=a;
		num=num/10;
		}
		return temp;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int n = sc.nextInt();
		System.out.println("given number is sum: " +sum(n));

	}

}
