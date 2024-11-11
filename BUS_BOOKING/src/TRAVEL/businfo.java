package TRAVEL;

public class businfo {
	
	private int bno;
	private boolean ac;
	private int cap;
	private String bname;
	
	businfo(int a,boolean b,int c,String d){
		this.bno = a;
		this.ac = b;
		this.cap = c;
		this.bname = d;
	}
	public int get_bno() {
		return bno;
	}
	public boolean get_isac() {
		return ac;
	}
	public int get_cap() {
		return cap;
	}
	public String get_bname() {
		return bname;
	}
	public void display() {
		System.out.println("**********************");
		System.out.println("Bus Number :"+" "+bno);
		System.out.println("Bus Name :"+" "+bname);
		System.out.println("Bus is AC ??"+" "+ac);
	}
	
}
