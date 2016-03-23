package rps.controller;

import rps.model.RockPaperScissors;
import rps.view.RPSView;

public class RPSController 
{
	private RockPaperScissors RPSGame;
	
	public int userScore;
	public int computerScore;
	
	public RPSController()
	{
		RockPaperScissors RPSGame = new RockPaperScissors();
		
		userScore = (0);
		computerScore = (0);
	}
	
	public void start()
	{
		
	}
	
	public void userWinRound()
	{
		
	}
	
	public void computerWinRound()
	{
		
	}
	
	public void userWin()
	{
		
	}
	
	public void computerWin()
	{
		
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
