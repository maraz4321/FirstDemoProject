package util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;

public class Common {
	
	public static String addDateTocurrentDate(String currentDate,int addDate) throws ParseException {

	String oldDate = currentDate;
	SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
	Calendar c = Calendar.getInstance();
	c.setTime(sdf.parse(oldDate));
	c.add(Calendar.DAY_OF_MONTH, addDate);
	String newDate = sdf.format(c.getTime());
	return newDate;
	}
	public static int monthToInteger(String month) {
		
		ArrayList<String> months = new ArrayList<String>(Arrays.asList("Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"));
		return months.indexOf(month)+1;	
	}
	public static String shotMonthToLongMonth(String oldMonth) throws ParseException {
			
			String newMonth;
			SimpleDateFormat sd = new SimpleDateFormat("MMM");
			Date d =sd.parse(oldMonth);
			sd.applyPattern("MMMM");
			newMonth = sd.format(d);
			return newMonth;
		}
	

}
