package q3;


import javax.swing.*;          
import java.awt.*;
import java.awt.event.*;


public class AquaFrame extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public AquaFrame() {
	}
	public static void main(String[] args) {
		MyFrame frame1=new MyFrame("my Aquarium");
		frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame1.pack();
		frame1.setSize(800, 500);
		frame1.setLocationRelativeTo(null);
		frame1.setVisible(true);
	}
}


class MyFrame extends JFrame implements ActionListener{
	
	JMenu x,y,w;
	JMenuItem x1,y1,w1,w2,w3;
	JMenuBar z;
	
	AquaPanel Aquarium;
	//boolean picF;
	public static boolean picF;
	
	private static final long serialVersionUID = 1L;

	public MyFrame(String string) {
		super(string);
		
		
		x=new JMenu("File");
		w=new JMenu("Background");
		y=new JMenu("Help");
		
		x1=new JMenuItem("Exit");
		x1.addActionListener(this);

		y1=new JMenuItem("Help");
		y1.addActionListener(this);
		
		w1=new JMenuItem("Image");
		w1.addActionListener(this);
		
		w2=new JMenuItem("Blue");
		w2.addActionListener(this);
		
		w3=new JMenuItem("None");
		w3.addActionListener(this);
		
		x.add(x1);
		
		w.add(w1);
		w.add(w2);
		w.add(w3);
				
		y.add(y1);
		
		z=new JMenuBar();
		z.add(x);
		z.add(w);
		z.add(y);
		setJMenuBar(z);
		
		Aquarium = new AquaPanel();
		add(Aquarium, BorderLayout.CENTER);
		
	}
	
	public void actionPerformed(ActionEvent e) {
				
		if (e.getSource().equals(x1))
			System.exit(0);
		
		if (e.getSource().equals(y1))
			JOptionPane.showMessageDialog(this,"Home Work 2 \n GUI @ Threads");
		
		if (e.getSource().equals(w1))
			picF=true;
			
		if (e.getSource().equals(w2)) 
		{
			Aquarium.setBackground(Color.BLUE);
			picF=false;
		}
		
		if (e.getSource().equals(w3))
		{
			Aquarium.setBackground(Color.WHITE);
			picF=false;
		}
	}

	
}