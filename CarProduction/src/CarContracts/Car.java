package CarContracts;

public interface Car {
	int passagers = 0;

	public void start();
	public void stop();
	
	void openDoor();

	void blockWindows();
	
	boolean buildCar();
}
