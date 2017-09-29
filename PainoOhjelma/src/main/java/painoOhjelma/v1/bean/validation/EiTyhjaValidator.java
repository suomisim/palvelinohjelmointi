package painoOhjelma.v1.bean.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class EiTyhjaValidator implements
		ConstraintValidator<EiTyhja, String> {

	public void initialize(EiTyhja EiTyhja) {

	}

	public boolean isValid(String value, ConstraintValidatorContext context) {
		
		
		if (value == null || value.length() == 0) {
			return false;
		}
		return true;
	}
}