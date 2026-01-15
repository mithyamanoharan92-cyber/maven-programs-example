package Listmethos;

import java.util.ArrayList;
import java.util.List;

public class ListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> l=new ArrayList<String>();
		l.add("apple");
		l.add("banana");
		l.add("guava");
		l.add("pear");
		System.out.println(l);
		System.out.println(l.get(2));
		l.remove("banana");
		System.out.println(l);
		System.out.println(l.size());
		System.out.println(l.contains("pear"));
		System.out.println(l.indexOf("apple"));
		
		
		
		

	}

}
