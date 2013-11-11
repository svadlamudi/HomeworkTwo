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
        
      	// Soccer Final Matches
		SoccerScore soccerFinals = new SoccerScore(15, 7, false);
        SoccerContestant soccerFinalistOne = new SoccerContestant("Barcelona", 15, "Rob", 1);
        SoccerContestant soccerFinalistTwo = new SoccerContestant("Madrid", 15, "Tim", 2);
        MatchData soccerFinalMatch = new MatchData(soccerFinalistOne, soccerFinalistTwo, soccerFinals);
        
        // Soccer Semi-Final Matches
        SoccerScore soccerSemiFinalsOne = new SoccerScore(13, 10, false);
        SoccerContestant soccerSemiFinalistOne = new SoccerContestant("Barcelona", 15 , "Jim", 2);
        SoccerContestant soccerSemiFinalistTwo = new SoccerContestant("UK", 15 , "Bob", 3);
        MatchData soccerSemiFinalMatchOne = new MatchData(soccerSemiFinalistOne, soccerSemiFinalistTwo, soccerSemiFinalsOne);
        
        SoccerScore soccerSemiFinalsTwo = new SoccerScore(14, 7, false);
        SoccerContestant soccerSemiFinalistThree = new SoccerContestant("Madrid", 15 , "Jerry", 1);
        SoccerContestant soccerSemiFinalistFour = new SoccerContestant("Machester", 15 , "Rick", 4);
        MatchData soccerSemiFinalMatchTwo = new MatchData(soccerSemiFinalistThree, soccerSemiFinalistFour, soccerSemiFinalsTwo);
        
        // Soccer District Matches
        SoccerScore soccerDistrictsOne = new SoccerScore(12, 9, false);
        SoccerContestant soccerDistrictOne = new SoccerContestant("Barcelona", 15, "Rob", 1);
        SoccerContestant soccerDistrictTwo = new SoccerContestant("Chelsea", 15, "Mark", 2);
        MatchData soccerDistrictMatchOne = new MatchData(soccerDistrictOne, soccerDistrictTwo, soccerDistrictsOne);

        SoccerScore soccerDistrictsTwo = new SoccerScore(14, 9, false);
        SoccerContestant soccerDistrictThree = new SoccerContestant("UK", 15, "John", 1);
        SoccerContestant soccerDistrictFour = new SoccerContestant("Liverpool", 15, "Shane", 2);
        MatchData soccerDistrictMatchTwo = new MatchData(soccerDistrictThree, soccerDistrictFour, soccerDistrictsTwo);
        
        SoccerScore soccerDistrictsThree = new SoccerScore(18, 8, false);
        SoccerContestant soccerDistrictFive = new SoccerContestant("Madrid", 15, "Jerry", 1);
        SoccerContestant soccerDistrictSix = new SoccerContestant("Ghana", 15, "James", 2);
        MatchData soccerDistrictMatchThree = new MatchData(soccerDistrictFive, soccerDistrictSix, soccerDistrictsThree);
        
        SoccerScore soccerDistrictsFour = new SoccerScore(15, 8, false);
        SoccerContestant soccerDistrictSeven = new SoccerContestant("Manchester", 15, "Jerry", 1);
        SoccerContestant soccerDistrictEight = new SoccerContestant("Arsenal", 15, "Brian", 2);
        MatchData soccerDistrictMatchFour = new MatchData(soccerDistrictSeven, soccerDistrictEight, soccerDistrictsFour);
        
        // Soccer Final Tournaments
        InitMatch soccerFinalTournament = new InitMatch(soccerFinalMatch);
        
        // Soccer Semi-Final Tournaments
        InitMatch soccerSemiFinalInitTournamentOne = new InitMatch(soccerSemiFinalMatchOne);
        InitMatch soccerSemiFinalInitTournamentTwo = new InitMatch(soccerSemiFinalMatchTwo);
        
        // Soccer District Tournaments
        InitMatch soccerDistrictTournamentOne = new InitMatch(soccerDistrictMatchOne);
        InitMatch soccerDistrictTournamentTwo = new InitMatch(soccerDistrictMatchTwo);
        InitMatch soccerDistrictTournamentThree = new InitMatch(soccerDistrictMatchThree);
        InitMatch soccerDistrictTournamentFour = new InitMatch(soccerDistrictMatchFour);
        
        // Soccer Semi-Final Tournaments
        AdvanceMatch soccerSemiFinalTournamentOne = new AdvanceMatch(soccerSemiFinalInitTournamentOne, soccerDistrictTournamentOne, soccerDistrictTournamentTwo);
        AdvanceMatch soccerSemiFinalTournamentTwo = new AdvanceMatch(soccerSemiFinalInitTournamentTwo, soccerDistrictTournamentThree, soccerDistrictTournamentFour);
        
        // Soccer Final Tournaments
        ITournament soccerTournament = new AdvanceMatch(soccerFinalTournament,
        												soccerSemiFinalTournamentOne,
        												soccerSemiFinalInitTournamentTwo);
        
        ITournament soccerTournamentTwo = new AdvanceMatch(soccerFinalTournament,
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
        	return (t.checkExpect(soccerTournament.satisfiesInvariant(), false) &&
        			t.checkExpect(soccerTournamentTwo.satisfiesInvariant(), true));
        }
}
