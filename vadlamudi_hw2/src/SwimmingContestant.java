// Name: Sai Kiran Vadlamudi		Username: svadlamudi		Section: B01
// Name: Marilda Bozdo				Username: mbozdo			Section: B06

public class SwimmingContestant extends AbsRanked implements IContestant {

	public SwimmingContestant(String rankTeamNameIn, int rankIn){		
		super(rankTeamNameIn, rankIn);		
	}

	public String getName() {
		return this.rankTeamName;
	}
	
	
}
