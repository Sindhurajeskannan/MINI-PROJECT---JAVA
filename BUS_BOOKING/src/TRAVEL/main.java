package TRAVEL;
import java.util.*;
public class main {
	public static void main(String[] args) {
		ArrayList<businfo> buslist = new ArrayList<>();
		ArrayList<passenger> passengerlist = new ArrayList<>();
		
		buslist.add(new businfo(1,true,2,"Royal"));
		buslist.add(new businfo(2,true,60,"JB Connect"));
		buslist.add(new businfo(3,false,55,"SK"));
		buslist.add(new businfo(4,true,50,"GRSS"));
		buslist.add(new businfo(5,true,45,"Bharat"));
		
		for(businfo b:buslist) {
			b.display();
		}
		
		int ch = 1;
		Scanner sc = new Scanner(System.in);
		while(ch==1) {
			System.out.println("Enter 1 to book (or) 2 to exit ");
			ch=sc.nextInt();
			if(ch==1){
				passenger p = new passenger(sc);
				if(p.isavailable(buslist,passengerlist)) {
					System.out.println("Your ticket is confirmed ! Have a safe Journey");
					passengerlist.add(p);
				}
				else {
					System.out.println("Sorry ! the bus is full , Try booking for other bus");
				}
			}
			
		}
	}

}
