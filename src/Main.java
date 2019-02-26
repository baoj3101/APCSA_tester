import java.util.List;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ListDonwRunner();	        // test list down
	}


	public static void ListDonwRunner () {
		System.out.println("ListDown Test:");
		List<Integer> ray = new ArrayList<Integer>();
		ray.add(10);
		System.out.println(ray);
		System.out.println(ListDown.go(ray));		
		ray.add(9);
		ray.add(8);
		ray.add(7);
		System.out.println(ray);
		System.out.println(ListDown.go(ray));
		ray.add(13);
		ray.add(14);
		System.out.println(ray);
		System.out.println(ListDown.go(ray));
	}
}
