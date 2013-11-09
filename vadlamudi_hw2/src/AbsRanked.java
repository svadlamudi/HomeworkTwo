// Name: Sai Kiran Vadlamudi		Username: svadlamudi		Section: B01
// Name: Marilda Bozdo				Username: mbozdo			Section: B06

public abstract class AbsRanked implements IContestant{
    
	// Object field Initializers
	String contestantName;
	int rank;
	
	// constructor for the ranked class
	public AbsRanked(String contestantNameIn, int rankIn){
		this.contestantName = contestantNameIn;
		this.rank = rankIn;
	}
       
	// returns the contestant name
	public String getName(){
		return this.contestantName;
	}
    
	// returns the contestant rank
	public int getRank(){
		return this.rank;
    }
      
	// returns true if the rank of the first contestant is greater than the first (lower ranks are greater)
	public boolean hasBetterRanking(IContestant contestantTwo){
		return this.rank < contestantTwo.getRank();
	}
}
