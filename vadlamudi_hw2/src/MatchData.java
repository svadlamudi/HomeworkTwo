// Name: Sai Kiran Vadlamudi		Username: svadlamudi		Section: B01
// Name: Marilda Bozdo				Username: mbozdo			Section: B06

public class MatchData {

	// MatchData Object field Initializers
	IContestant contestantOne;
	IContestant contestantTwo;
	IScore score;
	
	// MatchData Object Constructor
	public MatchData(IContestant contestantOneIn, IContestant contestantTwoIn, IScore scoreIn){
		this.contestantOne = contestantOneIn;
		this.contestantTwo = contestantTwoIn;
		this.score = scoreIn;
	}	
}
