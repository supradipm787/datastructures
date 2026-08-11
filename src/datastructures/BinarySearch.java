package datastructures;

import java.util.Scanner;

public class BinarySearch {
	
	static int binarySearchPosition(int[] arr, int target) {
		int left = 0;
		int right = arr.length -1;
		
		while(left<=right) {
			int mid = left + (right -left)/2;
			
			if(arr[mid] == target) {
				return mid;
			}
			
			if(arr[mid] < target)
				left=mid +1;
			else
				right = mid -1;
		}
		
		return -1;
	}

	public BinarySearch() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		System.out.println("Binary Search");
		
		int[] arr = {1,1,2,2,3,4,5,6,7,8,9};
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the element to be searched in the array : ");
		int searchNumber = scanner.nextInt();
		scanner.close();
		System.out.println("The number to be searched in the array is:" + searchNumber);
		
		//int target = String.valueOf(args[0]) != null ? Integer.parseInt(args[0]) : -1;
		
		int binaryPosition = binarySearchPosition(arr,searchNumber);
		
		int position = binaryPosition +1;
		
		if(binaryPosition == -1) {
			System.out.println("Element not found in the array");
		}
		
		System.out.println("Position of searched element in the array is:" + position );

	}

}
