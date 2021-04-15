package country;

/**
 * 
 * @author Yarden Hovav, Sharon Vazana
 *
 */
public enum RamzorColor {
	GREEN(0.4),		// up to
	YELLOW(0.6),	// up to
	ORANGE(0.8),	// up to
	RED(1.0);		// up to
	
	/**
	 * constructor
	 * 
	 * @param value - double type input
	 */
	private RamzorColor(double value) {
		this.value = value;
	}
	
	/**
	 * get method
	 * 
	 * @return value of the RamzorColor parameter in type double
	 */
	public double getValue() {
        return this.value;
    }
	
	/**
	 * converts double to RamzorColor
	 * 
	 * @param d - double input
	 * @return corresponding RamzorColor for the double input
	 */
	public RamzorColor doubleToRamzorColor(double d) {
		if( d <= GREEN.getValue())
			return GREEN;
		if( d <= YELLOW.getValue())
			return YELLOW;
		if( d <= ORANGE.getValue())
			return ORANGE;
		else
			return RED;
	}
	
	private final double value; // value of the parameters
}
