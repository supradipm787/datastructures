package datastructures;

public class QuickSort {

	public QuickSort() {
		// TODO Auto-generated constructor stub
	}
	
	public static void quickSort(int[] arr, int left, int right) {
		if(left < right) {
			
			int pivotIndex = partition (arr, left, right);
			quickSort (arr, left, pivotIndex -1);
			quickSort (arr, pivotIndex + 1, right);
			
			
		}
	}
	
	public static int partition (int[] arr, int left, int right) {
		int k =0; 
		
		int pivot = arr[right];
		
		int i = left -1; 
		//int temp = 0;
		
		//while (left < right) {
		for (int j = left; j < right; j++) {
			
			if (arr[j] < pivot) {
				i++;
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;				
			}
			
		}
			
			int temp = arr[i + 1];
			arr[i + 1] = arr[right];
			arr[right] = temp;
		
				
		return i+1 ;
		 
	}
		
	public static void main(String[] args) {
		int[] arr = {25, 32, 12, 9, 59, 3, 2, 9, 2, 27, 25, 9, 10};
		int left = 0;
		int right = arr.length - 1;
		
		quickSort(arr, left, right);
		
		int len = arr.length -1; 
		int count = 0;
		
		for(int n:arr) {
			
			if(len == count ) {
				System.out.print(n);
				break;
			}
			
			System.out.print(n  + ",");
			count++;			
			
		}
		
	}

}
