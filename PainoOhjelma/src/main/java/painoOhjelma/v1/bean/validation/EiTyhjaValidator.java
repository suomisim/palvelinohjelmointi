package painoOhjelma.v1.bean.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class EiTyhjaValidator implements
		ConstraintValidator<EiTyhja, Double> {

	public void initialize(EiTyhja EiTyhja) {

	}

	public boolean isValid(Double value, ConstraintValidatorContext context) {
		
		if (value == null) {
			return false;
		}
		return true;
	}
}