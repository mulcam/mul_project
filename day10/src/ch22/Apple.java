package ch22;

public class Apple {
	private int weight;

	public Apple() {
	}

	public Apple(int weight) {
		this.weight = weight;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "Apple [weight=" + weight + "]";
	}
	
}
