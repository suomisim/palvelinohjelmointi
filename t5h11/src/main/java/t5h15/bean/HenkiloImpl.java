package t5h15.bean;

public class HenkiloImpl implements Henkilo {

	private int id;
	private String etunimi;
	private String sukunimi;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEtunimi() {
		return etunimi;
	}

	public void setEtunimi(String etunimi) {
		this.etunimi = etunimi;
	}

	public String getSukunimi() {
		return sukunimi;
	}

	public void setSukunimi(String sukunimi) {
		this.sukunimi = sukunimi;
	}
	
	@Override
	public String toString() {
		return "HenkiloImpl [id=" + id + ", etunimi=" + etunimi + ", sukunimi="
				+ sukunimi + "]";
	}
	
	
}
