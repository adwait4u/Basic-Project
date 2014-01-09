package codeEval;

public class WordCount {
	
	public static void strLen(){
		String[] words = str.split(" ");
		for (String string : words) {
			System.out.print(string.length()+" ");
		}
	}
	public static void main(String[] args) {
		strLen();
	}

	//variables
	private static String str = "This is a short sentence.";
	
}
