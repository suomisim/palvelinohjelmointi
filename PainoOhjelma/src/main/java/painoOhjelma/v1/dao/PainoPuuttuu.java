package painoOhjelma.v1.dao;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@SuppressWarnings("serial")
@ResponseStatus(value=HttpStatus.NOT_FOUND)
public class PainoPuuttuu extends RuntimeException {

	public PainoPuuttuu(Exception cause) {
		super(cause);
	}
	
}