package pl.sda;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class PersonValidatorTest {

    @ParameterizedTest
    @CsvSource({"Monika,Kowalska,20,true", "Justyna,Nowak,21,true", "a,a,30,false", ",,,false"})
    void validate(String firstName, String lastName, Integer age, Boolean expectedResult) {
        //given
        Person person = Person.builder()
                .firstName(firstName)
                .lastName(lastName)
                .age(age).build();
        PersonValidator validator = new PersonValidator();
        //when
        boolean validationResult = validator.validate(person);
        //then
        Assertions.assertEquals(validationResult, expectedResult);
    }
}