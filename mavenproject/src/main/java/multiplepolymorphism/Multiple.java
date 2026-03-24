package multiplepolymorphism;

public class  Multiple implements Parent,Child{
	public void multiple() {
		System.out.println("haii");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Multiple m =new Multiple();
		m.multiple();
		m.display();
		m.show();

	}
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("welcome");
		
	}
	@Override
	public void show() {
		// TODO Auto-generated method stub
		
		System.out.println("hello world");
		
	}

}
