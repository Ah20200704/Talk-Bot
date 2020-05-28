package Soul;

import javax.swing.JOptionPane;
public class Main {
/*this is the main method of Talkbot, it takes an input and stores it as the players name, then it takes an input
 * and stores it as the bot's name, from that point onward the game will run through a series of comments if the player
 * says nothing, and if the player says "you" it will begin with another phrase then run through the same set of comments
 * */
	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null,"hello");
		
		String name =  JOptionPane.showInputDialog(null,"what's your name?");
		
		JOptionPane.showMessageDialog(null,name);
		
		JOptionPane.showMessageDialog(null,"thats a nice name");
		
		String theirName = JOptionPane.showInputDialog(null,"i dont have one so you can call me whatever you want");
		
		JOptionPane.showMessageDialog(null, theirName);
		
		JOptionPane.showMessageDialog(null,"huh");
		
		JOptionPane.showMessageDialog(null,"thats a cool name i guess");
		
		JOptionPane.showMessageDialog(null,"I cant really tell the difference either way but its something");
		
		JOptionPane.showMessageDialog(null,"so");
		
		String topic = JOptionPane.showInputDialog(null,"What do you want to talk about?");
		if(topic.equalsIgnoreCase("")) {
			String q0_Null = JOptionPane.showInputDialog(null,"well you gotta actually ask something");
			if(q0_Null.equalsIgnoreCase("")) {
				JOptionPane.showMessageDialog(null,"cmon dude give me something to work with here");
				JOptionPane.showMessageDialog(null,"actually, yknow what?");
				JOptionPane.showMessageDialog(null,"im done");
			}
		if(topic.equalsIgnoreCase("you")){
			JOptionPane.showMessageDialog(null,"me huh?");
			String q1 = JOptionPane.showInputDialog(null,"well what do you wanna know?");
			if(q1.equalsIgnoreCase("")) {
				String q1_Null = JOptionPane.showInputDialog(null,"well you gotta actually ask something");
				if(q1_Null.equalsIgnoreCase("")) {
					JOptionPane.showMessageDialog(null,"cmon dude give me something to work with here");
					JOptionPane.showMessageDialog(null,"actually, yknow what?");
					JOptionPane.showMessageDialog(null,"im done");
				}
			}
		}
	}

}
}