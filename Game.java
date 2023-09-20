package application;


public class Game extends Media {
	

	private double weight;
	
	public Game(String code,String title, int numberOfCopiesAvailable, double weight) {
		super(code,title, numberOfCopiesAvailable);
		this.weight = weight;
	}
	
	public double getWeight() {
		return weight;
	}
	
	

	public void setWeight(double weight) {
		this.weight = weight;
	}

	@Override
	public String toString() {
		return super.toString()+" \n weigh=" + weight ;
	}
	
}