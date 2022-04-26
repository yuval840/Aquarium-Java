package q3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class AquaPanel extends JPanel implements ActionListener {

	static final private long serialVersionUID = 1L;

	JButton addAnimal;
	private final static String BUTTON_TEXT1 = "Add Animal";
	JButton sleep;
	private final static String BUTTON_TEXT2 = "Sleep";
	JButton wakeUp;
	private final static String BUTTON_TEXT3 = "Wake Up";
	JButton reset;
	private final static String BUTTON_TEXT4 = "Reset";
	JButton food;
	private final static String BUTTON_TEXT5 = "Food";
	JButton info;
	private final static String BUTTON_TEXT6 = "Info";
	JButton exit;
	private final static String BUTTON_TEXT7 = "Exit";

	JPanel p1;
	public AquaPanel() {

		this.setBackground(Color.WHITE);
		addAnimal = new JButton(BUTTON_TEXT1);
		sleep = new JButton(BUTTON_TEXT2);
		wakeUp = new JButton(BUTTON_TEXT3);
		reset = new JButton(BUTTON_TEXT4);
		food = new JButton(BUTTON_TEXT5);
		info = new JButton(BUTTON_TEXT6);
		exit = new JButton(BUTTON_TEXT7);

		p1 = new JPanel(new BorderLayout());
		p1.setLayout(new GridLayout(1, 7));

		p1.add(addAnimal);
		addAnimal.addActionListener(this);
		
		p1.add(sleep);
		sleep.addActionListener(this);

		p1.add(wakeUp);
		wakeUp.addActionListener(this);

		p1.add(reset);
		reset.addActionListener(this);

		p1.add(food);
		food.addActionListener(this);

		p1.add(info);
		info.addActionListener(this);

		p1.add(exit);
		exit.addActionListener(this);

		this.setLayout(new BorderLayout());
		add("South", p1);

	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource().equals(exit)) {
			System.exit(0);
		}

		if (e.getSource().equals(addAnimal)) {
			AddAnimalDialog ani = new AddAnimalDialog();
			if(ani.ColorBox.equals(e)) {
				
				String color=(String) ani.ColorBox.getSelectedItem();
				System.out.println("aqua color:"+color);
			}
			//int size=ani.SizeSlider.getValue();
			
		}
		if(e.getSource().equals(info))
		{

		}
	}

	public void blue_color() {
		this.setBackground(Color.BLUE);

	}

}
