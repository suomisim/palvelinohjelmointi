package painoOhjelma.v1.bean;

import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import org.hibernate.validator.constraints.NotEmpty;



public class PainoImpl implements Paino {
	
	private int id;
	
	@NotEmpty
	@Pattern(regexp = "[0-9]{2}.[0-9]{2}.[0-9]{4}")
	private String pvm;
	
	@NotEmpty
	@Size(min=2, max=6)
	@Pattern(regexp = "^[0-9]{2,3}[.][0-9]{2}$")
	private String paino;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPvm() {
		return pvm;
	}

	public void setPvm(String pvm) {
		this.pvm = pvm;
	}
	
	public String getPaino() {
		return paino;
	}

	public void setPaino(String paino) {
		this.paino = paino;
	}

	
	@Override
	public String toString() {
		return "PainoHenkiloImpl [id= " + id + ", pvm= " + pvm + ", paino= " + paino + "]";
	}
	
	
}
