

public class Pokemon {
	private String name;
	private double encounterRate;
	private double catchRate;
	private String badge;
	private String waterTemperature;
	private String depthEncountered;
	

    public Pokemon() {
    }
//setter
	
	public void setName(String name) {
		this.name = name; 
	}

	public void setEncounterRate(double encounterRate) {
		this.encounterRate = encounterRate; 
	}

	public void setCatchRate(double catchRate) {
		this.catchRate = catchRate; 
	}

	public void setBadge(String badge) {
		this.badge = badge; 
	}

	public void setWaterTemperature(String waterTemperature) {
		this.waterTemperature = waterTemperature; 
	}

	public void setDepthEncountered(String depthEncountered) {
		this.depthEncountered = depthEncountered; 
	}
//getter
	public String getName() {
		return (this.name); 
	}

	public double getEncounterRate() {
		return (this.encounterRate); 
	}

	public double getCatchRate() {
		return (this.catchRate); 
	}

	public String getBadge() {
		return (this.badge); 
	}

	public String getWaterTemperature() {
		return (this.waterTemperature); 
	}

	public String getDepthEncountered() {
		return (this.depthEncountered); 
	}
    
    
}