package Tests;

public class Abonent {
	private  long id;
	private String name;
	private String tariffPlan;
	private PhoneNumber phoneNumber;
	public Abonent (long id, String name) {
		this.id = id;
		this.name = name;
	};
	
	private class PhoneNumber {
		private int countryCode;
		private int netCode;
		private int number;
		public void setCountryCode(int countryCode) {
			this.countryCode = countryCode;
		};
		
	}
}
