import tester.*;

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
	
/////////////////////////////////////////////////////////////////////*Tournaments*///////////////////////////////////////////////////////////
        
        SoccerScore soccerFinals = new SoccerScore(15, 7, false);
        SoccerContestant soccerFinalistOne = new SoccerContestant("Barcelona", 15, "Rob", 1);
        SoccerContestant soccerFinalistTwo = new SoccerContestant("Madrid", 15, "Tim", 2);
        MatchData soccerFinal = new MatchData(soccerFinalistOne, soccerFinalistTwo, soccerFinals);
        
        SoccerScore soccerSemiFinalsOne = new SoccerScore(13, 10, false);
        SoccerContestant SoccerSemiFinalistOne = new SoccerContestant("Barcelona", 15 , "Jim", 1);
        SoccerContestant SoccerSemiFinalistTwo = new SoccerContestant("UK", 15 , "Bob", 3);
        MatchData soccerSemiFinalOne = new MatchData(SoccerSemiFinalistOne, SoccerSemiFinalistTwo, soccerSemiFinalsOne);
        
/////////////////////////////////////////////////////////////////////*Tests*////////////////////////////////////////////////////////////////        
	
	boolean testWinner(Tester t){
		return (t.checkExpect(baseballScoreOne.winner(baseballContestantOne, baseballContestantTwo), "Red Sox") &&
				t.checkExpect(soccerScoreOne.winner(soccerContestantOne, soccerContestantTwo), "Barcelona")     &&
				t.checkExpect(swimmingScoreOne.winner(swimmingContestantOne, swimmingContestantTwo), "Jack"));
	}
        
        boolean testHasBetterRanking(Tester t){
            return (t.checkExpect(soccerContestantOne.hasBetterRanking(soccerContestantTwo), true) &&
                    t.checkExpect(swimmingContestantOne.hasBetterRanking(swimmingContestantTwo), false));
        }
}
