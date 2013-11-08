// Name: Sai Kiran Vadlamudi		Username: svadlamudi		Section: B01
// Name: Marilda Bozdo				Username: mbozdo			Section: B06

public class BaseballContestant implements IContestant{
	
	String teamName;
	int numPlayers;
	String captainName;
	
	public BaseballContestant(String teamNameIn, int numPlayersIn, String captainNameIn){
		
		this.teamName = teamNameIn;
		this.numPlayers = numPlayersIn;
		this.captainName = captainNameIn;
		
	}
}
