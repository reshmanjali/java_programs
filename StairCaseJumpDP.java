//There are n stairs, a person standing at the bottom wants to reach the top. The person can climb either 1 stair or 2 stairs at a time. Count the number of ways, the person can reach the top.
//with dynamic programming to minimize recomputation
import java.util.*;
class StairCaseJumpDP{
	
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
		int nums[]=new int[n+1];
		nums[0]=nums[1]=1;
		for(int i=2;i<n+1;i++)		//we are computing and storing all the previos values in the array "nums"
			nums[i]=nums[i-1]+nums[i-2];
		return nums[n];
	}
}