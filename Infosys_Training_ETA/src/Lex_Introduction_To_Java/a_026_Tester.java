package Lex_Introduction_To_Java;


class MovieTicket {
    //Implement your code here 
	private int movieID;
	private int noOdSeats;
	private double costPerTicket;
	/*MovieTicket(int movieID, int noOdSeats)
	{
		movieID = movieID;
		noOdSeats = noOdSeats;
	}*/
	
	
	public MovieTicket(int movieID, int noOdSeats) {
		this.movieID = movieID;
		this.noOdSeats = noOdSeats;
	}

	public int getMovieID() {
		return movieID;
	}


	public void setMovieID(int movieID) {
		this.movieID = movieID;
	}


	public int getNoOdSeats() {
		return noOdSeats;
	}


	public void setNoOdSeats(int noOdSeats) {
		this.noOdSeats = noOdSeats;
	}


	public double getCostPerTicket() {
		return costPerTicket;
	}


	public void setCostPerTicket(double costPerTicket) {
		this.costPerTicket = costPerTicket;
	}

	public double calculateTotalAmount() {
		// TODO Auto-generated method stub
		double amount = 0;
		double tax = (2/100)*amount;
		switch(movieID)
		{
		case 111:
			amount = 7*noOdSeats;
			break;
		case 112:
			amount = 8*noOdSeats;
			break;
		case 113:
			amount = 8.5*noOdSeats;
			break;
		default:
			System.out.println("Why you always enter wrong input???");
		}
		return (amount + tax);
	}
	
	

}

class a_026_Tester {
    public static void main(String[] args) {
        MovieTicket movieTicket = new MovieTicket(112, 3);
        double amount = movieTicket.calculateTotalAmount();
        if (amount==0)
            System.out.println("Sorry! Please enter valid movie Id and number of seats");
        else
            System.out.println("Total amount for booking : $" + amount);
    }
}
