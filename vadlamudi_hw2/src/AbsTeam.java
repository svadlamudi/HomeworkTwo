// Name: Sai Kiran Vadlamudi		Username: svadlamudi		Section: B01
// Name: Marilda Bozdo				Username: mbozdo			Section: B06

public abstract class AbsTeam implements IContestant{
    
	// Object field Initializers
	String contestantName;
	int numPlayers;
	String captainName;
	
	// constructor for the team class
	public AbsTeam(String contestantNameIn, int numPlayersIn, String captainNameIn){
		this.contestantName = contestantNameIn;
		this.numPlayers = numPlayersIn;
		this.captainName = captainNameIn;
	}
        
	// returns the name of the team
	public String getName(){
		return this.contestantName;
	}
       
	// returns the rank of the team which doesnt exist so 0
	public int getRank(){
		return 0;
	}
}
