package jaseelan;

import java.util.LinkedList;

public class linkedlists {
public static void main(String[] args) {
	LinkedList<String>nums=new LinkedList<String>();
	nums.push("Duck");
	nums.push("Owl");
	nums.push("Parrot");
	nums.push("Falcon");
	nums.push("Goose");
	nums.push("Swan");
	System.out.println(nums);
	System.out.println(nums.peekFirst());
	
	
}
}
