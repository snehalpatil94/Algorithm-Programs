package com.bridgelabz.algoritham;

import java.util.Scanner;

/**
 * Take a range of 0 - 1000 Numbers and find the Prime numbers in that range.
 * 
 * @author : Snehal Patil
 *
 */
public class PrimeNo {

	/**
	 * Purpose : Method to find prime numbers between given range
	 * 
	 * @Param lower- for lower limit
	 * @Param upper- for upper limit
	 */
	private static void isPrime(int lower, int upper) {
		int i, flag, j;
		for (i = lower; i <= upper; i++) {
			if (i == 1 || i == 0)
				continue;
			flag = 1;
			for (j = 2; j <= i / 2; ++j) {
				if (i % j == 0) {
					flag = 0;
					break;
				}
			}
			if (flag == 1)
				System.out.println(i);
		}
	}

	public static void main(String[] args) {
		System.out.println("-------------Welcome to Prime No Program----------");
		System.out.println();

		Scanner sc = new Scanner(System.in);
		int lower, upper;

		// Taking limit from the user
		System.out.print("Enter the lower bound : ");
		lower = sc.nextInt();
		System.out.print("Enter the upper bound : ");
		upper = sc.nextInt();
		System.out.println("Prime numbers between " + lower + " and " +  upper + " are : ");

		// Calling isPrime method
		isPrime(lower, upper);
	}

}
