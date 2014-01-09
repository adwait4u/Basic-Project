package quickSort;

public class QuickSortClass {
	
	//variables
	private int arraySize;
	private int[] arrayOne;
	private int itemsInArray = 0;
	
	//constructor
	QuickSortClass(int size){
		arraySize = size;
		arrayOne = new int[size];
	}
	
	//generateArray
	public void generateArray(){
		for (int i = 0; i < arraySize; i++) {
			arrayOne[i] = (int)(Math.random()*10);
			System.out.print(arrayOne[i]+" ");
		}
		itemsInArray = arraySize - 1;
	}
	
	//quickSort
	public void quickSort(int left, int right){
		if(right-left <= 0){
			return;
		}else{
			int pivot = arrayOne[right];
			int pivotPosition = partitionArray(left, right, pivot);
			
			quickSort(left, pivotPosition-1);
			quickSort(pivotPosition+1, right);
		}
	}
	//printArray
	public void printArray(){
		System.out.println();
		for (int i = 0; i < arraySize; i++) {
			System.out.print(arrayOne[i]+" ");
		}
	}
	
	//partitionArray
	public int partitionArray(int left, int right, int pivot){
		int leftPointer = left - 1;
		int rightPointer = right;
		while(true){
			while(arrayOne[++leftPointer] < pivot){
				;
			}
			while(rightPointer > 0 && arrayOne[--rightPointer] > pivot){
				;
			}
			if(leftPointer >= rightPointer){
				break;
			}else{
				swapArray(leftPointer, rightPointer);
			}
		}
		swapArray(leftPointer, right);
		return leftPointer;
	}
	
	//swap
	public void swapArray(int a, int b){
		int tmp = arrayOne[a];
		arrayOne[a] = arrayOne[b];
		arrayOne[b] = tmp;
	}
	
	public static void main(String[] args){
		QuickSortClass qsObj = new QuickSortClass(10);
		qsObj.generateArray();
		System.out.println();
		System.out.println();
		System.out.print("=============== Result of the Quick sort is as follows ========================");
		qsObj.quickSort(0, qsObj.itemsInArray);
		qsObj.printArray();
	}

}
