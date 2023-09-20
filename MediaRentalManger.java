package application;



import java.util.*;

public class MediaRentalManger implements MediaRentalInt {
	
	
	private int PlanLimit;
	ArrayList <Media> mediaData=new ArrayList<>();
	ArrayList <Customer> customerData=new ArrayList<>();
	
	public MediaRentalManger() {
		
	} 
	
	public ArrayList<Media> getMediaData() {
		return mediaData;
	}

	public void setMediaData(ArrayList<Media> mediaData) {
		this.mediaData = mediaData;
	}

	public ArrayList<Customer> getCustomerData() {
		return customerData;
	}

	public void setCustomerData(ArrayList<Customer> customerData) {
		this.customerData = customerData;
	}

	public MediaRentalManger(int planLimit, ArrayList<Media> mediaData, ArrayList<Customer> customerData) {
		
		this.mediaData = mediaData;
		this.customerData = customerData;
		this.PlanLimit = 2;

	}
	
///////////////////////////////////////////////////////////////////////////////////////////////////////////

	@Override
	public void addCustomer(String ID,String mobileNumber,String name, String address,String plan) {

		customerData.add(new Customer(ID,mobileNumber,name, address,plan));
		
	}
	
///////////////////////////////////////////////////////////////////////////////////////////////////////////

	@Override
	public void addMovie(String code,String title, int copiesAvailable,String rating) {
		
		mediaData.add(new Movie(code,title ,copiesAvailable,rating ));
		
	}
	
///////////////////////////////////////////////////////////////////////////////////////////////////////////

	@Override
	public void addGame(String code,String title, int numberOfCopiesAvailable, double weight) {
		
		mediaData.add(new Game(code,title ,numberOfCopiesAvailable,weight ));

	}
	
///////////////////////////////////////////////////////////////////////////////////////////////////////////
	@Override
	public void addAlbum(String code,String title, int numberOfCopiesAvailable, String artist, String songs) {
		
		mediaData.add(new Album(code,title ,numberOfCopiesAvailable,artist,songs ));
	}
	
///////////////////////////////////////////////////////////////////////////////////////////////////////////

	@Override
	public void setLimitedPlanLimit(int valueLi) {

		if (valueLi >= 0) {
			PlanLimit = valueLi;
		}

	}
///////////////////////////////////////////////////////////////////////////////////////////////////////////

	@Override
	public String getAllCustomersInfo() {
		String stringNull="";
				
		Collections.sort(customerData);
		
		for(int i=0;i<customerData.size();i++) {
			
			stringNull+=customerData.get(i).toString()+"\n";
		}
		
		return stringNull;
	}
///////////////////////////////////////////////////////////////////////////////////////////////////////////

	@Override
	public String getAllMediaInfo() {
		
		String stringNull="";
		
		Collections.sort(mediaData);
		
		for(int i=0;i<mediaData.size();i++) {
			
			stringNull+=mediaData.get(i).toString()+"\n";
			
		}
		return stringNull;
		
	}
///////////////////////////////////////////////////////////////////////////////////////////////////////////

	@Override
	public boolean addToCart(String ID, String code) {
	
		Customer customerOpen = null;
		Media MediaOpen = null;

		int i1=0;
		while(i1<customerData.size()) {
			if (customerData.get(i1).getID().equals(ID)) {
				customerOpen = customerData.get(i1);
				break;
			}
			i1++;
		}

		if (customerOpen == null) {
			return false;
		}		
		
		for(int i2=0;i2< mediaData.size();i2++) {
			if (mediaData.get(i2).getCode().equals(code)) {
				MediaOpen = mediaData.get(i2);
				break;
			}
		}
		
		
		if (MediaOpen == null) {
			return false;
		}
 
		int i3=0;
		while(i3<customerOpen.interested.size()) {
			if (customerOpen.interested.get(i3).equals(code) ) {
				return false;
			}
			i3++;
		}
		customerOpen.interested.add(MediaOpen);
		
		return true;
	}

				
				
//////////////////////////////////////////////////////////////////////////////////////////////////////////
	@Override
	public boolean removeFromCart(String ID, String code) {
		Customer customerOpen = null;
		Media MediaOpen = null;

		int i1=0;
		while(i1<customerData.size()) {
			if (customerData.get(i1).getID().equals(ID)) {
				customerOpen = customerData.get(i1);
				break;
			}
			i1++;
		}

		if (customerOpen == null) {
			return false;
		}		
		
		for(int i2=0;i2< mediaData.size();i2++) {
			if (mediaData.get(i2).getCode().equals(code)) {
				MediaOpen = mediaData.get(i2);
				break;
			}
		}
		
		
		if (MediaOpen == null) {
			return false;
		}

		int i3=0;
		while(i3<customerOpen.interested.size()) {
			if (customerOpen.interested.get(i3).equals(code) ) {
				return false;
			}
			i3++;
		}
		customerOpen.interested.remove(MediaOpen);
		
		return true;
	}

///////////////////////////////////////////////////////////////////////////////////////////////////////////

	@Override
	public String processRequests() {
		
		Collections.sort(customerData);

		boolean flage;
		
		int i1=0;
		while(i1<customerData.size()){
			
			Customer customerSave = customerData.get(i1);
			
			if (customerSave.getPlan().equalsIgnoreCase("LIMITED")) {
				
			for (int i2=0 ; i2<mediaData.size();i2++) {
				Media MediaSave =mediaData.get(i2);
				String s=MediaSave.getTitle();
				
				int i3=0 ;
				while(i3<customerSave.interested.size())
				{
					
					if (s.equals(customerSave.interested.get(i3).getTitle())) 
					{
						customerSave.rented.add(customerSave.interested.get(i3));
						customerSave.interested.remove(customerSave.interested.get(i3));
						flage =false;	
						
					}
					i3++;
				}
				
			  }
			
		   }
			
			else 
			{		
				if (customerSave.getPlan().equalsIgnoreCase("UNLIMITED"))
				{
					
				for (int i4=0 ; i4<mediaData.size();i4++) 
				{
					
					Media MediaSave=mediaData.get(i4);
					String s=MediaSave.getTitle();
					
					int i5=0;
					while( i5<customerSave.interested.size()) 
					{
						if (s.equals(customerSave.interested.get(i5).getTitle())) {
							customerSave.rented.add(customerSave.interested.get(i5));
							customerSave.interested.remove(customerSave.interested.get(i5));
							flage =false;
						}
						
						i5++;
				  }
			 }
	         }
	         }
			i1++;
	}
		
		return (false+"");

}
	
///////////////////////////////////////////////////////////////////////////////////////////////////////////

	@Override
	public boolean returnMedia(String ID, String code) {
		
		Customer customerOpen = null;
		
		int i1 = 0;
		while (i1<customerData.size())
		{
			if (customerData.get(i1).getID().equals(ID))
			{
				customerOpen = customerData.get(i1);
				break;
			}
			i1++;
		}
		
		if (customerOpen == null)
		{ 
			return false;
		}
		
		
		int i2= 0;
		while( i2<customerOpen.rented.size()) 
		{
			
			if (code.equals(customerOpen.rented.get(i2)))
			{
				customerOpen.rented.remove(code);
				
				for (int i3=0; i3<mediaData.size();i3++) 
				{
					
					if (mediaData.get(i3).getCode().equalsIgnoreCase(code)) 
					{
						mediaData.get(i3).setNumberOfCopiesAvailable(mediaData.get(i3).getNumberOfCopiesAvailable()+1);
					}
				}
				return true;
			}
			
			i2++;
		}
		
		return false;
}
///////////////////////////////////////////////////////////////////////////////////////////////////////////

	@Override
	public ArrayList<String> searchMedia(String title, String rating, String artist, String songs) {

		
		
		ArrayList<String> ArrayListOpen = new ArrayList<>();
		
		boolean titleTe= title    != null;
		boolean ratingTe=  rating  != null;
		boolean  songeTe= artist  !=null;
		boolean	artistTe= songs   != null;
		
		int i1=0;
		while(i1<mediaData.size()) {
			
			Media MediaOpen=mediaData.get(i1);
			
			if(!titleTe && !ratingTe &&!songeTe &&!artistTe ) 
			{
				ArrayListOpen.add(MediaOpen.getTitle() );
				continue;
			}
			
			if(titleTe && MediaOpen.getTitle().contains(title))
			{
				ArrayListOpen.add(MediaOpen.getTitle() );
				continue;

			}
			
			if (MediaOpen instanceof Movie)
			{

				Movie MovieOpen = (Movie) MediaOpen;
				if(ratingTe && MovieOpen.getRating().contains(rating)) 
				{
					ArrayListOpen.add(MovieOpen.getTitle());
					continue;

				}
				
				
				else if(MediaOpen instanceof Album)
				{
					
					Album AlbumOpen=(Album) MediaOpen;
					if(artistTe  && AlbumOpen.getArtist().contains(artist)) {
						ArrayListOpen.add(AlbumOpen.getArtist());
						continue;

					}
					
					if(songeTe  && AlbumOpen.getSonge().contains(songs))
					{
					ArrayListOpen.add(AlbumOpen.getTitle());
					continue;

					}
				}
			}
			i1++;
		}
		Collections.sort(ArrayListOpen);
		
		return ArrayListOpen;
	
	
}
}
