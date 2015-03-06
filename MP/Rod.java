

public class Rod {
	private String name;
	private int cost;
	private int encounterRate;
	private double captureRate;
	private boolean lure;//to check if customization for lure is applied
	private boolean line;//to check if customization for line is applied
	private boolean reel;//to check if customization for reel is applied

    public Rod() {
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

	public void setLure(boolean lure) {
		this.lure = lure; 
	}

	public void setLine(boolean line) {
		this.line = line; 
	}

	public void setReel(boolean reel) {
		this.reel = reel; 
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

	public boolean getLure() {
		return (this.lure); 
	}

	public boolean getLine() {
		return (this.line); 
	}

	public boolean getReel() {
		return (this.reel); 
	}
    //method that increases the encounter rate and capture rate of pokemons
    
}