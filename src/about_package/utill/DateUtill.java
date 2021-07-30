package about_package.utill;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtill {
    private static final String DATE_FORMAT = "dd/MM/yyyy";

    public static String formatDate(Date d) {
        SimpleDateFormat sdf = new SimpleDateFormat(DATE_FORMAT);
        return sdf.format(d);
    }
}
