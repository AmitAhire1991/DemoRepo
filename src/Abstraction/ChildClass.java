package Abstraction;

public class ChildClass extends AbstractionDemo {

	public static void main(String[] args) {
		
		ChildClass child = new ChildClass();
		child.Engine();
		child.color();
		child.safety();
		

	}

	@Override
	public void color() {
		System.out.println("Color is Blacck");
		
	}

}
