package oct18th;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo {

	public static void main(String[] args) {
		
		
		//Date date=new Date();
		
		//System.out.println(date);
		
		SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

		String date=simpleDateFormat.format(new Date());
		
		System.out.println(date);
		
		date=date.replace(":", "-");
		
		System.out.println(date);
	}

}
