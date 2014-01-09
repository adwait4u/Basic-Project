package flyTunesPackage;
import java.util.*;

public class FTAlbum extends FTSong {
	public void Album(String albumName, String albumBand){
		title = albumName;
		band = albumBand;
	}
	public String getAlbumName(){
		return title;
	}
	public String getAlbumBand(){
		return band;
	}
	public void addSongs(FTSong song){
		FTSong.add(song);
	}
	public Iterator<FTSong> getSongs(){
		return songs.iterator();
	}
	
	public String toString(){
		return("\"" +title +"\"by" + band +);
	}
	
	private String title;
	private String band;
	private Arraylist<FTSong> songs = new Arraylist<FTSong>();
}
