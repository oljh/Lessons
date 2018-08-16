package Tests;

public enum TaxiStation {
	MERCEDES(10), TOYOTA(7), VOLVO;
	private int freeCabs;
	TaxiStation(int cabs){
		freeCabs = cabs;
	}
	TaxiStation(){
	}	
	public int getFreeCabs() {
		return freeCabs;		
	}
	
	public void setFreeCabs(int cabs) {
		freeCabs = cabs;
	}
	
	@Override
	public String toString() {
		return String.format("%s : free cabs = %d", name(), freeCabs);
	}
}
