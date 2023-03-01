
public class TrafficLight {
	
	private boolean red;
	private boolean yellow;
	private boolean green;
	
	public TrafficLight() {
		this.red = true;
		this.yellow = false;
		this.green = false;
	}

	/**
	 * @param red the red to set
	 */
	public void redOn() {
		this.yellow = false;
		this.green = false;
		this.red = true;
	}
	
	/**
	 * @param yellow the yellow to set
	 */
	public void yellowOn() {
		this.red = false;
		this.green = false;
		this.yellow = true;
	}
	
	/**
	 * @param green the green to set
	 */
	public void greenOn() {
		this.red = false;
		this.yellow = false;
		this.green = true;
	}
	
	/**
	 * @return the red
	 */
	public boolean isRed() {
		return red;
	}

	/**
	 * @return the yellow
	 */
	public boolean isYellow() {
		return yellow;
	}

	/**
	 * @return the green
	 */
	public boolean isGreen() {
		return green;
	}

	

}
