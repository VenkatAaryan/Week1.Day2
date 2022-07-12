package week1.day2;

import java.util.Arrays;

public class FindDups {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num = {15,21,25,15,45,21,25,44,46,44};
		int count =0;
		Arrays.sort(num);
		for(int i=0;i<num.length-1;i++)
		{
			if(num[i]==num[i+1]) {
				System.out.println("duplicate value "  +num[i] );
				count++;
			}
		}System.out.println("total count" +count);
	}

}
