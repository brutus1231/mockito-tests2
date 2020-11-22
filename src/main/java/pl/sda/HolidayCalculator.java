package pl.sda;

import java.util.Date;

public class HolidayCalculator {

    private final Calculator calculator;

    public HolidayCalculator(Calculator calculator) {
        this.calculator = calculator;
    }

    public boolean check(Date date) {

        Date daysAdd = calculator.add(date, 3);
        return false;
    }
}
