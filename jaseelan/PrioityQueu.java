package jaseelan;

import java.util.PriorityQueue;
import java.util.Queue;

public class PrioityQueu {
	public static void main(String[] args) {
		Queue<Double> queue = new PriorityQueue<Double>();
		queue.offer(3.2);
		queue.offer(2.2);
		queue.offer(3.9);
		queue.offer(3.0);
		queue.offer(4.0);
		while (!queue.isEmpty()) {
			System.out.println(queue.poll());
		}
		System.out.println(queue);
	}
}
 