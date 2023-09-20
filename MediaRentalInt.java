package application;


import java.util.ArrayList;

public interface MediaRentalInt {

	public void addCustomer(String ID,String mobileNumber,String name,String address,String plan);
	
	public void addMovie(String code,String title, int copiesAvailable,String rating);
	
	public void addGame(String code,String title, int copiesAvailable,double weight);
	
	public void addAlbum(String code,String title,int copiesAvailable,String artist,String songs);
	
	public void setLimitedPlanLimit(int value);
	
	public String getAllCustomersInfo();
	
	public String getAllMediaInfo();
	
	public boolean addToCart(String ID,String code);
	
	public boolean removeFromCart(String ID, String code);
	
	public String processRequests();
	
	public boolean returnMedia(String ID,String code);
	
	public ArrayList<String> searchMedia(String title,String rating, String artist,String songs);
}