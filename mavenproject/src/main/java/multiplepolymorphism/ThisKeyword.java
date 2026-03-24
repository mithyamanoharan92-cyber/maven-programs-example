package multiplepolymorphism;

public class ThisKeyword {
	int a;
	int b;
	public void add(int a,int b) {
		this.a=a;
		this.b=b;
	}
	public void show() {
		this.add(2, 3);
		System.out.println(a);
		System.out.println(b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThisKeyword t=new ThisKeyword();
		t.show();

	}

}
