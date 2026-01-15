package singleInheritance;

public class ChildClass extends ParentClass {
	public void childclassMethod() {
		System.out.println("hello world");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChildClass c=new ChildClass();
		c.childclassMethod();
		c.singleInheritanceMethod();

	}

}
