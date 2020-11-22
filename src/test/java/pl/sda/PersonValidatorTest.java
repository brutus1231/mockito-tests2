package pl.sda;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonValidatorTest {

    @Test
    void validate() {
        //given
        Person person = Person.builder()
                .firstName("kasia")
                .lastName("nowak")
                .age(20).build();
        PersonValidator validator = new PersonValidator();
        //when
        boolean validationResult = validator.validate(person);
        //then
        Assertions.assertEquals(validationResult, true);
    }
}