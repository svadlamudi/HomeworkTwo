public abstract class AbsTeam implements IContestant{
    String contestantName;
	int numPlayers;
	String captainName;
	
	public AbsTeam(String contestantNameIn, int numPlayersIn, String captainNameIn){
		this.contestantName = contestantNameIn;
		this.numPlayers = numPlayersIn;
		this.captainName = captainNameIn;
	}
        
        public String getName(){
            return this.contestantName;
        }
        
        public int getRank(){
            return 0;
        }
}
