package day3;

import javax.swing.JOptionPane;

public class WorldDomination {
	public static void main(String[] args) {
		// 1. Ask the user if they know how to write code. 
		String friend=JOptionPane.showInputDialog("do you know how to code");
		// 2. If they say "yes", tell them they will rule the world.
if(friend.equals("yes")){ 
	JOptionPane.showMessageDialog(null, "YOU WILL RULE THE WORLD!!!!");
}
		// 3. Otherwise, wish them good luck washing dishes.
else{
	JOptionPane.showMessageDialog(null, "good luck washing dishes");
	}
}
}

