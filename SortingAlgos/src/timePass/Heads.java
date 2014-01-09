package timePass;

public class Heads extends Exception{
	private String str;
	
	public Heads(String s){
		super("You've got "+s);
		this.str = s;
	}

}
