//How do you print a date in specific format in Java?

import java.text.SimpleDateFormat;
import java.util.Date;

class PrintDateInSpecificFormat {
    public static void main(String[] args) {
        String pattern = "dd-MM-yyyy";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);

        String date = simpleDateFormat.format(new Date());
        System.out.println(date);
    }
}
