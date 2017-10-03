package painoOhjelma.v1.dao;

import java.util.List;

import painoOhjelma.v1.bean.*;

public interface PainoDAO {

	public abstract void talleta(Paino paino);

	public abstract List<Paino> haeTietty(String pvm);
	
	public abstract List<Paino> haeKaikki();
	

	
}