package _03_method_writing._2_happy_pet;
import javax.swing.JOptionPane;

public class HappyPet {
	
	// 1. Add the following variable to the next line: static int happinessLevel = 0;
	// this will be used to store the happiness of your pet
	
	public static void main(String[] args) {
		// 2. Ask the user what kind of pet they want to buy, and store their answer in a variable
		String breakingNewsHereOnTheQuestToEntertainTheUserWeAreGoingToGiveThemAPetHereIsBobWithACloserLook = JOptionPane.showInputDialog.("What kind of pet do you want. Here at JoyJo's Pet Store, we have Fish, Hamsters, Dogs, Cats and Turtles. If you don't want a pet, type No Pet.");
		if (breakingNewsHereOnTheQuestToEntertainTheUserWeAreGoingToGiveThemAPetHereIsBobWithACloserLook equals.IgnoreCase("No Pet")){
			//JOptionPane.showInputDialog("What would you like to do next?");
			JOptionPane.showMessageDialog(null, "That's a shame, you would make a great pet parent")
			String thankYouJennyInThisSectionWeWarnTheUserThatTheyNeedToTakeCareOfTheirPetsOrElseIWonderWhatTheirResponseWillBe = "Oops, nevermind!";
		} else {
			String thankYouJennyInThisSectionWeWarnTheUserThatTheyNeedToTakeCareOfTheirPetsOrElseIWonderWhatTheirResponseWillBe = JOptionPane.showInputDialog("Taking care of pets, even digital ones is a lot of work, especially at the start. If your pets don't have enough of a happiness level, they will die, and I will contact the PROGRAMMER. This is not a job for the light hearted, and don't just kill the pets for fun. Remember, as your computer, I have access to ALL YOUR PASSWORDS. If you still want to continue, type in 'Yes, I am ready.'");
		}
		if (thankYouJennyInThisSectionWeWarnTheUserThatTheyNeedToTakeCareOfTheirPetsOrElseIWonderWhatTheirResponseWillBe equals.("Yes, I am ready.")){

		} else {
			JOptionPane.showMessageDialog(null, "That's ok, though, backing out now is much better than you being burdened with loads of unwanted responsibilies, and a pet possibly dying.")
			JOptionPane.showInputDialog("What would you like to do next? Do you want to draw shapes,")
		}

		// 3. REPEAT steps 4 - 7 enough times to make your pet happy!
		
			// 4. Use showOptionDialog to ask the user what they want to do to make their pet happy
			//    (eg: cuddle, food, water, take a walk, groom, clean up poop).
			//    Make sure to customize the title and question too.
			int task = JOptionPane.showOptionDialog(null, "Question", "Title", 0, JOptionPane.INFORMATION_MESSAGE, null,
					new String[] { "Button1", "Button2", "Button3" }, null);

			// 6. Use user input to call the appropriate method created in step 5 below.

			// 7. If you determine the happiness level is large enough, tell the
			//    user that he loves his pet and use break; to exit for loop.

	}

	// 5. Create methods to handle each of your user selections.
	//    Each method should create a pop-up with the pet's response (eg. cat might purr when pet), 
	//    and INCREMENT the pet's happiness Level.
}