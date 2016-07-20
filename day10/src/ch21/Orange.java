package ch21;

public class Orange {
	private int sugar;

	public Orange() {
	}

	public Orange(int sugar) {
		this.sugar = sugar;
	}

	public int getSugar() {
		return sugar;
	}

	public void setSugar(int sugar) {
		this.sugar = sugar;
	}

	@Override
	public String toString() {
		return "Orange [sugar=" + sugar + "]";
	}
	
}
