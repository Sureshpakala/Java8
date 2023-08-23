package FunctionalityInterface;

import java.util.Arrays;
import java.util.List;

public class UseClass {
	public static void main(String[] args) {
		Sum s1=(li)-> {
			int max=0;
			for(Integer x:li) {
				if(x>max) {
					max=x;
				}
			}
			return max;
		};
		List<Integer> li=Arrays.asList(25,62,5,256,652,5,65);
		System.out.println(s1.calculation(li));
//		System.out.println("total="+Sum.mul(25, 45,23));
//		Sum c1=new Sum();
//		System.out.println(c1.msg());
		
	}
}
