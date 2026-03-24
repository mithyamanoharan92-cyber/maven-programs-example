package superkeywordexample;

public class SuperKeywordChild extends SuperKeywirdExample{

		
		int i =20;
		
		public void superkeyword() {
			System.out.println(i);
			System.out.println(super.i);
		}
		
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SuperKeywordChild superKeywordChild = new SuperKeywordChild();
		superKeywordChild.superkeyword();

	}

}
