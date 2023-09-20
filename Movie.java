package application;


import javafx.scene.control.TextField;

public class Movie extends Media {

	private String rating;
	
	public Movie() {
		
	}

	public Movie(String code,String title, int numberOfCopiesAvailable, String rating) {
		super(code,title, numberOfCopiesAvailable);
		this.rating = rating;
	}


	public String getRating() {
		return rating;
	}

	public void setRating(String  rating) {
		this.rating = rating;
	}
	
	

	@Override
	public String toString() {
		return super.toString()+"\n rating=" + rating ;
	}

	
}
