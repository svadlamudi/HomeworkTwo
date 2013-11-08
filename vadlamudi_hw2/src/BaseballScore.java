// Name: Sai Kiran Vadlamudi		Username: svadlamudi		Section: B01
// Name: Marilda Bozdo				Username: mbozdo			Section: B06

public class BaseballScore implements IScore{

	double runs1;
	double runs2;
	double totalInnings;
	
	// Baseball Score Constructor
	public BaseballScore(double runs1In, double runs2In, double totalInningsIn){
		
		this.runs1 = runs1In;
		this.runs2 = runs2In;
		this.totalInnings = totalInningsIn;
		
	}
}
