package bubbleSort;

public class BubbleClass {
	
	// main
	public static void main(String[] args){
	BubbleClass bubbleObj  = new BubbleClass(10);
	bubbleObj.generateArray();
	bubbleObj.bubbleSort();
	}//end of main
	
	//bubbleSort method
	public void bubbleSort(){
		for (int i = arraySize-1; i > 1; i--) {
			for (int j = 0; j < i; j++) {
				if(arrayOne[j] > arrayOne[j+1])
				{
					swapVal(j,j+1);
				}
				
			}
		}
		
		System.out.println();
		System.out.println();
		System.out.println("*********The sorted Array is*********");
		for (int i = 0; i < arraySize; i++) {
			System.out.print(arrayOne[i]+" ");
			}
		 
	}
		
	
	//constructor
	BubbleClass(int size){
		arraySize = size;
		arrayOne = new int [size];
	}

	// generating array
	public void generateArray(){
		for (int i = 0; i < arraySize; i++) {
		arrayOne[i] = (int)(Math.random()*100)+10;
		System.out.print(arrayOne[i]+" ");
		}
	}
	
	// swap method
	public void swapVal(int a, int b){
		int temp = arrayOne[a];
		arrayOne[a] = arrayOne[b];
		arrayOne[b] = temp;
	}
	//defining variables
	private  int arraySize;
	private  int[] arrayOne;
}
