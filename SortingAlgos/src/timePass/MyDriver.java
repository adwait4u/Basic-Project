package timePass;

public class MyDriver {
	public void headMethod(String str) throws Heads{
		Heads even = new Heads(str);
		throw even;
	}
	public void tailMethod(String str) throws Tails{
		Tails odd = new Tails(str);
		throw odd;
	}
	
	public static void main(String[] args) {
		MyDriver mdObj = new MyDriver();
		int n = (int)(Math.random()*2);
		if (n == 0){
			try {
				mdObj.headMethod("Heads");
			} catch (Heads h) {
				h.printStackTrace();
			}
		}else{
			try {
				mdObj.tailMethod("Tails");
			} catch (Tails t) {
				t.printStackTrace();
			}
		}
	
	}
}
