package unit.seven.e1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> array = null;
		
		try {
			array = parseFile("./src/unit/seven/e1/SeqSearch");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		System.out.println("Appearances of 7: "+indexesOf(7,array));
		System.out.println("Appearances of 9: "+indexesOf(9,array));
		System.out.println("Appearances of 45: "+indexesOf(45,array));
		
	}
	
	public static int indexesOf(int n, ArrayList<Integer> array) {
		
		int cnt = 0;
		
		for (int i = 0; i < array.size(); i++) {
			if (array.get(i) == n) cnt++;
		}
		
		return cnt;
		
	}
	
	public static ArrayList<Integer> parseFile(String path) throws FileNotFoundException {
		
		Scanner f = new Scanner(new File(path));
		
		ArrayList<Integer> array = new ArrayList<Integer>();
		
		while (f.hasNextInt()) {
			array.add(f.nextInt());
		}
		f.close();
		
		return array;		
		
	}
	
}
