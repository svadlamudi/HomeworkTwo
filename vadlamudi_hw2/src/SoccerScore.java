// Name: Sai Kiran Vadlamudi		Username: svadlamudi		Section: B01
// Name: Marilda Bozdo				Username: mbozdo			Section: B06

public class SoccerScore implements IScore{

	// SoccerScore Object field Initializers
	double goalsOne;
	double goalsTwo;
	boolean extraTime;
	
	// SoccerScore Object Constructor
	public SoccerScore(double goals1In, double goals2In, boolean extraTimeIn){
		
		this.goalsOne = goals1In;
		this.goalsTwo = goals2In;
		this.extraTime = extraTimeIn;
		
	}
}
