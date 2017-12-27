
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import javax.swing.JOptionPane;

public class BirthdayReminder {

	public static void main(String[] args) {

		// 1. correct the birthdays for your family below
		String momsBirthday = "May 30th";
		String dadsBirthday = "July 9th";
		String myBirthday = "February 22th";

		// 2. Find out which birthday the user wants and and store their response in a
		// variable
		String bday = JOptionPane.showInputDialog("Which birthday do you want to find out?");
		// 3. Print out what the user typed
		System.out.println(bday);
		// 4. if user asked for "mom"
		// print mom's birthday
		if (bday.equals("mom")) {
			JOptionPane.showMessageDialog(null, "Mom's birthday is " + momsBirthday);
		}
		// 5. if user asked for "dad"
		// print dad's birthday
		else if (bday.equals("dad")) {
			JOptionPane.showMessageDialog(null, "Dad's birthday is " + dadsBirthday);
		}
		// 6. if user asked for your name
		// print myBirthday
		else if (bday.equals("Isaac")) {
			JOptionPane.showMessageDialog(null, "Isaac's birthday is " + myBirthday);
		}
		// 7. otherwise print "Sorry, i don't remember that person's birthday!"
		else {
			JOptionPane.showMessageDialog(null, "Sorry, I don't know " + bday + "'s birthday.");
		}
	}
}
