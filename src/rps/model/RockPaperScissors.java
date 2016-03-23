package rps.model;

import rps.controller.RPSController;
import rps.view.RPSView;

public class RockPaperScissors 
{
	private RPSController baseController;
	private RPSView baseView;
	private String userInput;
	private String computerInput;
	private int computerChoose;
	
	public RockPaperScissors()
	{
		RPSController baseController = new RPSController();
		RPSView baseView = new RPSView();
		
		userInput = baseView.collectUserText("Type rock, paper, or scissors in all lowercase.");
		computerInput = ("");
	}
	
	private void computerSetup()
	{
		int computer;
		computer = (int) (Math.random() * 3);
		
		if(computer == 0)
		{
			computerInput = "rock";
		}
		if(computer == 1)
		{
			computerInput = "paper";
		}
		if(computer == 2)
		{
			computerInput = "scissors";
		}
	}
	
	public void playRockPaperScissors()
	{
		if(userInput == "rock")
		{
			if(computerInput == "rock")
			{
				baseController.gameTie();
			}
			else if(computerInput == "paper")
			{
				baseController.computerWinRound();
			}
			else if(computerInput == "scissors")
			{
				baseController.userWinRound();
			}
			else
			{
				playRockPaperScissors();
			}
		}
		else if(userInput == "paper")
		{
			if(computerInput == "rock")
			{
				baseController.userWinRound();
			}
			else if(computerInput == "paper")
			{
				baseController.gameTie();
			}
			else if(computerInput == "scissors")
			{
				baseController.computerWinRound();
			}
			else
			{
				playRockPaperScissors();
			}
		}
		else if(userInput == "scissors")
		{
			if(computerInput == "rock")
			{
				baseController.computerWinRound();
			}
			else if(computerInput == "paper")
			{
				baseController.userWinRound();
			}
			else if(computerInput == "scissors")
			{
				baseController.gameTie();
			}
			else
			{
				playRockPaperScissors();
			}
		}
		baseController.checkWinner();
	}
}
