//There are n stairs, a person standing at the bottom wants to reach the top. The person can climb either 1 stair or 2 stairs at a time. 
//Count the number of ways, the person can reach the top.

import java.util.*;
class StairCaseJump{
	
	public static void main(String args[]){
		Scanner in=new Scanner(System.in);
		System.out.println("Enter no. of steps : ");
		int n=in.nextInt();
		int res=num_ways(n);
		System.out.println("No. of possible ways : "+res);
	}
	static int num_ways(int n){
		if(n==0||n==1)
			return 1;
		else
			return num_ways(n-1)+num_ways(n-2);
	}
}
