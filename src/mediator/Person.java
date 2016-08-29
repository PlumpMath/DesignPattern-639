package mediator;

public abstract class Person {
	protected String name;
	protected Mediator mediator;
	public Person(String nameString ,Mediator mediator){
		this.name = nameString;
		this.mediator = mediator;
	}
}
