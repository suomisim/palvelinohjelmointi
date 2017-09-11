package paino.bean;

public class PainoHenkilo {

	private String date;
	private int id;
	private double paino;
	
	public PainoHenkilo (String date, int id, double paino) {
		super();
		this.date = date;
		this.id = id;
		this.paino = paino;
	}
	public PainoHenkilo (String date, double paino) {
		super();
		this.date = date;
		this.paino = paino;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getPaino() {
		return paino;
	}
	public void setPaino(double paino) {
		this.paino = paino;
	}
	@Override
	public String toString() {
		return "Päivä: " + date + "Paino: " + paino;
	}

	
	
}
