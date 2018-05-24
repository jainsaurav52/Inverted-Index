package main;

import gui.MainWindow;

import javax.swing.SwingUtilities;

import classes.InvertedIndex;

public class Driver {

	/**
	 * @Saurav Jain 
	 */
	public static void main(String[] args) {
		
				MainWindow ex = new MainWindow(new InvertedIndex());
				ex.setVisible(true);
		
	}

}
