import CarContracts.Car;

public class gerecicsExample<T extends Car> {

	public T item;

	public T getItem() {
		return item;
	}

	public void setItem(T newItem) {
		item = newItem;
	}
	
	public gerecicsExample(Car CarToProduce) {
		
	}
}