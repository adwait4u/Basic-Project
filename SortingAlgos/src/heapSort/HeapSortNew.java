package heapSort;

public class HeapSortNew {
	public void createHeap(){
		
				
		for (int i = 0; i < a.length; i++) {
			int prnt = i;
			int ltChild = 2*prnt + 1;
			int rtChild = 2*prnt + 2;
			theHeap[prnt] = a[i];
			System.out.print("Parent is "+theHeap[prnt] + " | ");
			if(ltChild < a.length){
				theHeap[ltChild] = a[2*prnt + 1];
				System.out.print("leftChild is "+theHeap[ltChild]+ " | ");
				}
				if(rtChild < a.length){
					theHeap[rtChild] = a[2*prnt + 2];
				System.out.println("RightChild is "+theHeap[rtChild]);
				  }else{
					System.out.println("No more children");
					}
				/*
			if(theHeap[prnt] < a[ltChild]){
				swap(prnt,ltChild);
				System.out.println("Now LeftChild is "+theHeap[ltChild]+" | ");
			}else if (theHeap[prnt] > a[rtChild])
				swap(prnt,rtChild);
			System.out.println("Now LeftChild is "+theHeap[rtChild]);*/
		}
	}
	public void swap(int x, int y){
		int tmp = a[x];
		a[x] = a[y];
		a[y] = tmp;
	}
	
	//printArray
	public void printArray(){
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		HeapSortNew hsObj = new HeapSortNew();
		System.out.println("==== Given array ====\n");
		hsObj.printArray();
		System.out.println("\n==== Creating heap out of the given array ====");
		hsObj.createHeap();
		
	}

	public int[] a = {4,3,5,6,1,7,8,9};
	public int[] theHeap = new int[a.length];
}
