
public class Home {

	private int id;
	private double meters;
	private Citizen citizen;
	private City city;
	
	public Home(){
	}
	
	public Home(int id, double meters, Citizen citizen, City city) {
		this.id=id;
		this.meters=meters;
		this.citizen=citizen;
		this.city=city;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getMeters() {
		return meters;
	}

	public void setMeters(double meters) {
		this.meters = meters;
	}

	public Citizen getCitizen() {
		return citizen;
	}

	public void setCitizen(Citizen citizen) {
		this.citizen = citizen;
	}

	public City getCity() {
		return city;
	}

	public void setCity(City city) {
		this.city = city;
	}
	
	public String toString () {
		return "Id Home: "+ this.id + "\nMeters: " + this.meters + "\nOwner: " + this.citizen + "\nCity: " + this.city;
	}
}
