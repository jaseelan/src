package jaseelan;

import java.util.LinkedList;
import java.util.Queue;
//linear data sturcture
public class queuesss {
	public static void main(String[] args) {
		Queue<String> que = new LinkedList<String>();
		System.out.println(que.isEmpty());
		System.out.println(que.size());
		System.out.println(que.contains("Meesalai"));
		que.offer("Meesalai");
		que.offer("jaffna");
		que.offer("kodikamam");
		que.offer("piramanthanaru");
		que.offer("Kilinochchi");
		que.offer("pulijampokkanai");
		System.out.println(que);
		que.poll();
		que.poll();
		System.out.println(que);
	}
}
