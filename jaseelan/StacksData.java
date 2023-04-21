package jaseelan;

import java.util.Stack;

public class StacksData {
	public static void main(String[] args) {
		Stack<String> stack = new Stack<String>();
		System.out.println(stack.isEmpty());
		stack.push("Duck");
		stack.push("Owl");
		stack.push("Parrot");
		stack.push("Falcon");
		stack.push("Goose");
		stack.push("Swan");
		System.out.println(stack.search("Swan"));
		stack.pop();
		System.out.println(stack);
		for (String x : stack) {
			System.out.println(x);
		}
		for(int x=0;x<100;x++)  {
			stack.push("Astro");
		}
		System.out.println(stack);
	}
}
