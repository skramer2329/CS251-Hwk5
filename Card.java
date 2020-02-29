package card;
/*
 * A class that represents a physical card
 */
public class Card {

	private double height;
	private double width;
	private String text;
	protected boolean isGlossy;
	
	
	

	public Card(double height, double width, boolean isGlossy, String text) {
		//TODO assign fields. Minimum height and width should be 0
		
		if(height < 0) {
			this.height = 0;
		}
		else if(width < 0) {
			this.width = 0;
		}
		else {
		this.height = height;
		this.width = width;
		}
		this.isGlossy = isGlossy;
		this.text = text;
		
	}
	
	
	
	@Override
	public String toString() {
		//TODO return a String
		//format: “a <width> by <height> inch card.”
		return "a " + width + " by " + height + " inch card.";
	}


	public final String getText() {
		return this.text;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(height);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + (isGlossy ? 1231 : 1237);
		result = prime * result + ((text == null) ? 0 : text.hashCode());
		temp = Double.doubleToLongBits(width);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Card other = (Card) obj;
		if (Double.doubleToLongBits(height) != Double.doubleToLongBits(other.height))
			return false;
		if (isGlossy != other.isGlossy)
			return false;
		if (text == null) {
			if (other.text != null)
				return false;
		} else if (!text.equals(other.text))
			return false;
		if (Double.doubleToLongBits(width) != Double.doubleToLongBits(other.width))
			return false;
		return true;
	}
	
	//TODO write the following public methods from scratch
	//they should all be final!!!
	
	public final double getHeight() {
		return height;
	}
	
	public final double getWidth() {
		return width;
	}
	
	
	
}
