import java.util.ArrayList;
import java.util.Date;

public class Dustman {

	private int id;
	private boolean active;
	private ArrayList <Dumpster> dumpsters;
	private Date date;
	
	public Dustman(){
	}
	
	public Dustman(int id, boolean active, Dumpster [] dumpsters, Date date){
		this.id=id;
		this.active=active;
		this.dumpsters=new ArrayList <Dumpster>();
		this.date=date;
	}
	
	public int getId(){
		return this.id;
	}
	
	public boolean isActive(){
		return this.active;
	}
	
	public ArrayList <Dumpster> getDumpsters(){
		return dumpsters;
	}

	public Date getDate() {
		return this.date;
	}	
	
	public void setId(int id){
		this.id=id;
	}
	
	public void setIsActive(boolean active){
		this.active=active;
	}
	
	public void setDumpsters(ArrayList <Dumpster> dumpsters) {
		this.dumpsters = dumpsters;
	}
	
	public String toString (){
		return "Id Dustman: "+ this.id + "\nState activation: " + this.active + "\nDate: " + this.date;
	}
}
