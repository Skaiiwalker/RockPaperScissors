package rps.view;

import javax.swing.JOptionPane;

public class RPSView 
{
	private String windowMessage;
	
	public RPSView()
	{
		windowMessage = ("The score is User: " + " and Computer: ");  //make this display the score.
	}
	
	public String grabInput(String displayText)
	{
		String userInput = "";
		
		userInput = JOptionPane.showInputDialog(null, displayText, windowMessage, JOptionPane.PLAIN_MESSAGE, null, null, "type here").toString();
		
		return userInput;
	}
	
	public void displayText(String displayText)
	{
		JOptionPane.showMessageDialog(null, displayText, windowMessage, JOptionPane.INFORMATION_MESSAGE, null);
	}
	
	public String collectUserText(String askUser)
	{
		displayText(askUser);
		String userInput = "";
		userInput = JOptionPane.showInputDialog(null, askUser, windowMessage, JOptionPane.PLAIN_MESSAGE, null, null, "Type here").toString();
		return userInput;
	}
}
