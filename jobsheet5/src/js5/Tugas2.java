package js5;

/*
 * Farhan Novaldi
 * 21343024
 * Informatika
 */
/**
 * @author Farhan_Nvl
 */

import javax.swing.JOptionPane;

public class Tugas2 {
	public static void main(String[] args) {
		// input OptionPane1
		String name = "";
		name = JOptionPane.showInputDialog("Please enter your words 1#");

		// input OptionPane2
		String nama = "";
		nama = JOptionPane.showInputDialog("Please enter your words 2#");

		// input OptionPane3
		String namo = "";
		namo = JOptionPane.showInputDialog("Please enter your words 3#");

		String msg = name + " " + nama + " " + namo;
		JOptionPane.showMessageDialog(null, msg);

		System.out.println(name + " " + nama + " " + namo);
	}
}
