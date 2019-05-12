import java.util.*;
class MaxSeq{
	public static int findingIndex(int n,int[] ipArray){	//finds the index from where the 
	//longest increasing seq of nums is present
		int index=0;int len=1;			//variables for storing the results
		for(int i=1;i<n;i++){
			
			if(ipArray[i]>ipArray[i-1]){
				int k=i;int l1=1;		//for assigning to index and len respectively
				while((i<n) && (ipArray[i]>ipArray[i-1])){
					l1++;
					i++;	
				}
				i--;		//to undo the value of i when the while condition fails. 
				//I guess we can optimize here(I am checking the if condition again when a new loop starts)
				if(l1>len){
					len=l1;
					index=k-1;
				}
			}
		}
		System.out.print("From index : "+index+"  "+"\nlength of longest increasing seq : "+len);
		return len;
	}
	public static void main(String args[]){
		Scanner in=new Scanner(System.in);
		System.out.println("Enter size : ");
		int n=in.nextInt();
		int[] ip=new int[n];
		System.out.println("Enter numbers : ");
		for(int i=0;i<n;i++)
			ip[i]=in.nextInt();
		int answer=findingIndex(n,ip);
	}
}