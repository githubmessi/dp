package structural.decorator.learn4;

public class DecoratorPatternDemo {

	public static void main(String[] args) {
		Cat cat = new Cat();
		cat.eat();
		Cat cat2 = new Cat();
		cat2.eat();
		System.out.println(cat);
		System.out.println(cat2);
		System.out.println("==");
		BlackAnimalDecorator blackCat = new BlackAnimalDecorator(cat);
		Animal blackDog = new BlackAnimalDecorator(new Dog());
		blackCat.eat();
		blackDog.eat();
	}
}
