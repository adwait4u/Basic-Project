package quickSort;

public class SecondQuickSort {

		//variables
		private int arraySize;
		private int[] arrayOne;
		private int itemsInArray = 0;
		
		//constructor
		SecondQuickSort(int size){
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
		
		//printArray
		public void printArray(){
			System.out.println();
			for (int i = 0; i < arraySize; i++) {
				System.out.print(arrayOne[i]+" ");
			}
		}
		
		//quickSort
		public void quickSort(int left, int right){
			if (right-left <= 0){
				return;
				}
			else{
			int position = (int)(right)/2;//System.out.println(position);
			int pivot = arrayOne[position];//System.out.println(pivot); here a[4] = 1
			int value = partition(left, pivot, right);//System.out.println();System.out.println(value);
			
			quickSort(0, value-1);
			quickSort(value+1, 7);
			}
		}
		
		//partition
		public int partition(int lt, int piv, int rt){
			while(piv>arrayOne[lt]){
				lt++;
			}
			while(piv<arrayOne[rt]){
				rt--;
			}
				swap(arrayOne[lt], arrayOne[rt]);
			
			return rt;
		}
		
		//swap
		public static void swap(int x, int y){
			int tmp = x;
			x = y;
			y = tmp;
		}
		
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SecondQuickSort sqsObj = new SecondQuickSort(10);
		sqsObj.generateArray();
		sqsObj.printArray();
		sqsObj.quickSort(0, sqsObj.itemsInArray );
		sqsObj.printArray();

	}

}
