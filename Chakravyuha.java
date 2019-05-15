import java.util.*;
class Chakravyuha{
	static int[][] matrixCreation(int n){
		int[][] mat=new int[n][n];		//initialization of a matrix of size n x n. By default it gets initialized to zeros
		int flag=0;
		int p=1;		//value being stored in matrix mat
		int q=0;		//q and r are used being used to reduce the window size(moving inwards into the matrix)
		int r=n-1;
		while(p<=(n*n)){		// n x n matrix has n^2 elements
			
			for(int i=q;i<=r;i++){		//going right
				mat[q][i]=p;
				p++;
			}
			for(int j=q+1;j<=r;j++){		//going down
				mat[j][r]=p;
				p++;
			}
			for(int k=r-1;k>=q;k--){		//going left
				mat[r][k]=p;
				p++;
			}
			for(int l=r-1;l>=q+1;l--){		//going up
				mat[l][q]=p;
				p++;
			}
			q++;r--;		//moving inwards into the matrix
		}
		return mat;
	}
	public static void main(String args[]){
		Scanner in=new Scanner(System.in);
		System.out.println("Enter n(where n x n is the matrix size) :");
		int n=in.nextInt();
		int[][] resultantMatrix=matrixCreation(n);	//Assingning the variable "resultantMatrix" with the value returned by the // method "matrixCreation"
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
				System.out.print(resultantMatrix[i][j]+"\t");
			System.out.println();
		}
	}
}