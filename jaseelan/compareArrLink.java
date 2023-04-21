package jaseelan;

import java.util.ArrayList;
import java.util.LinkedList;

public class compareArrLink {
	public static void main(String[] args) {
		LinkedList<Integer> link = new LinkedList<Integer>();
		ArrayList<Integer> arr = new ArrayList<Integer>();
		long startTime;
		long endTime;
		long elapsedTime;
		for (int x = 0; x < 10000; x++) {
			link.add(x);
			arr.add(x);
		}
		startTime=System.nanoTime();
		
		endTime=System.nanoTime();
		elapsedTime=endTime-startTime;
		
		System.out.println("linklist:\t"+elapsedTime+"ns");

	}
}
