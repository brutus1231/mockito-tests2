package pl.sda;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class HolidayCalculatorTest {

    @Mock
    private Calculator calculator;

    private HolidayCalculator holidayCalculator = new HolidayCalculator(calculator);

    @Test
    public void shouldCheckIfDayIsHoliday(){
        //given
        //then
        boolean checkResult = holidayCalculator.check(new Date());
        //when

        Assertions.assertEquals(checkResult, true);
    }

}