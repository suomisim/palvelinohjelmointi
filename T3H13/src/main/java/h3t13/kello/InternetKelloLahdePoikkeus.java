package h3t13.kello;

public class InternetKelloLahdePoikkeus extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public InternetKelloLahdePoikkeus(String viesti, Throwable poikkeus) {
		super(viesti, poikkeus);
	}

}
