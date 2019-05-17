/*An array with elements 1 or 2 or 3 is given as input, each representing an appliance. 
1 represents mobiles.
2 represents computers.
3 represents tabs. Find the count of each appliance*/
import java.util.*;
public class FindingCount{
	
	static void findEachApplianceCount(int[] inputApplianceArray){
		int mobilesCount=0,computersCount=0,tabsCount=0;
		for(int i=0;i<inputApplianceArray.length;i++){		//traversing the array to find the count of each appliance
			if(inputApplianceArray[i]==1) mobilesCount++;
			else if(inputApplianceArray[i]==2) computersCount++;
			else if(inputApplianceArray[i]==3) tabsCount++;
		}
		System.out.println("No. of Mobiles : "+mobilesCount);
		System.out.println("No. of Computers : "+computersCount);
		System.out.println("No. of Tabs : "+tabsCount);
		
	}
	public static void main(String args[]){
		Scanner in=new Scanner(System.in);
		System.out.print("Enter total no. of appliance : ");
		int n=in.nextInt();
		int appliancesArray[]=new int[n];
		System.out.println("Enter the applianceArray elements : ");
		for(int i=0;i<n;i++){
			appliancesArray[i]=in.nextInt();
		}
		findEachApplianceCount(appliancesArray);
	}
}