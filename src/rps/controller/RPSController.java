package rps.controller;

import rps.model.RockPaperScissors;
import rps.view.RPSView;

public class RPSController 
{
	private RockPaperScissors RPSGame;
	private RPSView baseView;
	
	public int userScore;
	public int computerScore;
	
	public RPSController()
	{
		RockPaperScissors RPSGame = new RockPaperScissors();
		RPSView baseView = new RPSView();
		
		userScore = (0);
		computerScore = (0);
	}
	
	public void start()
	{
		RPSGame.playRockPaperScissors();
	}
	
	public void userWinRound()
	{
		userScore++;
		checkWinner();
	}
	
	public void computerWinRound()
	{
		computerScore++;
		checkWinner();
	}
	
	public void userWin()
	{
		baseView.displayText("User win!");
		userScore = 0;
		computerScore = 0;
		start();
	}
	
	public void computerWin()
	{
		baseView.displayText("Computer wins!");
		userScore = 0;
		computerScore = 0;
		start();
	}
	
	public void gameTie()
	{
		
	}
	
	public void checkWinner()
	{
		if(userScore == 3)
		{
			userWin();
		}
		else if(computerScore == 3)
		{
			computerWin();
		}
		else
		{
			RPSGame.playRockPaperScissors();
		}
	}
}
