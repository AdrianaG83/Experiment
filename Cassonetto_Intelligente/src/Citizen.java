import java.util.ArrayList;

public class Citizen {

	private int id;
	private double totalScore;
	private ArrayList <Refuse> refuses;
	
	public Citizen(){
	}
	
	public Citizen (int id, double totalScore) {
		this.id=id;
		this.totalScore=totalScore;
		refuses=new ArrayList <Refuse>();
	}
	
	public int getId() {
		return this.id;
	}
	
	public double getTotalScore(){
		return this.totalScore;
	}
	
	public int countRefuses() {
		return refuses.size();
	}
	
	public double countMaterialRefuses (Material material) {
		double count=0;
		for (int i=0; i<refuses.size(); i++) {
			if (refuses.get(i).getMaterial()==material)
				count+=refuses.get(i).getWeight();
		}
		return count;
	}
	
	public void setId(int id) {
		this.id=id;
	}
	
	public void setTotalScore(double totalScore) {
		this.totalScore=totalScore;
	}
	
	public String toString() {
		return "Id Citizen: "+ this.id + "\nTotal Score: " + this.totalScore;
	}
}
