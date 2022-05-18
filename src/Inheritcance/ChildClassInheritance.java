package Inheritcance;

public class ChildClassInheritance extends ParentClass{
	
	int i=10;

	public static void main(String[] args) {
		
		ChildClassInheritance aa = new ChildClassInheritance();
		aa.brakes();
		aa.car();
		aa.color();
		
		System.out.println(aa.i);
		
		
		ParentClass bb = new ChildClassInheritance();
		System.out.println(bb.i);
	}

}
