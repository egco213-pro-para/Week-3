
import java.util.*;


class exercise3  
{
    public static void printMatrix(String name, int[][] matrix)  
    {
	System.out.println(name);
	for (int i=0; i < matrix.length; i++) 
	{
            for (int j=0; j < matrix[i].length; j++ )  
		System.out.printf("%3d ", matrix[i][j]);
            System.out.printf("\n");
        }
    }

    public static void main(String[] args)  
    {
        int N,m;
        Scanner scan = new Scanner(System.in);
	System.out.print("Enter size of original matrix A = "); N  = scan.nextInt();
        
       
	int[][] A = new int[N][N];
        for (int i=0; i<N; i++)
            for (int j=0; j < N; j++)  A[i][j] = (int)(Math.random() * 9+1);
        
	printMatrix(" ", A);
               
        do
        {System.out.print("Enter size of submatrix A <" +N);
        System.out.print("= ");
        m =scan.nextInt();}while(N<m);
        
        
	int[][] B = new int[N][N];
	for (int i=0; i < B.length; i++)
            for (int j=0; j < B[i].length; j++)
		B[i][j] = A[i][j];                          // transpose
        for (int i=0;i<m;i++)
            for(int j=0;j<m;j++)
                B[i][j] = 0;
        
	printMatrix("Next matrix B \n", B);
        
	int[][] C = new int[N][N];
        for (int i=0;i<m;i++)
            for(int j=0;j<m;j++)
                C[i][j] = A[i][j]; 
        for (int i=m; i < C.length; i++)
            for (int j=m; j < C[i].length; j++)
		C[i][j] = 0;  
        
        
	printMatrix("Next matrix C \n", C);
		
    }
}
