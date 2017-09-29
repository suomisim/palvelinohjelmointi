package painoOhjelma.v1.bean.validation;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.PARAMETER;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;
 
@Documented
@Constraint(validatedBy =  PerusPainoValidator.class)
@Target( { FIELD, PARAMETER })
@Retention(RetentionPolicy.RUNTIME)
public @interface PerusPaino {
	
 String message() default "{painoOhjelma.v1.PerusPaino.message}";
 
 Class<?>[] groups() default {};
 
 Class<? extends Payload>[] payload() default {};
}
