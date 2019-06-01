import java.util.ArrayList;


public class Dumpster {

	private int id;
	private String addresse;
	private double capacity;
	private Material material;
	private City city;
	private boolean empty;
	private ArrayList <Refuse> refuses;
	
	
	public Dumpster(){
	}
	
	public Dumpster(int id, String addresse, Material material, City city) {
		this.id=id;
		this.addresse=addresse;
		this.material=material;
		this.city=city;
		refuses=new ArrayList <Refuse>();
	}
	
	public int getId(){
		return this.id;
	}
	
	public String getAddresse(){
		return this.addresse;
	}
	
	public Material getMaterial(){
		return this.material;
	}
	

	public City getCity(){
		return this.city;
	}
	
	private boolean isEmpty(){
		int totalWeight=0;
		for (int i=0; i<refuses.size(); i++)
			totalWeight+=refuses.get(i).getWeight();
		if (this.capacity>=totalWeight)
			return true;
		else
			return false;
	}
	
	public ArrayList<Refuse> getRefuses(){
		return refuses;
	}
	
	public int countMaterial(Material material){
		int conta=0;
		for (int i=0; i<refuses.size(); i++){
			if(this.refuses.get(i).getMaterial()== material){
				conta++;
			}
		}
		return conta;
	}
	
	public boolean addRefuse(Refuse refuse){
		for (int i=0; i<refuses.size(); i++){
			if(this.refuses.get(i)== null){
				this.refuses.add(refuse);
				return true;
			}
		}
		return false;
	}
	
	
	public int getRefusesNumber() {
		return refuses.size();
	}
	
	
	public void setId (int id){
		this.id=id;
	}
	
	public void setMaterial(Material material) {
		this.material=material;
	}
	
	public void setRefuse(ArrayList<Refuse> refuses){
		this.refuses=refuses;
	}
	
	public String toString(){
		return "Dumpster Id: "+ this.id + "\nDumpster addresse: "+ this.addresse +  "\nDumpster Material : " + this.material + "\nDumpster City : " + this.city;
	}
}
