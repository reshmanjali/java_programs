//Program to print the distinct elements in a list.Given is the list with multiple elements. 
import java.util.*;
public class NonDuplicateElements{
	
	public static List<String> findDistinctElements(List<String> listWithDuplicatesReceived){
		
		Set<String> set=new HashSet<String>(listWithDuplicatesReceived);	
		//Assigning a list to a set removes duplicates as set does not allow duplicates in it
		List<String> result=new ArrayList<String>(set); 
		// Assigning th set elements to list.We can directly print the set here but just making sure that a list is returned (according to method declaration) 
		return result;
	}
	public static void main(String args[]){
		
		Scanner in=new Scanner(System.in);
		List<String> listWithDuplicates=new ArrayList<>();
		System.out.println("Enter no.of elements : ");
		int n=in.nextInt();
		for(int i=0;i<n;i++){		//Reading elements into ArrayList
			listWithDuplicates.add(in.next());
		}
		System.out.println("Given Input list");
		for(String s:listWithDuplicates){		//Display the input provided
			System.out.print(" "+s);
		}
		System.out.println("\nThe resutant list with distinct elements");
		List<String> resultant=findDistinctElements(listWithDuplicates);	//Display the result
		for(String st:resultant){
			System.out.print(" "+st);
		}
	}
}