
public class City {

	private int id;
	private String name;
	private Province province;
	
	public City(){
	}
	
	public City(int id, String name, Province province) {
		this.id=id;
		this.name=name;
		this.province=province;
	}
	
	public int getId(){
		return this.id;
	}
	
	public String getName(){
		return this.name;
	}
	
	public Province getProvince(){
		return this.province;
	}
	
	public void setId (int id){
		this.id=id;
	}
	
	public void setProvince (Province province){
		this.province=province;
	}
	
	public String toString(){
		return "City Id: "+ this.id + "\nCity Name: "+ this.name +  "\nCity Province" + this.province;
	}
}
