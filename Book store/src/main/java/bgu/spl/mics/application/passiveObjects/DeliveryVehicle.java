package bgu.spl.mics.application.passiveObjects;

/**
 * Passive data-object representing a delivery vehicle of the store.
 * You must not alter any of the given public methods of this class.
 * <p>
 * You may add ONLY private fields and methods to this class.
 */
public class DeliveryVehicle {
	//~~~~~~~~~~~~~~~~~~~fields~~~~~~~~~~~~~~~~~~~~~~~~~
	private int license, speed;
    //~~~~~~~~~~~~~~~~~~~constructor~~~~~~~~~~~~~~~~~~~~~~~~~
	/**
     * Constructor.
     */
	 public DeliveryVehicle(int license, int speed) {
		this.license = license;
		this.speed = speed;
	  }
    //~~~~~~~~~~~~~~~~~~~methods~~~~~~~~~~~~~~~~~~~~~~~~~
	/**
     * Retrieves the license of this delivery vehicle.
     */
	public int getLicense() {
		return license;
	}

	/**
     * Retrieves the speed of this vehicle person.
     * <p>
     * @return Number of ticks needed for 1 Km.
     */
	public int getSpeed() {
		return speed;
	}

	/**
     * Simulates a delivery by sleeping for the amount of time that
     * it takes this vehicle to cover {@code distance} KMs.
     * <p>
     * @param address	The address of the customer.
     * @param distance	The distance from the store to the customer.
     */
	public void deliver(String address, int distance) {
        try {
            Thread.sleep(distance*speed);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
