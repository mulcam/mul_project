package ch21;

public class Main {

	public static void main(String[] args) {
		
		FrultBox<Orange> f1 = new FrultBox<>();
		f1.setFrult(new Orange(10));
		Orange o = f1.getFrult();
		System.out.println(o.toString());
		
		FrultBox<Apple> f2 = new FrultBox<>();
		f2.setFrult(new Apple(20));
		Apple a = f2.getFrult();
		System.out.println(a.toString());
		
		FrultBox<Inter> f3 = new FrultBox<>();
		f3.setFrult(new Text());
		Text t= (Text) f3.getFrult();
		t.action();
		
		Mix<Orange, Apple> m = new Mix<>();
		m.setItem(new Orange(10));
		m.setItem2(new Apple(20));
		
	}

}
