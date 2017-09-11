package paino.bean;

public class PainoHenkilo {

	private int id;
	private double paino;
	
	public PainoHenkilo (int id, double paino) {
		super();
		this.id = id;
		this.paino = paino;
	}
	public PainoHenkilo (double paino) {
		super();
		this.paino = paino;
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
		return "Paino: " + paino;
	}

	
	
}
