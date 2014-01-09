package insertionSort;

public class InsertionSortClass {

	//variables
	private int arraySize;
	private int[] arrayOne;
	
	//constructor
	InsertionSortClass(int size){
		arraySize = size;
		arrayOne = new int[size];
	}
	
	//generateArray
	public void generateArray(){
		for (int i = 0; i < arraySize; i++) {
			arrayOne[i] = (int)(Math.random()*100)+10;
			System.out.print(arrayOne[i]+" ");
		}
	}
	
	//insertionSort
	public void insertionSort(){
		for (int i = 0; i < arraySize; i++) {
			int j = i;
			int insert = arrayOne[i];
			
			while((j > 0) && arrayOne[j-1]>insert){
				arrayOne[j] = arrayOne[j-1];
				j--;
			}
			arrayOne[j] = insert;
		}
		System.out.println();
		for (int i = 0; i < arraySize; i++) {
			System.out.print(arrayOne[i]+" ");
		}
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		InsertionSortClass isObj = new InsertionSortClass(10);
		isObj.generateArray();
		System.out.println();
		System.out.println();
		System.out.print("=============== Result of the Insertion sort is as follows ========================");
		isObj.insertionSort();
	}

}
