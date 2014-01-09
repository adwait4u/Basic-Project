package timePass;

public class Tails extends Exception{
	private String str;
	public Tails(String s){
		super("You've got "+s);
		this.str = s;
		
	}

}
