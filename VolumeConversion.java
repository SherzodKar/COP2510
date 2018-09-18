//“I pledge my Honor that I have not cheated, and will not cheat, on this test.” Sherzod Kariev
import javax.swing.JOptionPane;
public class VolumeConversion {
	public static void main(String[] args) {
		double volume = 0;
		int select;
		String input;
		JOptionPane.showMessageDialog(null, "Hello! \r\n\n" + "This program will convert  volume in liters to gallons, cups or ounces! \n\n" + "Select an option from the menu below to get started! \n\n");
		do {
			menu();
			input = JOptionPane.showInputDialog("Enter your choice: ");
			select = Integer.parseInt(input);
			if(select >= 1 && select <= 3) {
				input = JOptionPane.showInputDialog(null,"Enter the volume in liters: ");
				volume = Integer.parseInt(input);
				while(volume <= 0) {
					input = JOptionPane.showInputDialog(null,"The volume should be greater than 0. Re-enter your volume: ");
					volume = Integer.parseInt(input);
				}
			}	
				switch(select){
					case 1: JOptionPane.showMessageDialog(null,volume + "  liters is " + galoons(volume) + " galoons");
						break;
					case 2: JOptionPane.showMessageDialog(null,volume + "  liters is " + cups(volume) + " cups.");
						break;
					case 3:JOptionPane.showMessageDialog(null,volume + "  liters is " + ounces(volume) + " ounces.");
						break;
					case 4: JOptionPane.showMessageDialog(null,"Ok, bye!");
						break;
					default: JOptionPane.showMessageDialog(null,"That is an invalid option. ");	
				}
		}while(select != 4);
		
	}
	public static void menu() {
		JOptionPane.showMessageDialog(null,"\n 1. Convert to galoons\n 2. Convert to cups\n 3. Convert to ounces\n 4. Quit ");
	}
	public static double galoons(double liters) {
		return liters * 0.264172;
	}
	public static double cups(double liters) {
		return liters * 4.16667;
	}
	public static double ounces(double liters) {
		return liters * 33.814;
	}
}


