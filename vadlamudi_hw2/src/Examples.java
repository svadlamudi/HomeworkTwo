import tester.Tester;

// Name: Sai Kiran Vadlamudi		Username: svadlamudi		Section: B01
// Name: Marilda Bozdo				Username: mbozdo			Section: B06

public class Examples {
	
	Examples() {};
	
/////////////////////////////////////////////////////////////////////*Baseball*/////////////////////////////////////////////////////////////
	
	BaseballScore baseballScoreOne = new BaseballScore(16, 15, 7);
	
	BaseballContestant baseballContestantOne = new BaseballContestant("Red Sox", 9, "Jim");
	BaseballContestant baseballContestantTwo = new BaseballContestant("Yankees", 10, "Bob");
	
	MatchData baseball = new MatchData(baseballContestantOne, baseballContestantTwo, baseballScoreOne);
	
/////////////////////////////////////////////////////////////////////*Soccer*///////////////////////////////////////////////////////////////
	
	SoccerScore soccerScoreOne = new SoccerScore(20, 17, false);
	
	SoccerContestant soccerContestantOne = new SoccerContestant("Barcelona", 15, "Rob", 1);
	SoccerContestant soccerContestantTwo = new SoccerContestant("Madrid", 13, "Tim", 2);
	
	MatchData soccer = new MatchData(soccerContestantOne, soccerContestantTwo, soccerScoreOne);
	
/////////////////////////////////////////////////////////////////////*Swimming*/////////////////////////////////////////////////////////////
	
	SwimmingScore swimmingScoreOne = new SwimmingScore(89.005, 89.001);
	
	SwimmingContestant swimmingContestantOne = new SwimmingContestant("John", 2);
	SwimmingContestant swimmingContestantTwo = new SwimmingContestant("Jack", 1);
	
	MatchData swimming = new MatchData(swimmingContestantOne, swimmingContestantTwo, swimmingScoreOne);	
	
/////////////////////////////////////////////////////////////////////*Tests*////////////////////////////////////////////////////////////////
	
	boolean testWinner(Tester t){
		return (t.checkExpect(baseballScoreOne.winner(baseballContestantOne, baseballContestantTwo), "Red Sox") &&
				t.checkExpect(soccerScoreOne.winner(soccerContestantOne, soccerContestantTwo), "Barcelona")     &&
				t.checkExpect(swimmingScoreOne.winner(swimmingContestantOne, swimmingContestantTwo), "Jack"));
	}
}
