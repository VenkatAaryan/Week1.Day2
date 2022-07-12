package week1.day2;

import java.util.Arrays;

public class MaxMin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] num = {25,45,1,19,15,9};
		Arrays.sort(num);
		System.out.println("The minimum number"  + num[0]);
		System.out.println("The max number" + num[num.length-1]);
	}

}
