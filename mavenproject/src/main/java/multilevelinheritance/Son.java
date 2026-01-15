package multilevelinheritance;

public class Son extends Father{
	public void sonExample() {
		System.out.println("seenu");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Son son = new Son();
		son.fatherExample();
		son.grandfatherExample();
		son.sonExample();
		

	}

}
