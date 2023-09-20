package application;




public abstract class Media implements Comparable<Media> {

	protected String title;
	protected int numberOfCopiesAvailable; 
	private String code;
	
	public Media() {
	}
	
	

	public Media(String code,String title, int numberOfCopiesAvailable) {
		this.title = title;
		this.numberOfCopiesAvailable = numberOfCopiesAvailable;
		this.code=code;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public int getNumberOfCopiesAvailable() {
		
		return numberOfCopiesAvailable;
	}
	
	public void setNumberOfCopiesAvailable(int numberOfCopiesAvailable) {
		this.numberOfCopiesAvailable = numberOfCopiesAvailable;
	}
	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}
	
	public void getcheckNumberOfCopiesAvailable(boolean flag) {

		if (flag==true &&numberOfCopiesAvailable>0) {

			numberOfCopiesAvailable++;
		} 
		else if(flag==false && numberOfCopiesAvailable>0) {

			numberOfCopiesAvailable--;
		}

	}
	@Override
	public int compareTo(Media o) {
		return this.getTitle().compareTo(o.getTitle());
	}
	
	@Override
	public String toString() {
		return "title=" + title + "\n number Of Copies Available=" + numberOfCopiesAvailable+"\n code="+code ;
	}
	
	
	
	
	
}
