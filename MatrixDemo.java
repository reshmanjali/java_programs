//A program to demonstrate returning a matrix from a fnction
import java.util.*;
class MatrixDemo{
	static int[][] matrixCreation(int n){
		int[][] mat=new int[n][n];		//initialization of a matrix of size n x n. By default it gets initialized to zeros
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
				mat[i][j]=5;
		}
		return mat;
	}
	public static void main(String args[]){
		Scanner in=new Scanner(System.in);
		System.out.println("Enter n(n x n is the matrix size) :");
		int n=in.nextInt();
		int[][] resultantMatrix=matrixCreation(n);	//Assingning the variable "resultantMatrix" with the value returned by the // method "matrixCreation"
		for(int i=0;i<n;i++)				//printing the resultant matrix
		{
			for(int j=0;j<n;j++)
				System.out.print(resultantMatrix[i][j]+" ");
			System.out.println();
		}
	}
}