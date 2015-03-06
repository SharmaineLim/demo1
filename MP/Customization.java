

public class Customization {
	private String name;
	private int cost;
	private int encounterRate;
	private double captureRate;
	private int moves;
	public String pointOfCustomization;// the choices are lure, line or reel. to check whether the chosen customization is applicable to the chosen attribute.
	

    public Customization() {
    }

	//setter
	public void setName(String name) {
		this.name = name; 
	}

	public void setCost(int cost) {
		this.cost = cost; 
	}

	public void setEncounterRate(int encounterRate) {
		this.encounterRate = encounterRate; 
	}

	public void setCaptureRate(double captureRate) {
		this.captureRate = captureRate; 
	}

	public void setPointOfCustomization(String pointOfCustomization) {
		this.pointOfCustomization = pointOfCustomization; 
	}
	public void setMoves(int moves) {
		this.moves = moves; 
	}
	//getter
	public String getName() {
		return (this.name); 
	}

	public int getCost() {
		return (this.cost); 
	}

	public int getEncounterRate() {
		return (this.encounterRate); 
	}

	public double getCaptureRate() {
		return (this.captureRate); 
	}

	public String getPointOfCustomization() {
		return (this.pointOfCustomization); 
	}

	public int getMoves() {
		return (this.moves); 
	}
    //method that checks if the customizaation is valid then increases the encounter rate and capture rate of rods while decreasing the money
    //method for increasing the moves avaiable by 2x of a certain boat
    
}