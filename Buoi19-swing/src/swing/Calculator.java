package swing;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator extends JFrame {
	public Calculator() {
		this.setSize(350, 450);
		this.setLayout(new BorderLayout());
		createMenu();
		createInputText();
		createInterface();
		this.setTitle("Calculator");
		this.setVisible(true);
	}

	public void createInterface() {

		JPanel jp_button = new JPanel();

		jp_button.setLayout(new GridLayout(6, 5, 20, 20));
		for (int i = 1; i <= 30; i++) {
			JButton b = new JButton(i + "");
			jp_button.add(b);
		}

		this.add(jp_button,BorderLayout.CENTER);
	}
	public void createMenu(){
		//tao thanh menu
		JMenuBar menu = new JMenuBar();
		//tao cac doi tuong trong thnah menu
		JMenu view = new JMenu("View");
		JMenuItem v1 = new JMenuItem("Standard");
		JMenuItem v2 = new JMenuItem("Scientific");
		JMenuItem v3 = new JMenuItem("Programmer");
		JMenuItem v4 = new JMenuItem("Staticstics");
		JMenuItem v5 = new JMenuItem("History");
		JMenuItem v6 = new JMenuItem("Digit grouping");
		JMenuItem v7 = new JMenuItem("Basic");
		JMenuItem v8 = new JMenuItem("Unit conversion");
		JMenuItem v9 = new JMenuItem("Date calculator");
		JMenu v10 = new JMenu("Worksheets");
				
		view.add(v1);
		view.add(v2);
		view.add(v3);
		view.add(v4);
		view.addSeparator();
		view.add(v5);
		view.add(v6);
		view.addSeparator();
		view.add(v7);
		view.add(v8);
		view.add(v9);
		view.add(v10);
		
		JMenu edit = new JMenu("Edit");
		JMenuItem e1 = new JMenuItem("Copy");
		JMenuItem e2 = new JMenuItem("Paste");
		JMenuItem e3 = new JMenuItem("History");
		
		edit.add(e1);
		edit.add(e2);
		edit.addSeparator();
		edit.add(e3);
		
		JMenu help = new JMenu("Help");
		JMenuItem h1 = new JMenuItem("View Help");
		JMenuItem h2 = new JMenuItem("About Calculetor");
		
		help.add(h1);
		help.addSeparator();
		help.add(h2);		
	
		menu.add(view);
		menu.add(edit);
		menu.add(help);
		
		this.setJMenuBar(menu);
	}
	
	public void createInputText(){
		JTextField jtf = new JTextField(){
			public Dimension getPreferredSize(){
				return new Dimension(345,50);
			};
		};
		this.add(jtf,BorderLayout.NORTH);
	}
}
