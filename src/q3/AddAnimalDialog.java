package q3;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Dimension;

import java.awt.SystemColor;

public class AddAnimalDialog extends JDialog implements ActionListener {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	 JComboBox<String> ColorBox;
	 JSlider SizeSlider;
	JRadioButton Radiofishbtn;
	JRadioButton RadioJellyfishbtn;
	 JSlider Verticalspeedslider;
	 JSlider Horazionalspeedslider;
	
	public  int getColorBox() {
		return ColorBox.getSelectedIndex()+1;
	}


	public  int getSizeSlider() {
		return SizeSlider.getValue();
	}

	public  int getVerticalspeedslider() {
		return Verticalspeedslider.getValue();
	}

	public  int  getHorazionalspeedslider() {
		return Horazionalspeedslider.getValue();
	}


	JButton addbtn;
	
	AquaPanel panel;
	public static Dimension dim;
	static int dmw;
	static int dmh;
	
	
	public AddAnimalDialog(AquaPanel p) {
		panel=p;
		getContentPane().setLayout(null);
		SizeSlider = new JSlider();
		SizeSlider.setPaintLabels(true);
		SizeSlider.setMinorTickSpacing(10);
		SizeSlider.setMajorTickSpacing(20);
		SizeSlider.setValue(100);
		SizeSlider.setMinimum(20);
		SizeSlider.setMaximum(320);
		SizeSlider.setPaintTicks(true);
		SizeSlider.setBounds(0, 275, 484, 49);
		getContentPane().add(SizeSlider);
		
		Radiofishbtn = new JRadioButton("Fish");
		Radiofishbtn.setSelected(true);
		buttonGroup.add(Radiofishbtn);
		Radiofishbtn.setBounds(0, 33, 65, 23);
		getContentPane().add(Radiofishbtn);
		
		RadioJellyfishbtn = new JRadioButton("Jellyfish");
		buttonGroup.add(RadioJellyfishbtn);
		RadioJellyfishbtn.setBounds(72, 33, 75, 23);
		getContentPane().add(RadioJellyfishbtn);
		
		Verticalspeedslider = new JSlider();
		Verticalspeedslider.setValue(1);
		Verticalspeedslider.setPaintLabels(true);
		Verticalspeedslider.setMajorTickSpacing(1);
		Verticalspeedslider.setMinorTickSpacing(1);
		Verticalspeedslider.setMinimum(1);
		Verticalspeedslider.setMaximum(10);
		Verticalspeedslider.setPaintTicks(true);
		Verticalspeedslider.setBounds(0, 104, 209, 39);
		getContentPane().add(Verticalspeedslider);
		
		Horazionalspeedslider = new JSlider();
		Horazionalspeedslider.setValue(1);
		Horazionalspeedslider.setPaintTicks(true);
		Horazionalspeedslider.setPaintLabels(true);
		Horazionalspeedslider.setMinorTickSpacing(1);
		Horazionalspeedslider.setMinimum(1);
		Horazionalspeedslider.setMaximum(10);
		Horazionalspeedslider.setMajorTickSpacing(1);
		Horazionalspeedslider.setBounds(0, 205, 209, 39);
		getContentPane().add(Horazionalspeedslider);
		
		ColorBox = new JComboBox<String>();
		ColorBox.addActionListener(this);
		ColorBox.setBackground(SystemColor.control);
		ColorBox.setModel(new DefaultComboBoxModel<String>(new String[] {"Black", "Red", "Blue", "Green", "Cyan", "Orange","Yellow","Magenta","Pink"}));
		ColorBox.setBounds(325, 89, 114, 67);
		getContentPane().add(ColorBox);
		
		JTextPane txtpnSelectHorzionalSpeed = new JTextPane();
		txtpnSelectHorzionalSpeed.setEditable(false);
		txtpnSelectHorzionalSpeed.setBackground(SystemColor.control);
		txtpnSelectHorzionalSpeed.setText("Select Horzional Speed:");
		txtpnSelectHorzionalSpeed.setBounds(0, 183, 133, 20);
		getContentPane().add(txtpnSelectHorzionalSpeed);
		
		JTextPane txtpnSelectVerticalSpeed = new JTextPane();
		txtpnSelectVerticalSpeed.setEditable(false);
		txtpnSelectVerticalSpeed.setText("Select Vertical Speed:");
		txtpnSelectVerticalSpeed.setBackground(SystemColor.menu);
		txtpnSelectVerticalSpeed.setBounds(0, 83, 133, 20);
		getContentPane().add(txtpnSelectVerticalSpeed);
		
		JTextPane txtpnSelectTypeOf = new JTextPane();
		txtpnSelectTypeOf.setEditable(false);
		txtpnSelectTypeOf.setText("Select Type Of Animal:");
		txtpnSelectTypeOf.setBackground(SystemColor.menu);
		txtpnSelectTypeOf.setBounds(0, 11, 133, 20);
		getContentPane().add(txtpnSelectTypeOf);
		
		JTextPane txtpnSelectAnimalColor = new JTextPane();
		txtpnSelectAnimalColor.setEditable(false);
		txtpnSelectAnimalColor.setText("Select Animal Color:");
		txtpnSelectAnimalColor.setBackground(SystemColor.menu);
		txtpnSelectAnimalColor.setBounds(321, 58, 133, 20);
		getContentPane().add(txtpnSelectAnimalColor);
		
		JTextPane txtpnSelectAnimalSize = new JTextPane();
		txtpnSelectAnimalSize.setEditable(false);
		txtpnSelectAnimalSize.setText("Select Animal Size:");
		txtpnSelectAnimalSize.setBackground(SystemColor.menu);
		txtpnSelectAnimalSize.setBounds(0, 255, 133, 20);
		getContentPane().add(txtpnSelectAnimalSize);
		
		addbtn = new JButton("Add Animal");
		addbtn.addActionListener(this);
		
		addbtn.setBounds(174, 335, 114, 23);
		getContentPane().add(addbtn);
		setSize(500, 400);
		setLocationRelativeTo(null);
		setVisible(true);
		
	}

	public void actionPerformed(ActionEvent e) 
	{
		if(e.getSource().equals(addbtn))
		{
			Thread.currentThread();
			if(Thread.activeCount()<=6)
			{
				if(Radiofishbtn.isSelected())
				{
					Fish Nfish=new Fish(SizeSlider.getValue(),200,200,Horazionalspeedslider.getValue(),Verticalspeedslider.getValue(),ColorBox.getSelectedIndex()+1);
					panel.add_ani(Nfish);
				}
				if(RadioJellyfishbtn.isSelected())
				{
					Jellyfish Njelly=new Jellyfish(SizeSlider.getValue(),200,200,Horazionalspeedslider.getValue(),Verticalspeedslider.getValue(),ColorBox.getSelectedIndex()+1);
					panel.add_ani(Njelly);
				}
			}
			else  
			{
				JOptionPane.showMessageDialog(this,"Only 5 Animals On Tank!!");
			}

		}
	}	
	
}