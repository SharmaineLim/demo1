


public class TackleBox {
	private String name;
	private int cost;
	private int casts;
    public TackleBox() {
    }

	//setter
	public void setName(String name) {
		this.name = name; 
	}

	public void setCost(int cost) {
		this.cost = cost; 
	}

	public void setCasts(int casts) {
		this.casts = casts; 
	}
	//getter
	public String getName() {
		return (this.name); 
	}

	public int getCost() {
		return (this.cost); 
	}

	public int getCasts() {
		return (this.casts); 
	}
    
    
}