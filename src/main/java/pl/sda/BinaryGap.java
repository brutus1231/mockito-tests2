package pl.sda;

public class BinaryGap {

    int calculate(Integer number) {
        String numberStr = Integer.toString(number, 2);

        for (Character c : numberStr.toCharArray()) {
            if (c.equals('0')) {
                return 1;
            }
        }
        return 0;
    }
}
