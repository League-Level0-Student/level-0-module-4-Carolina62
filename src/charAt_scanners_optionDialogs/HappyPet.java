package charAt_scanners_optionDialogs;
import javax.swing.JOptionPane;

public class HappyPet {
	
	// 2. Add the following variable to the next line: static int happinessLevel = 0;
	// this will be used to store the happiness of your pet
	int happinessLevel = 0;
	public static void main(String[] args) {
		// 1. Ask the user what kind of pet they want to buy, and store their answer in a variable
		String answer = JOptionPane.showInputDialog("What pet do you want to buy?");
	
		
		// 7. REPEAT steps 3 - 6 enough times to make your pet happy!
		
			// 3. Use showOptionDialog to ask the user what they want to do to make their pet happy
			//    (eg: cuddle, food, water, take a walk, groom, clean up poop).
			//    Make sure to customize the title and question too.
			int task = JOptionPane.showOptionDialog(null, "What do you want to do to make your pet happy?", "Happy", 0, JOptionPane.INFORMATION_MESSAGE, null,
					new String[] { "Feed it", "Take it for a walk", "Cuddle it" }, null);

			// 5. Use user input to call the appropriate method created in step 4.
	System.out.println(task);
	if (task == 0) {
	JOptionPane.showMessageDialog(null, "Yum!");
}

if (task == 1) {
	JOptionPane.showMessageDialog(null, "Pet may get tired");
}
 
if (task == 2) {
	JOptionPane.showMessageDialog(null,"Pet might not like being cuddled or might really like it" );
}
			// 6. If you determine the happiness level is large enough, tell the
			//    user that he loves his pet and use break; to exit for loop.
	if(task == 2) {
		JOptionPane.showMessageDialog(null, "You really love your pet!");
	}



	}
	

	// 4. Create methods to handle each of your user selections.
	//    Each method should create a pop-up with the pet's response (eg. cat might purr when pet), 
	//    and INCREMENT the pet's happiness Level.
		void feedPet() {
			happinessLevel += 1;
		}
		
		void Walk() {
			happinessLevel += 1;
		}
		
		void Cuddle() {
			happinessLevel +=1;
		}
	
	
	
	
} 