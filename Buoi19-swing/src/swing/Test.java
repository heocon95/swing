package swing;

import javax.swing.UIManager;

public class Test {
	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());			
		} catch (Exception e) {
			// TODO: handle exception
		}
		Calculator cal = new Calculator();
	}
}
