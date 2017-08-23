package t1h14.bean;

public class Kirja {
	
	private String nimi;
	private String kirjoittaja;
	private String isbn;
	
	public Kirja(String nimi, String kirjoittaja, String isbn) {
		super();
		this.nimi = nimi;
		this.kirjoittaja = kirjoittaja;
		this.isbn = isbn;
	}
	
	public String getNimi() {
		return nimi;
	}

	public void setnimi(String nimi) {
		this.nimi = nimi;
	}

	public String getKirjoittaja() {
		return kirjoittaja;
	}

	public void setKirjoittaja(String kirjoittaja) {
		this.kirjoittaja = kirjoittaja;
	}
	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	@Override
	public String toString() {
		return isbn + " " + kirjoittaja + ": " + nimi;
	}
}
