package TRAVEL;
import java.util.*;
import java.text.*;
public class passenger {
	String name;
	int busno;
	Date date;
	passenger(Scanner sc){
		System.out.print("Enter you Name : ");
		name = sc.next();
		System.out.print("Enter the Bus no you need to book :");
		busno = sc.nextInt();
		System.out.print("Enter the date you wanna travel in (dd-mm-yyyy) : ");
		String n = sc.next();
		SimpleDateFormat sdf = new SimpleDateFormat("dd-mm-yyyy");
		
		try {
			date = sdf.parse(n);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
		
		int capacity = 0;
		int occupied = 0;
		
		public boolean isavailable(ArrayList<businfo> buslist,ArrayList<passenger> passengerlist) {
			for(businfo b: buslist) {
				if(b.get_bno()==busno) {
					capacity = b.get_cap();
				}
			}
			for(passenger p : passengerlist) {
				if(p.busno == busno && p.date.equals(date)) {
					occupied++;
				}
			}
			return occupied<capacity;
			
	}
}
