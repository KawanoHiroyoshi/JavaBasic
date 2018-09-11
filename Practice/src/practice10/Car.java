package practice10;


public class Car {
	int serialNo;
	String color;
	int gasoline;
	
	int run() {
		
		if (gasoline == 0) {
			return -1;
		}

		gasoline--;

	
		int distance = (int)(Math.random()*15);
		return distance;
	}
}
