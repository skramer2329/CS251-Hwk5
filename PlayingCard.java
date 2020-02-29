package card;

public class PlayingCard extends Card {

	private int rank;
	String suit;
	

	public PlayingCard(double height, double width, int rank, String suit) {
		super(height, width, false, verifySuit(suit));
		if (rank < 1 || rank > 13) {
			this.rank = 1;
		} 
		else {
			this.rank = rank;
		}
	
	}

	
	private static String verifySuit(String str) {
		if (str == null) {
			return "Spade";
		}
		else if (str.equalsIgnoreCase("club") || str.equalsIgnoreCase("heart") || str.equalsIgnoreCase("diamond")
				|| str.equalsIgnoreCase("spade")) {
			return str;
		}
		else {
			return "Spade";
		}
	}

	
	@Override
	public String toString() {
		return "a " + getRank() + " of " + this.getText() + "s.";
	}

	

	public String getRank() {
		if(rank == 1) {
			return "Ace";
		}
		else if(rank == 11) {
			return "Jack";
		}
		else if(rank == 12) {
			return "Queen";
		}
		else if(rank == 13) {
			return "King";
		}
		else
			return Integer.toString(rank);
	}
	
	public String getSuit() {
		return super.getText();
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + rank;
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		PlayingCard other = (PlayingCard) obj;
		if (rank != other.rank)
			return false;
		return true;
	}
}
