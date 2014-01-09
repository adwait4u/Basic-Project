package quickSort;

public class QuickSortNew {

	
	public void quickSort(int left, int right){
		/* This is to verify two conditions. 
		1. If the left and right are pointing to the same location & 
		2. left and right have crossed each other*/
		if (right-left <= 0)
		{
			return;
		}else{
			int pivot = a[right];//System.out.println(pivot); here a[4] = 1
			int position = partition(left, pivot, right);//System.out.println();System.out.println(value);
			
			if(position == -1 ){
				System.out.println("DONE");
				return;
			}else{
				printArray();
				quickSort(0, position-1);
				quickSort(position+1, 7);
				}
			}
	}
	
	//printArray
	public void printArray(){
		for (int j = 0; j < a.length; j++) {
			
			System.out.print(a[j] + " ");
			}
		System.out.println();

	}
	public int partition(int lt, int piv, int rt){
	while(true){
		while(piv>a[lt] && lt < 7){
			lt++;
		}
		while(piv<a[rt] && rt >0){
			rt--;
		}
			swap(lt, rt);
			System.out.println(a[lt] +" and "+a[rt] +" got swapped");
			printArray();
		if (lt >= rt){
			break;
			}
		 }//while true ends
		return lt;
	}
	public void swap(int x, int y){
		int tmp = a[x];
		a[x] = a[y];
		a[y] = tmp;
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("======before======");
		QuickSortNew obj = new QuickSortNew();
		obj.printArray();
		obj.quickSort(0, 7);
		System.out.println();
		System.out.println("======after======");
		obj.printArray();
		}

	private int[] a = {8, 8, 4, 2, 5, 6, 3, 0, 1};
	
	//private int[] a = {4, 5, 3, 6, 1, 8, 7, 9};

}
