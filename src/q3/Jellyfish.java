/**
 /**
 * Yakir Ovadia - 204591192
 * Yuval Efrat - 204342042
 */

package q3;

import java.awt.Color;
import java.awt.Graphics;

public class Jellyfish extends Swimmable {
	private int EAT_DISTANCE;
	private int size;
	private int col;
	private int eatCount;
	private int x_front;
	private int y_front;
	private int x_dir;
	private int y_dir;
	
	int x_flag=1;
	int y_flag=1;
	private boolean suspended;
	private Thread Thread0;
	/**
	 * Constructor for Jellyfish class
	 * 
	 * @param size
	 * @param x_front
	 * @param y_front
	 * @param horSpeed
	 * @param verSpeed
	 * @param col
	 */
	public Jellyfish(int size, int x_front, int y_front, int horSpeed, int verSpeed, int col) {
		super(horSpeed, verSpeed);
		this.EAT_DISTANCE = 4;
		this.size = size;
		this.col = col;
		this.eatCount = 0;
		this.x_front = x_front;
		this.y_front = y_front;
		this.x_dir = 1;
		this.y_dir = 1;
		
		this.suspended=false;
		this.Thread0=new Thread(this);
		Thread0.start();
	}

	/**
	 * Default constuctor for Jellyfish class
	 */
	public Jellyfish() {
		super(0, 0);
		this.EAT_DISTANCE = 0;
		this.size = 0;
		this.col = 0;
		this.eatCount = 0;
		this.x_front = 0;
		this.y_front = 0;
		this.x_dir = 0;
		this.y_dir = 0;
	}

	/**
	 * Copy constructor for Jellyfish class
	 * 
	 * @param other
	 */
	public Jellyfish(Jellyfish other) {
		super(other.horSpeed, other.verSpeed);
		other.EAT_DISTANCE = this.EAT_DISTANCE;
		other.size = this.size;
		other.col = this.col;
		other.eatCount = this.eatCount;
		other.x_front = this.x_front;
		other.y_front = this.y_front;
		other.x_dir = this.x_dir;
		other.y_dir = this.y_dir;

	}

	/**
	 * return eatCount value
	 */
	@Override
	public int getEatCount() {
		return this.eatCount;
	}

	/**
	 * return Size value
	 */
	@Override
	public int getSize() {
		return this.size;
	}

	/**
	 * return the color of the fish
	 */
	@Override
	public String getColor() {
		if (col == 1)
			return "Black";
		if (col == 2)
			return "Red";
		if (col == 3)
			return "Blue";
		if (col == 4)
			return "Green";
		if (col == 5)
			return "Cyan";
		if (col == 6)
			return "Orange";
		if (col == 7)
			return "Yellow";
		if (col == 8)
			return "Magenta";
		if (col == 9)
			return "Pink";
		return null;
	}

	public int[] getColor_arr() {

		int[] colorArray = { 0, 0, 0 };

		if (col == 1)
			return colorArray;

		if (col == 2) {
			colorArray[0] = 255;
			return colorArray;
		}
		if (col == 3) {
			colorArray[2] = 255;
			return colorArray;
		}
		if (col == 4) {
			colorArray[1] = 255;
			return colorArray;
		}
		if (col == 5) {
			colorArray[1] = 255;
			colorArray[2] = 255;
			return colorArray;
		}
		if (col == 6) {
			colorArray[0] = 255;
			colorArray[1] = 165;
			return colorArray;
		}
		if (col == 7) {
			colorArray[0] = 255;
			colorArray[1] = 255;
			return colorArray;
		}
		if (col == 8) {
			colorArray[0] = 255;
			colorArray[2] = 255;
			return colorArray;
		}
		if (col == 9) {
			colorArray[0] = 255;
			colorArray[1] = 192;
			colorArray[2] = 203;
			return colorArray;
		}

		return null;

	}

	/**
	 * the function increase the amount of eatCount the function changing the size
	 * of the fish if the fish reached to max Eat Distance
	 */
	@Override
	public void eatInc() {
		this.eatCount++;
		if (this.eatCount == this.EAT_DISTANCE) {
			this.size++;
			this.eatCount = 0;
		}
	}

	/**
	 * the function changing the size of the fish
	 * 
	 * @param size
	 */
	public void changeJellyfish(int size) {
		this.size = size;
	}

	/**
	 * the function returns the kind of the swimmable creature as "Jellyfish"
	 */
	@Override
	public String getAnimalName() {

		return "Jellyfish";
	}

	/**
	 * override of toString for the swimmable creature as "Jellyfish"
	 */
	@Override
	public String toString() {
		return "Jellyfish";
	}

	/**
	 * 
	 * @return the EAT_DISTANCE value
	 */
	public int getEAT_DISTANCE() {
		return EAT_DISTANCE;
	}

	/**
	 * set function for eat_distance
	 * 
	 * @param eAT_DISTANCE
	 */
	public void setEAT_DISTANCE(int eAT_DISTANCE) {
		EAT_DISTANCE = eAT_DISTANCE;
	}

	/**
	 * 
	 * @return the color of the jellyfish
	 */
	public int getCol() {
		return col;
	}

	/**
	 * set function for the color of the jellyfish
	 * 
	 * @param col
	 */
	public void setCol(int col) {
		this.col = col;
	}

	/**
	 * get function for the x_front
	 * 
	 * @return x_front value
	 */
	public int getX_front() {
		return x_front;
	}

	/**
	 * set function for x_front
	 * 
	 * @param x_front
	 */
	public void setX_front(int x_front) {
		this.x_front = x_front;
	}

	/**
	 * get function for the y_front
	 * 
	 * @return y_front value
	 */
	public int getY_front() {
		return y_front;
	}

	/**
	 * set function for y_front
	 * 
	 * @param y_front
	 */
	public void setY_front(int y_front) {
		this.y_front = y_front;
	}

	/**
	 * get function for the x_dir
	 * 
	 * @return x_dir value
	 */
	public int getX_dir() {
		return x_dir;
	}

	/**
	 * set function for x_dir
	 * 
	 * @param x_dir
	 */
	public void setX_dir(int x_dir) {
		this.x_dir = x_dir;
	}

	/**
	 * 
	 * @return y_dir value
	 */
	public int getY_dir() {
		return y_dir;
	}

	/**
	 * set function for y_dir value
	 * 
	 * @param y_dir
	 */
	public void setY_dir(int y_dir) {
		this.y_dir = y_dir;
	}

	/**
	 * set function for size value
	 * 
	 * @param size
	 */
	public void setSize(int size) {
		this.size = size;
	}

	/**
	 * set function for eatCount value
	 * 
	 * @param eatCount
	 */
	public void setEatCount(int eatCount) {
		this.eatCount = eatCount;
	}

	/**
	 * override equals operator the operator checks the type of the creatures if
	 * they have the same type the operator checks the size of the creatures
	 */
	@Override
	public boolean equals(Object o) {
		if (o instanceof Jellyfish) {
			if (this.getSize() == ((Jellyfish) o).getSize()) {
				return true;
			}
		}
		return false;
	}

	public void drawAnimal(Graphics g) {
		
		int[] temp_color = getColor_arr();
		Color c = new Color(temp_color[0], temp_color[1], temp_color[2]);
		int numLegs;
		if (size < 40)
			numLegs = 5;
		else if (size < 80)
			numLegs = 9;
		else
			numLegs = 12;

		g.setColor(c);
		g.fillArc(x_front - size / 2, y_front - size / 4, size, size / 2, 0, 180);

		for (int i = 0; i < numLegs; i++)
			g.drawLine(x_front - size / 2 + size / numLegs + size * i / (numLegs + 1), y_front,
					x_front - size / 2 + size / numLegs + size * i / (numLegs + 1), y_front + size / 3);
	}
	 @Override
	    public void run()
	    {
		 Thread me=Thread.currentThread();
		
		 while(Thread0==me)
	    	{

				synchronized (this) {
					while (suspended) {
						try {
							wait();
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
					if(AquaPanel.res==true)
					{
						break;
					}
				}
				try {
					Thread.sleep(50);
				} catch (InterruptedException e) {
					System.out.println("Sleep ERROR!");
				}
				x_front += horSpeed * x_flag;
				y_front += verSpeed * y_flag;
				
				
				
				if (x_front > AquaPanel.dmwi) {
					x_flag = -1;
					x_front = AquaPanel.dmwi;
				} else if (x_front < 0) {
					x_flag = 1;
					x_front = 0;
				}

				if (y_front > AquaPanel.dmhe) {
					y_flag = -1;
					y_front = AquaPanel.dmhe;
				} else if (y_front < 0) {
					y_flag = 1;
					y_front = 0;
				}
	    		
	    	}
	    }
	    
		@Override
		public void setSuspend() {
			suspended=true;
			
		}

		@Override
		public void setResume() {
			this.suspended=false;
			synchronized (this){
				this.notify();
			}
			
		}

//		@Override
//		public void setBarrier(CyclicBarrier b) {
//			// TODO Auto-generated method stub
			
//	}
//}
}