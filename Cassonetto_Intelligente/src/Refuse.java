import java.util.Date;

public class Refuse {

	private int id;
	private Dumpster dumpster;
	private double weight;
	private Material material;
	private double scoreRefuse;
	private Citizen citizen;
	private Date date;
	
	public Refuse(){	
	}
	
	public Refuse (int id, Dumpster dumpster, double weight, Material material, double scoreRefuse, Citizen citizen, Date date) {
		this.id=id;
		this.dumpster=dumpster;
		this.weight=weight;
		this.material=material;
		this.scoreRefuse=scoreRefuse;
		this.citizen=citizen;
		this.date=date;
	}
	
	public int getId(){
		return this.id;
	}
	
	public Dumpster getDumpster(){
		return this.dumpster;
	}
	
	public double getWeight(){
		return this.weight;
	}
	
	public Material getMaterial(){
		return this.material;
	}
	
	public double getScoreRefuse() {
		return this.scoreRefuse;
	}
	
	public Citizen getCitizen() {
		return this.citizen;
	}
	
	public Date getDate() {
		return this.date;
	}
	
	
	public void setId(int id) {
		this.id=id;
	}
	
	public void setDumpster (Dumpster dumpster) {
		this.dumpster=dumpster;
	}
	
	public void setMaterial (Material material) {
		this.material=material;
	}
	
	public void setScoreRefuse (double scoreRefuse) {
		this.scoreRefuse=scoreRefuse;
	}
	
	
	public String toString() {
		return "Id Refuse: " + this.id + "\nDumpster: " + this.dumpster + "\nWeight refuse: " + this.weight + "\nMaterial refuse: " + this.material + "\nScore refuse: " + this.scoreRefuse + "\nData: " + this.date;
	}
}
