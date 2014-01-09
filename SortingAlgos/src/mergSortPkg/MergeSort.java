package mergSortPkg;

public class MergeSort {
	//SORT METHOD
	static void sort(int[] input){
		mergeSort(input, 0, input.length-1);
	}
	//MERGESORT METHOD
	static void mergeSort(int[] array,int low, int high){
		if(low<high){
			int mid = (low+high)/2;
			mergeSort(array,low,mid);
			mergeSort(array, mid+1, high);
			merge(array, low, mid, high);
		}
	}
	// merge the input array
	static void merge(int[] array, int low, int mid, int high){
		int[] temp = new int[high-low+1];
		int left = low;
		int right = mid+1;
		int k = 0;
		
		while(left <= mid && right <= high){
			if(array[left] < array[right]){
				temp[k] = array[left];
				left += 1;
			}else{
				temp[k] = array[right];
				right += 1;
			}
			k += 1;
		}
		if(left <= mid){
			while(left <= mid){
				temp[k] = array [left];
				left += 1;
				k += 1;
			}
		}else if (right <= high){
			while(right <= high){
				temp[k] = array[right];
				right += 1;
				k += 1;
			}
		}
		
		for (int m=0; m <temp.length; m++){
			array[low + m] = temp[m];
		}
	}
	// read the input array
	public static int[] readInputArray(){
		int[] a = {65, 12, 99, -3, 4, 5, 0};
		return a;
	}
	
	// print the array
	private static void printArray(int[] array){
		for (int i=0; i<array.length; i++){
			System.out.print(array[i] + " ");
		}
		System.out.println();
		
		System.out.println("***********************");
		}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int [] inputArray = readInputArray();
		System.out.println("Input ARRAY: ");
		printArray(inputArray);
		sort(inputArray);
		System.out.println("Sorted ARRAY: ");
		printArray(inputArray);
	}

}
