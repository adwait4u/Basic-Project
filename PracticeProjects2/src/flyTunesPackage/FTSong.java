package flyTunesPackage;

public class FTSong {
	
	public void Song(String songName, String bandName, double songPrice){
		 title = songName;
		 band = bandName;
		 price = songPrice;
	}
	public String getSongName(){
		return title;
	}
	public String getBandName(){
		return band;
	}
	public void setSongPrice(double songPrice){
		price = songPrice;
	}
	public double getSongPrice(){
		return price;
	}
	@Override
	public String toString(){
		return ("\""+title+"\"by" + band + "costs $ " +price);
	}
	private String title;
	private String band;
	private double price;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
	}

}
