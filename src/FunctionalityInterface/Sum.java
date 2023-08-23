package FunctionalityInterface;

import java.util.List;

public interface Sum {
	public int calculation(List<Integer> li);
	public static int mul(int a,int b,int c) {
		return a*b*c;
	}
	public default String msg() {
		return "Hello";
	}
}
