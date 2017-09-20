package t4h14.bean;

public class Levy {
	
	private int id;
	private String nimi;
	private String artisti;
	private int vuosi;
	
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
	public String getArtisti() {
		return artisti;
	}
	public void setArtisti(String artisti) {
		this.artisti = artisti;
	}
	public int getVuosi() {
		return vuosi;
	}
	public void setVuosi(int vuosi) {
		this.vuosi = vuosi;
	}
	
	@Override
	public String toString() {
		return "LevyImpl [id=" + id + ", nimi=" + nimi + ", artisti="
				+ artisti + ", vuosi=" + vuosi + "]";
	}
	

}
