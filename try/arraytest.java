package learn;

import java.util.Arrays;

public class arraytest {
	static int a=90;
	public static void main(String[] args) {
		
		arraytest a2= new arraytest();
		
		int f[][]= {{1,2,3,4,5},{6,7,8,9}};
		for (int row =0;row<f.length;row++)
		{
			System.out.println("array elements are"+ Arrays.toString(f[row]));
		}
		for (int b[] :f)
		{
			System.out.println(Arrays.toString(b));
		}
		arraytest a1= new arraytest();
		System.out.println(a1.a);
		System.out.println(a);
		a1.a=35;
		System.out.println(a);
		System.out.println(a2.a);
		System.out.println(a1.a);
	}
}
