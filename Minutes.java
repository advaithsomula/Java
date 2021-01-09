import java.util.*;
import java.util.Scanner;
public class Minutes {
	public static void main(String[]args) {
		Scanner s=new  Scanner (System.in);
		System.out.println("Enter the minutes: " );
		int minutes=s.nextInt();
		int minyear=60*24*365;
		double mindays=1440;
		double year= (minutes/minyear);
		double days= (minutes/mindays)%365;	
		System.out.println(minutes+" minutes is approximately "+ year + " years and " + days + "days");
	}

}
