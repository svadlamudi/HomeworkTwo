// Name: Sai Kiran Vadlamudi		Username: svadlamudi		Section: B01
// Name: Marilda Bozdo				Username: mbozdo			Section: B06

public abstract class AbsTeamRanked extends AbsRanked{
    
	// Object field Initializers
	String contestantName;
    int numPlayers;
    String captainName;
	
    // constructor for the team and ranked sports
	public AbsTeamRanked(String contestantNameIn, int numPlayersIn, String captainNameIn, int rankIn){
            super(contestantNameIn, rankIn);
            this.numPlayers = numPlayersIn;
            this.captainName = captainNameIn;
	}
}
