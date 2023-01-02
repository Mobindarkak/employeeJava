package hafta7labb;

public class HourlyEmployee extends Employee{
	protected int Hour;
	protected int wage;
	public HourlyEmployee( String Adi, String Soyadi,String Tc,int hour, int wage) {
		super(Adi,Soyadi,Tc);
		Hour = hour;
		this.wage = wage;
	}
	public int getHour() {
		return Hour;
	}
	public void setHour(int hour) {
		Hour = hour;
	}
	public int getWage() {
		return wage;
	}
	public void setWage(int wage) {
		this.wage = wage;
	}
	public void write( ) {
		super.write();
		System.out.println("kazandigi maas:"+" "+Hour*wage+"$");
	}

}
