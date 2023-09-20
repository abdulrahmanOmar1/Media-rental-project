package application;


public class Album extends Media {

	private String artist;
	private String songs;
	

	public Album() {
		
	}
	public Album(String code,String title, int numberOfCopiesAvailable, String artist, String songs) {
		super(code,title, numberOfCopiesAvailable);
		this.artist = artist;
		this.songs = songs;
	} 
	
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	public String getSonge() {
		return songs;
	}
	
	public void setSonge(String songe) {
		this.songs = songs;
	}
	
	
	@Override
	public String toString() {
		return super.toString()+"artist=" + artist + "\n songe=" + songs ;
	}
	
	
}
