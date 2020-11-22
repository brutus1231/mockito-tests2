package pl.sda;

import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

public class PersonValidator {

    private static Validator validator;

    public boolean validate(Person person) {
        initValidator();

        if (person == null) {
            return false;
        }
        return validator.validate(person).size() == 0;
    }

    private void initValidator() {
        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
        validator = factory.getValidator();
    }
}
