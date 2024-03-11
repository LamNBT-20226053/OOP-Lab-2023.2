package week_1;

import javax.swing.JOptionPane;

public class Equations {
	public static void main(String args[]) {
		boolean cont = true;
		do {
			int choice = Integer.parseInt(JOptionPane.showInputDialog(null, "Please enter your choice: " + '\n' + "1.Solve first-degree equation" + '\n' + "2.Solve system of first-degree equations" + '\n' + "3.Solve second-degree equation" + '\n' + "4.Exit", "Equation Solving", JOptionPane.INFORMATION_MESSAGE));
			switch(choice) {
			case 1:
				int a = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter a: ", "Equation ax^2 + bx = 0", JOptionPane.INFORMATION_MESSAGE));
				int b = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter b: ", "Equation ax^2 + bx = 0", JOptionPane.INFORMATION_MESSAGE));
				if (a==0 && b!= 0) JOptionPane.showMessageDialog(null, "The equation has no solution", "Result", JOptionPane.INFORMATION_MESSAGE);
				else if (a==0 && b==0) JOptionPane.showMessageDialog(null, "The equation has infinitely many solutions", "Result", JOptionPane.INFORMATION_MESSAGE);
				else {
					int res = -b/a;
					JOptionPane.showMessageDialog(null, "The equation has a unique solution: x = " + res, "Result", JOptionPane.INFORMATION_MESSAGE);
				}
			case 2:
				int a11 = 
				int a12 = 
				int b1 = 
				int a21 = 
				int a22 =
				int b2 = 
				
				break;
			case 3:
				break;
			case 4:
				cont = false;
				JOptionPane.showMessageDialog(null, "Closed", "Termination", JOptionPane.CLOSED_OPTION);
				break;
			default:
				JOptionPane.showMessageDialog(null, "Invalid choice. Please choose again!", "Error", JOptionPane.WARNING_MESSAGE);
				break;
			}
		} while(cont);
		System.exit(0);
	}
}
