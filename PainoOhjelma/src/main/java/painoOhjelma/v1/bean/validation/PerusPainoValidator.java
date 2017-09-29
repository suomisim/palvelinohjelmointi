package painoOhjelma.v1.bean.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class PerusPainoValidator implements
		ConstraintValidator<PerusPaino, String> {

	public void initialize(PerusPaino PerusPaino) {

	}

	public boolean isValid(String value, ConstraintValidatorContext context) {
		
		if (value == null || value.length() == 0) {
			return false;
		} else if (value != null && value.length() != 0) {
			double tuplaValue = Double.parseDouble(value);
			if (tuplaValue < 40 || tuplaValue > 199 || value == null) {
				return false;
		} else {return true;
		
		}
		
	}
		else { return true;
}
}
}