
import java.util.Iterator;
import java.util.Scanner;

public class Strng {
	public static void main(String[] args) {
		String s1 = "madhes is smart guy";
		String[] split = s1.split(" ");
		System.out.println(split[0]);
		String substring = s1.substring(0, 7);
		System.out.println(substring);
		Scanner sc = new Scanner(s1);
		String next = sc.next();
		System.out.println(next);
		for (int i = 0; i < split.length; i++) {
			System.out.println(split[i]);
		}
		

	}

}


