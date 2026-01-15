package multipleinheritance;

public class Child implements Father,Mother {
	public void fatherProperty() {
		System.out.println("father sings well");
	}
	public void motherProperty() {
		System.out.println("mother dace well");
		
	}
	public void childProperty() {
		System.out.println("he swim well");
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child c=new Child();
		c.fatherProperty();
		c.motherProperty();
		c.childProperty();

	}
	


}
