package hafta7labb;

public class Employee {
	protected String Adi,Soyadi,Tc;
	public Employee(String adi, String soyadi, String tc) {
		super();
		Adi = adi;
		Soyadi = soyadi;
		Tc = tc;
	}
	public void write() {
		System.out.println("isim:"+Adi+"\n"+"so isim:"+Soyadi+"\n"+"tc kimlik no:"+Tc);
	}
	
}



	

