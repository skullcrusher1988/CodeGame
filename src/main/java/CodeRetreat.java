
public class CodeRetreat {
	
	public static void main(String[] arr) {
		System.out.print("startClass");
		 int M = 10, N = 10;
		 
	        // Intiliazing the grid.
	        int[][] grid = { { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
	            { 0, 0, 0, 1, 1, 0, 0, 0, 0, 0 },
	            { 0, 0, 0, 0, 1, 0, 0, 0, 0, 0 },
	            { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
	            { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
	            { 0, 0, 0, 1, 1, 0, 0, 0, 0, 0 },
	            { 0, 0, 1, 1, 0, 0, 0, 0, 0, 0 },
	            { 0, 0, 0, 0, 0, 1, 0, 0, 0, 0 },
	            { 0, 0, 0, 0, 1, 0, 0, 0, 0, 0 },
	            { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }
	        };
	 
	        // Displaying the grid
	        System.out.println("Original Generation");
	        for (int i = 0; i < M; i++)
	        {
	            for (int j = 0; j < N; j++)
	            {
	                if (grid[i][j] == 0)
	                    System.out.print(".");
	                else
	                    System.out.print("*");
	            }
	            System.out.println();
	        }
	        System.out.println();
	}

}
