package datastructures;

public class MergeSort {

	public MergeSort() {
		// TODO Auto-generated constructor stub
		
	}
	public static void mergeSortList(int [] arr, int left, int right) {
		if(left < right) {
			int mid = left + (right - left)/2;
			
			mergeSortList(arr, left, mid);
			mergeSortList(arr, mid + 1, right);
			
			merge(arr, left, mid, right); 
			
		}
	}
	
	public static void merge (int[] arr, int left, int mid, int right) {
		
		int n1 = mid - left +1;
		int n2 = right - mid;
		
		int[] arr1 = new int[n1];
		int[] arr2 = new int[n2];
		
		
		for(int i = 0; i < n1; i++) {
			arr1[i] = arr[left + i];
		}
		for(int j = 0; j < n2; j++) {
			arr2[j] = arr[mid + 1 + j];
		}
		
		int i = 0; int j = 0; int k= left;
		
		
		for (i=0, j=0; i<n1 && j<n2;) {
			if (arr1[i] < arr2[j])
				arr[k++] = arr1[i++];
			else
				arr[k++] = arr2[j++];
		}
		
		/**while (i <n1 && j<n2) {
			if (arr1[i] < arr2[j])
				arr[k++] = arr1[i++];
			else
				arr[k++] = arr2[j++];
		}**/
		
		
		
		while (i<n1) {
			arr[k++] = arr1[i++];
		}
		while (j<n2) {
			arr[k++] = arr2[j++];
		}	
		
		
		
	}
	
	public static void main(String[] args) {
		
		int[] arr = {25, 32, 12, 9, 59, 3, 2, 9, 2, 27, 25, 9, 10};
		int left = 0;
		int right = arr.length - 1;
		
		mergeSortList (arr, left, right);
		
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
