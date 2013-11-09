public abstract class AbsRanked implements IContestant{
    String contestantName;
	int rank;
	
	public AbsRanked(String contestantNameIn, int rankIn){
		this.contestantName = contestantNameIn;
		this.rank = rankIn;
	}
        
        public String getName(){
            return this.contestantName;
        }
        
        public int getRank(){
            return this.rank;
        }
        
        public boolean hasBetterRanking(IContestant contestantTwo){
            return this.rank < contestantTwo.getRank();
        }
}
