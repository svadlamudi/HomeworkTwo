// Name: Sai Kiran Vadlamudi		Username: svadlamudi		Section: B01
// Name: Marilda Bozdo				Username: mbozdo			Section: B06

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
        MatchData soccerFinalMatch = new MatchData(soccerFinalistOne, soccerFinalistTwo, soccerFinals);
        
        SoccerScore soccerSemiFinalsOne = new SoccerScore(13, 10, false);
        SoccerContestant soccerSemiFinalistOne = new SoccerContestant("Barcelona", 15 , "Jim", 2);
        SoccerContestant soccerSemiFinalistTwo = new SoccerContestant("UK", 15 , "Bob", 3);
        MatchData soccerSemiFinalMatchOne = new MatchData(soccerSemiFinalistOne, soccerSemiFinalistTwo, soccerSemiFinalsOne);
        
        SoccerScore soccerSemiFinalsTwo = new SoccerScore(14, 7, false);
        SoccerContestant soccerSemiFinalistThree = new SoccerContestant("Madrid", 15 , "Jerry", 1);
        SoccerContestant soccerSemiFinalistFour = new SoccerContestant("Machester", 15 , "Rick", 4);
        MatchData soccerSemiFinalMatchTwo = new MatchData(soccerSemiFinalistThree, soccerSemiFinalistFour, soccerSemiFinalsTwo);
        
        SoccerScore soccerDistrictsOne = new SoccerScore(12, 9, false);
        SoccerContestant soccerDistrictOne = new SoccerContestant("Barcelona", 15, "Rob", 1);
        SoccerContestant soccerDistrictTwo = new SoccerContestant("Chelsea", 15, "Mark", 2);
        MatchData soccerDistrictMatchOne = new MatchData(soccerDistrictOne, soccerDistrictTwo, soccerDistrictsOne);

        SoccerScore soccerDistrictsTwo = new SoccerScore(14, 9, false);
        SoccerContestant soccerDistrictThree = new SoccerContestant("UK", 15, "John", 1);
        SoccerContestant soccerDistrictFour = new SoccerContestant("Liverpool", 15, "Shane", 2);
        MatchData soccerDistrictMatchTwo = new MatchData(soccerDistrictThree, soccerDistrictFour, soccerDistrictsTwo);
        
        InitMatch soccerFinalTournament = new InitMatch(soccerFinalMatch);
        
        InitMatch soccerSemiFinalInitTournamentOne = new InitMatch(soccerSemiFinalMatchOne);
        InitMatch soccerSemiFinalTournamentTwo = new InitMatch(soccerSemiFinalMatchTwo);
        
        InitMatch soccerDistrictTournamentOne = new InitMatch(soccerDistrictMatchOne);
        InitMatch soccerDistrictTournamentTwo = new InitMatch(soccerDistrictMatchTwo);
        
        AdvanceMatch soccerSemiFinalTournamentOne = new AdvanceMatch(soccerSemiFinalInitTournamentOne, soccerDistrictTournamentOne, soccerDistrictTournamentTwo);
        
        ITournament soccerTournament = new AdvanceMatch(soccerFinalTournament,
        												soccerSemiFinalTournamentOne,
        												soccerSemiFinalTournamentTwo);
        
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
        
        boolean testSatisfiesInvariant(Tester t){
        	return t.checkExpect(soccerTournament.satisfiesInvariant(), true);
        }
}
