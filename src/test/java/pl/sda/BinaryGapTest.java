package pl.sda;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class BinaryGapTest {

    @ParameterizedTest
    @MethodSource("numberDataProducer")
    @DisplayName("should calculate binary gap")
    void shouldCalculateBinaryGap(Integer numberToTest, Integer expectedResult) {
        //given
        BinaryGap binaryGap = new BinaryGap();
        //when
        Integer result = binaryGap.calculate(numberToTest);
        //then
        Assertions.assertEquals(result, expectedResult);
    }

    static Stream<Arguments> numberDataProducer(){
        return Stream.of(Arguments.arguments(0, 0),
                Arguments.arguments(1, 0),
                Arguments.arguments(2, 0),
                Arguments.arguments(3, 0),
                Arguments.arguments(4, 0),
                Arguments.arguments(5, 1),
                Arguments.arguments(529, 4),
                Arguments.arguments(20, 1),
                Arguments.arguments(9, 2)
                );
    }
}