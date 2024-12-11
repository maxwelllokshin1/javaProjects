package personalProjects;

public class rps {
	/*
	 * Create RPS with:
	 * 	Constructor, class, object
	 */
	
	private int botScore;
	private int userScore;
	
	public rps()
	{
		botScore =0;
		userScore=0;
	}
	
	public int getUserScore()
	{
		return userScore;
	}
	public int getBotScore()
	{
		return botScore;
	}
	
	public void setUserScore(int amnt)
	{
		userScore += amnt;
	}
	public void setBotScore(int amnt)
	{
		botScore += amnt;
	}
}
