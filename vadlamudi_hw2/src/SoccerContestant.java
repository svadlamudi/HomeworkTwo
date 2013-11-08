// Name: Sai Kiran Vadlamudi		Username: svadlamudi		Section: B01
// Name: Marilda Bozdo				Username: mbozdo			Section: B06

public class SoccerContestant extends AbsRanked implements IContestant {

	
	String teamName;
	int numPlayers;
	String captainName;
	
	public SoccerContestant(String teamNameIn, int numPlayersIn, String captainNameIn, int rankIn){
				
		super(teamNameIn, rankIn);
		this.teamName = teamNameIn;
		this.numPlayers = numPlayersIn;
		this.captainName = captainNameIn;
		
	}

	public String getName() {
		return this.teamName;
	}
	
	public int getRank(){
		return this.rank;
	}
	
	public boolean hasBetterRanking(IContestant contestantTwo){
		
		SoccerContestant soccerContestant = (SoccerContestant)contestantTwo;
		
		if(this.rank < soccerContestant.rank)
			return true;
		else
			return false;
		
	}
}
