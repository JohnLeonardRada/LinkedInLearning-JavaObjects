package InheritanceExercises;

import java.util.ArrayList;
import java.util.Random;

public class BetterArrayList extends ArrayList{

	
	
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		Random random = new Random();
		
		arrayList.add(random.nextInt(100));
		arrayList.add(random.nextInt(100));
		arrayList.add(random.nextInt(100));
		
		System.out.println(arrayList);
		System.out.println(arrayList.size());
		arrayList.remove(arrayList.size() - 1);
		System.out.println(arrayList);
		
	}
	
	public Object pop(int index) {
		
		
		return index;
		
	}

	
}
