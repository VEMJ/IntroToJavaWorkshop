package day3;

import javax.swing.JOptionPane;

public class choeseyourownadventer {
	public static void main(String[] args) {
		speak("You are in the middle of an island and you have two option's. \n One is to go in a forest and try to live off of what you find. \n Or you can go to the cave up the mountain. \n Which one do you chooses forest or cave? \n  ");
		String answer = JOptionPane.showInputDialog(
				"You are in the middle of an inland and you have two option's. \n One is to go in a forest and try to live off of what you find. \n Or you can go to the cave up the mountain. \n Which one do you choses forest or cave? \n  ");
		if (answer.equals("forest")) {
			speak("So you start heading towards the forest then you relize \n that there are two different one's there's a rain forest \n and a regualar plan old tree forest. \n So now you have to chooese. \n Which one will you go to  the rain forest or the regualar forest?");
			String answer1 = JOptionPane.showInputDialog(
					"So you start heading towards the forest then you relize \n that there are two different one's there's a rain forest \n and a regualar plan old tree forest. \n So now you have to chooese. \n Which one will you go to  the rain forest or the regualar forest?");
			if (answer1.equals("forest")) {
				speak("then you relize that there was no food so you die with in four days. :(");
				JOptionPane.showMessageDialog(null, "then you relize that there was no food so you die with in four days. :(");
			}
			if (answer1.equals("rain forest")) {
				speak("You find out that there is some much food that you could \n live two to three years and you have lot's of water. \n You now have lived for hundreds of years!:)");
				JOptionPane.showMessageDialog(null,
						"You find out that there is some much food that you could \n live two to three years and you have lot's of water. \n You now have lived for hundreds of years!:)");
			}
		}
		if (answer.equals("cave")) {

			speak(" You walk up the mountain for miles. \n You finally get to the cave. \n When you go to the cave you find \n that there is no way \n to keep you warm and no food or water \n sadly you die before help comes. :(");
			JOptionPane.showMessageDialog(null,
					" You walk up the mountion for miles. \n You finally get to the cave. \n When you go to the cave you find \n that there is no way \n to keep you warm and no food or water \n sadly you die before help comes. :(");
		}
	}

	static void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}