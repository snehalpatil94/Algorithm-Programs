package com.bridgelabz.algoritham;

import java.util.Scanner;

/**
 * Reads in strings and prints them in sorted order using insertion sort.
 * 
 * @author : Snehal Patil
 *
 */
public class InsertionSort {

	// sorting method to sort the given array
	public void insertionSort(String[] arr) {
		int length = arr.length;
		for (int i = 1; i < length; i++) {
			for (int j = i - 1; j >= 0; j--) {
				if (arr[j].compareTo(arr[j + 1]) > 0) {
					String temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
	}

	public static void main(String[] args) {
		System.out.println("--------- Welcome to Insertion Sort Program -----------");
		System.out.println();
		Scanner sc = new Scanner(System.in);

		InsertionSort sort = new InsertionSort();
		System.out.println("Enter how many Strings you want to sort : ");
		int size = sc.nextInt();
		String[] array = new String[size];

		System.out.println("Enter words to sort : ");
		for (int i = 0; i < array.length; i++) {
			array[i] = sc.next();
		}

		// Print original array
		System.out.print("\nArray before sorting : ");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + ", ");
		}
		System.out.println("\n");

		// calling insertionSort sort method
		sort.insertionSort(array);
		System.out.print("Array after sorting : ");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + ", ");
		}
	}
}