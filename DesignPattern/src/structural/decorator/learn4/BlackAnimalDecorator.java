package structural.decorator.learn4;

public class BlackAnimalDecorator extends AbstractAnimalDecorator{

	public BlackAnimalDecorator(Animal animal) {
		super(animal);
		// TODO Auto-generated constructor stub
	}
	
	public void eat(){
		decoratedAnimal.eat();
		wearBlack();
	}
	private void wearBlack(){
		System.out.println("穿上黑色外套。");
	}

}
