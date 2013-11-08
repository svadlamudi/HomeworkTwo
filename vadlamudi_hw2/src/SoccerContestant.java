// Name: Sai Kiran Vadlamudi		Username: svadlamudi		Section: B01
// Name: Marilda Bozdo				Username: mbozdo			Section: B06

public class SoccerContestant implements IContestant {

	
	String teamName;
	int numPlayers;
	String captainName;
	
	String rankTeamName;
	int rank;
	
	public SoccerContestant(String teamNameIn, int numPlayersIn, String captainNameIn, int rankIn){
		
		this.teamName = teamNameIn;
		this.numPlayers = numPlayersIn;
		this.captainName = captainNameIn;
		this.rankTeamName = teamNameIn;
		this.rank = rankIn;
		
	}
}
