import java.util.ArrayList;

public class Region {

	private int id;
	private String name;
	private ArrayList<Province> list;
	
	public Region(){
	}
	
	public Region (int id, String name) {
		this.id=id;
		this.name=name;
		list=new ArrayList<Province>();
	}
	
	public int getId(){
		return this.id;
	}
	
	public String getName(){
		return this.name;
	}
	
	public ArrayList<Province> getList(){
		return this.list;
	}
	
	public void setId (int id){
		this.id=id;
	}
	
	public void setList(ArrayList<Province> list){
		this.list=list;
	}
	
	public String toString(){
		return "Region Id: "+this.id + "\nRegion Name: "+this.name;
	}
}
