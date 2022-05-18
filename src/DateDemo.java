import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateDemo {

	public static void main(String[] args) {
		
		Date d = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("M/d/yyyy");
		System.out.println(sdf.format(d));	
		System.out.println(d.toString());
		
		Calendar Cal =Calendar.getInstance();
		SimpleDateFormat sf = new SimpleDateFormat("M/d/YYYY");
		System.out.println(sf.format(Cal.getTime()));
		System.out.println(sf.format(Cal.getFirstDayOfWeek()));
		
	}

}
