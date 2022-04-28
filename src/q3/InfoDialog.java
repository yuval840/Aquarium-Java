package q3;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Vector;

import javax.swing.JDialog;
import javax.swing.JFrame;

import java.awt.BorderLayout;
import javax.swing.JTable;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.JPanel;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.SwingConstants;
import javax.swing.JMenuBar;
import java.awt.Window.Type;
import javax.swing.JScrollPane;

public class InfoDialog extends JDialog implements ActionListener {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTable table;
	JMenuItem ExitM;
	JScrollPane scrollPane;
	DefaultTableModel tableModel;
	
	public InfoDialog(HashSet<Swimmable> animals)
	{
		//Object[] anim=animals.toArray();
		setTitle("My Aquarium");
		pack();
		setSize(468, 185);
		setLocationRelativeTo(null);
		setVisible(true);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu FileM = new JMenu("File");
		menuBar.add(FileM);
		
		
		JMenuItem ExitM = new JMenuItem("Exit");
		FileM.add(ExitM);
		ExitM.addActionListener(this);
		
		JMenu BackgroundM = new JMenu("Background");
		menuBar.add(BackgroundM);
		
		JMenuItem ImageM = new JMenuItem("Image");
		BackgroundM.add(ImageM);
		
		JMenuItem BlueM = new JMenuItem("blue");
		BackgroundM.add(BlueM);
		
		JMenuItem NoneM = new JMenuItem("None");
		BackgroundM.add(NoneM);
		
		JMenu HelpM = new JMenu("Help");
		menuBar.add(HelpM);
		
		JMenuItem HelpItem = new JMenuItem("Help");
		HelpM.add(HelpItem);
		
		scrollPane = new JScrollPane();
		getContentPane().add(scrollPane, BorderLayout.CENTER);
		String[] columns= {"Animal", "Color", "Size", "Hor.Speed", "Ver.Speed", "Eat Counter"};
		tableModel = new DefaultTableModel(columns,0);
		table=new JTable (tableModel);
		table.setPreferredScrollableViewportSize(new Dimension(400,100));
		for(Swimmable s:animals)
		{
			createTable(s);
		}
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Exit");
		
	}
	void createTable(Swimmable s)
	{
		table.setEnabled(false);
		table.setColumnSelectionAllowed(true);
		table.setFillsViewportHeight(true);
		table.setSurrendersFocusOnKeystroke(true);
		
		String[] Row=new String[] {s.getAnimalName(),s.getColor(),String.valueOf(s.getSize()),String.valueOf(s.getHorSpeed()),String.valueOf(s.getVerSpeed())};
		scrollPane.setViewportView(table);
		tableModel.addRow(Row);;
		
		
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource().equals(ExitM))
		{
			System.exit(0);
		}
		
	}
}
