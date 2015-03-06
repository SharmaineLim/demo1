
public class Treasure {
	private String name;
	private int price;
	private String treasureTileCode;
	private double encounterRate;

    public Treasure() {
    }

	//setter
	public void setName(String name) {
		this.name = name; 
	}

	public void setPrice(int price) {
		this.price = price; 
	}

	public void setTreasureTileCode(String treasureTileCode) {
		this.treasureTileCode = treasureTileCode; 
	}
	public void setEncounterRate(double encounterRate) {
		this.encounterRate = encounterRate; 
	}
	//getter
	public String getName() {
		return (this.name); 
	}

	public int getPrice() {
		return (this.price); 
	}

	public String getTreasureTileCode() {
		return (this.treasureTileCode); 
	}

	public double getEncounterRate() {
		return (this.encounterRate); 
	}
	

    
    
}