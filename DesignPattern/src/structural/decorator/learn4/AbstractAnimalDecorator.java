package structural.decorator.learn4;

public abstract class AbstractAnimalDecorator implements Animal{
	
	protected Animal decoratedAnimal;
	public AbstractAnimalDecorator(Animal animal){
		this.decoratedAnimal = animal;
	}
	
	/*public void eat(){
		//decoratedAnimal.eat();
	}*/

}
