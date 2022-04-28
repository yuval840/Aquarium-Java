/**
 * Yakir Ovadia - 204591192
 * Yuval Efrat - 204342042
 */

package q3;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Polygon;

public class Fish extends Swimmable {

	private int EAT_DISTANCE;
	private int size;
	private int color;
	private int eatCount;
	private int x_front;
	private int y_front;
	private int x_dir;
	private int y_dir;
	
	private Thread Thread0;
	private Boolean suspended;
	
	private int x_flag = 1;
	private int y_flag = 1;

	/**
	 * Fish class constructor
	 * 
	 * @param size
	 * @param x_front
	 * @param y_front
	 * @param horSpeed
	 * @param verSpeed
	 * @param col
	 */
	public Fish(int size, int x_front, int y_front, int horSpeed, int verSpeed, int col) {

		super(horSpeed, verSpeed);
		this.EAT_DISTANCE = 4;
		this.size = size;
		this.color = col;
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
	 * Default Constructor of Fish class
	 */
	public Fish() {

		super(0, 0);
		this.EAT_DISTANCE = 0;
		this.size = 0;
		this.color = 0;
		this.eatCount = 0;
		this.x_front = 0;
		this.y_front = 0;
		this.x_dir = 0;
		this.y_dir = 0;

	}

	/**
	 * Copy constructor of fish class
	 * 
	 * @param other
	 */
	public Fish(Fish other) {

		super(other.horSpeed, other.verSpeed);
		other.EAT_DISTANCE = this.EAT_DISTANCE;
		other.size = this.size;
		other.color = this.color;
		other.eatCount = this.eatCount;
		other.x_front = this.x_front;
		other.y_front = this.y_front;
		other.x_dir = this.x_dir;
		other.y_dir = this.y_dir;

	}

	/**
	 * 
	 * @return x_front value;
	 */
	public int getX_front() {

		return x_front;
	}

	/**
	 * set function for x_front variable
	 * 
	 * @param x_front
	 */

	public void setX_front(int x_front) {

		this.x_front = x_front;
	}

	/**
	 * 
	 * @return y_front value;
	 */
	public int getY_front() {
		return y_front;
	}

	/**
	 * set function for y_front variable
	 * 
	 * @param y_front
	 */
	public void setY_front(int y_front) {
		this.y_front = y_front;
	}

	/**
	 * 
	 * @return x_dir value
	 */
	public int getX_dir() {
		return x_dir;
	}

	/**
	 * set function for x_dir variable
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
	 * set function for y_dir variable
	 * 
	 * @param y_dir
	 */
	public void setY_dir(int y_dir) {
		this.y_dir = y_dir;
	}

	/**
	 * the function returns the color of the fish
	 */
	public String getColor() {

		if (color == 1)
			return "Black";
		if (color == 2)
			return "Red";
		if (color == 3)
			return "Blue";
		if (color == 4)
			return "Green";
		if (color == 5)
			return "Cyan";
		if (color == 6)
			return "Orange";
		if (color == 7)
			return "Yellow";
		if (color == 8)
			return "Magenta";
		if (color == 9)
			return "Pink";
		return null;

	}

	public int[] getColor_arr() {

		int[] colorArray = { 0, 0, 0 };

		if (color == 1)
			return colorArray;

		if (color == 2) {
			colorArray[0] = 255;
			return colorArray;
		}
		if (color == 3) {
			colorArray[2] = 255;
			return colorArray;
		}
		if (color == 4) {
			colorArray[1] = 255;
			return colorArray;
		}
		if (color == 5) {
			colorArray[1] = 255;
			colorArray[2] = 255;
			return colorArray;
		}
		if (color == 6) {
			colorArray[0] = 255;
			colorArray[1] = 165;
			return colorArray;
		}
		if (color == 7) {
			colorArray[0] = 255;
			colorArray[1] = 255;
			return colorArray;
		}
		if (color == 8) {
			colorArray[0] = 255;
			colorArray[2] = 255;
			return colorArray;
		}
		if (color == 9) {
			colorArray[0] = 255;
			colorArray[1] = 192;
			colorArray[2] = 203;
			return colorArray;
		}

		return null;

	}

	/**
	 * function returns eatCount value
	 */
	@Override
	public int getEatCount() {
		return this.eatCount;
	}

	/**
	 * the function returns the size of the fish
	 */

	@Override
	public int getSize() {
		return this.size;
	}

	/**
	 * 
	 * @return the size of the fish
	 */
	public int getSize_forUnFish() {
		return this.size;
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
	 * 
	 * @return getCol value;
	 */
	public int getCol() {
		return color;
	}

	/**
	 * set function for the color of the fish
	 * 
	 * @param col
	 */
	public void setCol(int col) {
		this.color = col;
	}

	/**
	 * set function for the size of the fish
	 * 
	 * @param size
	 */
	public void setSize(int size) {
		this.size = size;
	}

	/**
	 * set function for EAT_DISTANCE value;
	 * 
	 * @param eAT_DISTANCE
	 */
	public void setEAT_DISTANCE(int eAT_DISTANCE) {
		EAT_DISTANCE = eAT_DISTANCE;
	}

	/**
	 * 
	 * @return eat_distance value;
	 */
	public int getEAT_DISTANCE() {
		return EAT_DISTANCE;
	}

	/**
	 * the function changing the size of the fish;
	 * 
	 * @param x
	 */
	public void changeFish() {
		this.size++;
	}

	/**
	 * the function chaging the color of the fish;
	 */
	public void changeColor() {
		if (this.color == 9) {
			this.color = 1;
		}

		else {
			this.color++;
		}
	}

	/**
	 * the function returns the kind of the Swimmable creature "Fish"
	 */
	@Override
	public String getAnimalName() {
		return "Fish";
	}

	/**
	 * override for to_string function returns "Fish" as value;
	 */
	@Override
	public String toString() {
		return "Fish";
	}

	/**
	 * overriding for equals operator
	 */
	@Override
	public boolean equals(Object o) {
		if (o instanceof Fish) {
			if (this.getSize() == ((Fish) o).getSize()) {
				return true;
			}
		}
		return false;
	}

	public void drawAnimal(Graphics g) {
		
		int [] temp_color = getColor_arr(); 
		Color c = new Color(temp_color[0], temp_color[1], temp_color[2]);

		g.setColor(c);

		if (x_dir == 1) // fish swims to right side
		{
			// Body of fish
			g.fillOval(x_front - size, y_front - size / 4, size, size / 2);

			// Tail of fish
			int[] x_t = { x_front - size - size / 4, x_front - size - size / 4, x_front - size };
			int[] y_t = { y_front - size / 4, y_front + size / 4, y_front };
			Polygon t = new Polygon(x_t, y_t, 3);
			g.fillPolygon(t);

			// Eye of fish
			Graphics2D g2 = (Graphics2D) g;
			g2.setColor(new Color(255 - c.getRed(), 255 - c.getGreen(), 255 - c.getBlue()));
			g2.fillOval(x_front - size / 5, y_front - size / 10, size / 10, size / 10);

			// Mouth of fish
			if (size > 70)
				g2.setStroke(new BasicStroke(3));
			else if (size > 30)
				g2.setStroke(new BasicStroke(2));
			else
				g2.setStroke(new BasicStroke(1));
			g2.drawLine(x_front, y_front, x_front - size / 10, y_front + size / 10);
			g2.setStroke(new BasicStroke(1));
		} else // fish swims to left side
		{
			// Body of fish
			g.fillOval(x_front, y_front - size / 4, size, size / 2);

			// Tail of fish
			int[] x_t = { x_front + size + size / 4, x_front + size + size / 4, x_front + size };
			int[] y_t = { y_front - size / 4, y_front + size / 4, y_front };
			Polygon t = new Polygon(x_t, y_t, 3);
			g.fillPolygon(t);

			// Eye of fish
			Graphics2D g2 = (Graphics2D) g;
			g2.setColor(new Color(255 - c.getRed(), 255 - c.getGreen(), 255 - c.getBlue()));
			g2.fillOval(x_front + size / 10, y_front - size / 10, size / 10, size / 10);

			// Mouth of fish
			if (size > 70)
				g2.setStroke(new BasicStroke(3));
			else if (size > 30)
				g2.setStroke(new BasicStroke(2));
			else
				g2.setStroke(new BasicStroke(1));
			
			g2.drawLine(x_front, y_front, x_front + size / 10, y_front + size / 10);
			g2.setStroke(new BasicStroke(1));
		}
	}
	 @Override
	    public void run()
	    {
		 Thread me= Thread.currentThread();
		 AquaPanel.res=false;
	    	while(Thread0==me)
	    	{
	    		//System.out.println(x_front);
				synchronized (this) {
					while (suspended) {
						try {
							wait();
						} catch (InterruptedException e) {
							e.printStackTrace();
							break;
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
					x_dir = -1;
				} else if (x_front < 0) {
					x_flag = 1;
					x_front = 0;
					x_dir = 1;
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
			suspended=false;
			synchronized (this) {
				notify();
			}
		}

//		@Override
//		public void setBarrier(CyclicBarrier b) {
//			// TODO Auto-generated method stub
			
//	}
	}