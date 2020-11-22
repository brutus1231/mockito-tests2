package pl.sda;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class PersonValidatorTest {

    @ParameterizedTest
    @CsvSource("{}")
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