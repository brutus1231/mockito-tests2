package pl.sda;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class PersonValidatorTest {

    @ParameterizedTest
    @CsvSource({
            "Monika,Kowalska,20,true",
            "Justyna,Nowak,21,true",
            "a,a,30,false",
            ",,,false",
            "aaa, a, 30, false",
            "b,b,20,false"
    })
    @DisplayName("should validate person data")
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

    @ParameterizedTest
    @MethodSource("personDataProducer")
    @DisplayName("should validate person data with method source")
    void validateMethodSource(Person person, Boolean expectedResult) {
        //given
        PersonValidator validator = new PersonValidator();
        //when
        boolean validationResult = validator.validate(person);
        //then
        Assertions.assertEquals(validationResult, expectedResult);
    }

    static Stream<Arguments> personDataProducer() {
        return Stream.of(
                Arguments.arguments(Person.builder().firstName("Monika").lastName("Kowalska").age(20).build(), true),
                Arguments.arguments(Person.builder().firstName("Justyna").lastName("Nowak").age(21).build(), true),
                Arguments.arguments(Person.builder().firstName("a").lastName("a").age(30).build(), false),
                Arguments.arguments(Person.builder().build(), false),
                Arguments.arguments(null, false)
        );
    }
}