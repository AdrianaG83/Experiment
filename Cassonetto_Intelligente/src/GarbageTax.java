
public class GarbageTax {

	private int id;
	private Citizen citizen;
	private City city;
	private double amount;
	private boolean paid;
	
	public GarbageTax() {
	}
	
	public GarbageTax(int id, Citizen citizen, City city, double amount, boolean paid) {
		this.id=id;
		this.citizen=citizen;
		this.city=city;
		this.amount=amount;
		this.paid=paid;
	}

	public int getId() {
		return id;
	}

	public Citizen getCitizen() {
		return citizen;
	}

	public City getCity() {
		return city;
	}

	public double getAmount() {
		return amount;
	}

	public boolean isPaid() {
		return paid;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setCity(City city) {
		this.city = city;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public void setPaid(boolean paid) {
		this.paid = paid;
	}

	@Override
	public String toString() {
		return "Id GarbageTax:" + this.id + "\nCitizen: " + this.citizen + "\nCity: " + this.city + "\nAmount: " + this.amount + "\nPaid: " + this.paid;
	}
	
	
	
}
