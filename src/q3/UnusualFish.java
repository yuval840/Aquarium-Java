/**
 /**
 * Yakir Ovadia - 204591192
 * Yuval Efrat - 204342042
 */

package q3;

public class UnusualFish extends Fish {
	
	private int factor;
	
	/**
	 * Constructor of UnusualFish class
	 * @param size
	 * @param x_front
	 * @param y_front
	 * @param horSpeed
	 * @param verSpeed
	 * @param col
	 * @param factor
	 */
	public UnusualFish(int size, int x_front,int y_front, int horSpeed, int verSpeed, int col, int factor) {
		
		super(size, x_front, y_front, horSpeed, verSpeed, col);
		this.factor = factor;
		
	}
	
	/**
	 * Default constructor of UnusualFish class
	 */
	public UnusualFish() {
			
		super(0, 0, 0, 0, 0, 0);
		this.factor = 0;
			
	}
	
	/**
	 * Copy constructor of UnusualFish class
	 */
	public UnusualFish(UnusualFish other) {
		
		super(other.getSize(), other.getX_front(), other.getY_front(), other.getHorSpeed(), other.getVerSpeed(), other.getCol());
		other.factor = this.factor;
		
	}
	
	
	/**
	 * 
	 * @return factor value
	 */
	public int getFactor() {
		return factor;
	}

	/**
	 * set function for factor value
	 * @param factor
	 */
	public void setFactor(int factor) {
		this.factor = factor;
	}
	
	/**
	 * the function returns the size value of UnusualFish
	 */
	public int getSize() {
		return(this.getSize_forUnFish())*(this.factor);
	}
	
	/**
	 * the function returns the kind of the creature as "UnusualFish"
	 */
	@Override
	public String getAnimalName() {
		return "UnusualFish";
	}
	
	/**
	 * override of toString method the functions returns the kind of the creature as "UnusualFish"
	 */
	@Override
	public String toString() {
		return "UnusualFish";
	}
	
	/**
	 * override equals operator the operator checks the type of the creatures
	 * if they have the same type the operator checks the size of the creatures
	 */
	@Override
	public boolean equals(Object o) {
		if(o instanceof UnusualFish) {
			if (this.getSize() == ((UnusualFish)o).getSize()) {
				return true;
			}
		}
		return false;
	}	
}