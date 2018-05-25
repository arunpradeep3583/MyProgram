package program;

import java.util.ArrayList;
import java.util.List;

public class praticepgm {
	
	public static void addlist() {
		
		
		List<String> obj = new ArrayList<String>();
		
		obj.add("Arun");
		obj.add("Pradeep");
		System.out.println(obj);
		
		//obj.add(0, "A");
		//System.out.println(obj);
		
		
		obj.remove("A");
		System.out.println(obj);
		obj.remove(1);
		System.out.println(obj);
		obj.add("Pradeep");
		obj.add("Pradeep");
		System.out.println(obj);
		obj.remove("pradeep");
		System.out.println(obj);
		obj.set(2, "pradeep A");
		System.out.println(obj);
		//int pos = obj.indexOf("Pradeep");
		String ab = obj.get(0);
		System.out.println("ab" + ab);
	}
	
	public static void main(String[] args) {
		addlist();
	}

}
