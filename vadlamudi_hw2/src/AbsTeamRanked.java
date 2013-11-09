public abstract class AbsTeamRanked extends AbsRanked{
    String contestantName;
    int numPlayers;
    String captainName;
	
	public AbsTeamRanked(String contestantNameIn, int numPlayersIn, String captainNameIn, int rankIn){
            super(contestantNameIn, rankIn);
            this.numPlayers = numPlayersIn;
            this.captainName = captainNameIn;
	}
}
