package no.hvl.dat100;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class O2 {
	public static void main(String[] args) {

		int min = 208050;

		String s = showInputDialog("Hva er bruttolønn? ");
		double bruttolønn = Integer.parseInt(s);

		if (bruttolønn < min && bruttolønn > 0) {
			showMessageDialog(null, "IngenTrinnskatt");
		} else if (bruttolønn > min && bruttolønn <= 292850) {
			showMessageDialog(null, "1.7% trinnskatt og du må betale: " + bruttolønn * 0.017);
		} else if (bruttolønn >= 292851 && bruttolønn <= 670000) {
			showMessageDialog(null, "4% trinnskatt og du må betale: " + bruttolønn * 0.04);
		} else if (bruttolønn >= 670001 && bruttolønn <= 937900) {
			showMessageDialog(null, "13.6% trinnskatt og du må betale: " + bruttolønn * 0.136);
		} else if (bruttolønn >= 937901 && bruttolønn <= 1350000) {
			showMessageDialog(null, "16.6% trinnskatt og du må betale: " + bruttolønn * 0.166);
		} else if (bruttolønn >= 1350001) {
			showMessageDialog(null, "17.6% trinnskatt og du må betale: " + bruttolønn * 0.176);
		}

	}
}
