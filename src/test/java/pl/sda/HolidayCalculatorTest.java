package pl.sda;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class HolidayCalculatorTest {

    @Mock
    private Calculator calculator;



    @Test
    public void shouldCheckIfDayIsHoliday(){
        //given
        HolidayCalculator holidayCalculator = new HolidayCalculator(calculator);
        Date today = new Date();
        //when
        Mockito.when(calculator.add(today, 3)).thenReturn(today);
        boolean checkResult = holidayCalculator.check(today);

        //then
        Assertions.assertEquals(checkResult, true);
    }

}