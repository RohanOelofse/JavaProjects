
public class Intersection {
	
	private Street street1;
	private Street street2;
	
	public Intersection() {
		this.street1 = new Street();
		this.street2 = new Street();
	}
	
	public Intersection(String street1Name, String street2Name) {
		this.street1 = new Street(street1Name);
		this.street2 = new Street(street2Name);
		
	}

}
