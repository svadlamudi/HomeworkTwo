// Name: Sai Kiran Vadlamudi		Username: svadlamudi		Section: B01
// Name: Marilda Bozdo				Username: mbozdo			Section: B06

public class SwimmingScore implements IScore{
	
	// Object field initializers
	double timeOne;
	double timeTwo;
	
	// constructor for the swimming score object
	public SwimmingScore(double timeOneIn, double timeTwoIn){
		this.timeOne = timeOneIn;
		this.timeTwo = timeTwoIn;
	}
	
	// returns true if the swimming score is valid
	public boolean isValid(){
            return this.timeOne != this.timeTwo;
        }
        
        public String winner(IContestant contestantOne, IContestant contestantTwo) {
		if(this.timeTwo > timeOne)
			return contestantOne.getName();
		else if(this.timeOne > this.timeTwo)
			return contestantTwo.getName();
		else
			return "Invalid Match";
	}
}
