/**test
 * @(#)Boat.java
 *
 *
 * @author 
 * @version 1.00 2015/3/3
 */


public class Boat {
	private String name;
	private int cost;
	private int moves;
	private boolean teamAquaEngine;//to check if customization for teamAqua Engine is applied
	

    public Boat() {
    }

	//setter
	public void setName(String name) {
		this.name = name; 
	}

	public void setMoves(int moves) {
		this.moves = moves; 
	}

	public void setTeamAquaEngine(boolean teamAquaEngine) {
		this.teamAquaEngine = teamAquaEngine; 
	}
	//getter
	public String getName() {
		return (this.name); 
	}

	public int getMoves() {
		return (this.moves); 
	}

	public boolean getTeamAquaEngine() {
		return (this.teamAquaEngine); 
	}
    
    
}