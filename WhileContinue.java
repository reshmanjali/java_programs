// This program demonstrates the usage of "continue" in a while loop
// We need to be carefull while using "continue" in a while loop because it may sometimes lead to never-ending program execution

public class WhileContinue{
	public static void main(String a[]){
		int i=1;
		while(i>0){
		System.out.print(i+" ");
		if(i==5){		//when i becomes 5, 
			continue;	//because of "continue", the exec flow goes up to while condition checking
		}
		i++;			// this line is not executd when i becomes 5
		}
	
	}
}

/* In this example, iteration starts from i=1 and continues normally till 5. Thus, 1 2 3 4 5 are printed.
When i becomes 5, the if condition becomes true and as it was written "continue", the flow goes to while condition checking, without executing the incrementation step.
Since 5 is > 0, while condition is true and 5 is printed.
Now again if condition is true as i is 5 and 5 is prited, then because of "continue", the execution flow goes to while condition.
The condition is again true and this goes on persistantly printing 5 without any termination.
 */