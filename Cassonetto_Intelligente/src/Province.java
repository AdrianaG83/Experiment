import java.util.ArrayList;

public class Province {

	private int id;
	private String name;
	private Region region;
	private ArrayList <City> cities;
	
	public Province(){
	}
	
	public Province(int id, String name, Region region) {
		this.id=id;
		this.name=name;
		this.region=region;
		this.cities=new ArrayList<City>();
	}
	
	public int getId(){
		return this.id;
	}
	
	public String getName(){
		return this.name;
	}
	
	public Region getRegion(){
		return this.region;
	}
	
	public ArrayList <City> getCities(){
		return this.cities;
	}
	
	public void setId (int id){
		this.id=id;
	}
	
	public void setCities(ArrayList <City> cities){
		this.cities=cities;
	}
	
	public String toString(){
		return "Province Id: "+ this.id + "\nProvince Name: "+ this.name + "\nRegion Province: " + this.region;
	}
}
