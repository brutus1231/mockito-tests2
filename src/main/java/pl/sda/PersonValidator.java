package pl.sda;

import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

public class PersonValidator {

    private static Validator validator;

    public boolean validate(Person person) {
        initValidator();

        return validator.validate(person, Person.class).size() == 0;
    }

    private void initValidator() {
        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
        validator = factory.getValidator();
    }
}
