package paino.bean;

public class Henkilo {
	
	private int id;
	private String nimi;
	private double paino;
	
	public Henkilo(int id, String nimi, double paino) {
		super();
		this.id = id;
		this.nimi = nimi;
		this.paino = paino;
	}
	
	public Henkilo(String nimi, double paino) {
		super();
		this.nimi = nimi;
		this.paino = paino;
	}
	public Henkilo(int id, String nimi) {
		super();
		this.id = id;
		this.nimi = nimi;
	}

		public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNimi() {
		return nimi;
	}

	public void setNimi(String nimi) {
		this.nimi = nimi;
	}

	public double getPaino() {
		return paino;
	}

	public void setPaino(double paino) {
		this.paino = paino;
	}

	@Override
	public String toString() {
		return "Henkilo [id=" + id + ", nimi=" + nimi + ", paino="
				+ paino + "]";
	}

	
}