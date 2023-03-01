
public class Street {
	
	private String name;
	private TrafficLight light1;
	private TrafficLight light2;
	
	public Street() {
		this.name = "unknown";
		this.light1 = new TrafficLight();
		this.light2 = new TrafficLight();
		
	}
	
	public Street(String name) {
		this();
		this.name = name;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 * @throws Exception 
	 */
	public void setName(String name) throws Exception {
		
		name = name.trim();
		
		if (name.isEmpty()){
			
			throw new Exception("Name can not be empty");
		}
		this.name = name;
	}

	public void setRedOn() {
		light1.redOn();
		light2.redOn();
	}
	
	public void setYellowOn() {
		light1.yellowOn();
		light2.yellowOn();
	}
	
	public void setGreen() {
		light1.greenOn();
		light2.greenOn();
	}

}
