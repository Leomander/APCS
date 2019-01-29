package unit.six.e1;

import java.util.ArrayList;

public class Stars {
	
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("A");
		list.add("B");
		list.add("C");
		System.out.println(list.toString());
		
		addStars(list);
		System.out.println(list.toString());
		
		removeStars(list);
		System.out.println(list.toString());
	}
	
	public static void addStars(ArrayList<String> l) {
		int size = l.size()*2;
		for (int i = 1; i < size; i+=2) {
			l.add(i, "*");
		}
	}
	
	public static void removeStars(ArrayList<String> l) {
		for (int i = 0; i < l.size(); i++) {
			if (l.get(i).equals("*")) {
				l.remove(i);
			}
		}
	}
	
}
