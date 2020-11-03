import java.util.Scanner;
 

public class SumOfElementsBelowDiagonal {
 
    public static void main(String...args) {
           
           Scanner scanner = new Scanner(System.in);
           System.out.print("Enter number of rows/columns in matrix : ");    //rows and columns in matrix must be same.
           int rows = scanner.nextInt();
           int columns=rows;
           int[][] matrix = new int[rows][rows];
           
           System.out.println("Enter the elements in matrix :");
           for (int i = 0; i < rows; i++) {
                  for (int j = 0; j < columns; j++) {
                        matrix[i][j] = scanner.nextInt();
                  }
           }
           
           //Logic to calculate sum of elements below diagonal.
           int sum=0;
           for (int i = 1; i < rows; i++) {
                  for (int j=i-1 ; j>=0 ; j--) {
                        sum= sum + matrix[i][j];
                  }
                  
           }
 
           System.out.println("\nMatrix is : ");
           for (int i = 0; i < rows; i++) {
                  for (int j = 0; j < columns; j++) {
                        System.out.print(matrix[i][j] + " ");
                  }
                  System.out.println();
           }
 
           System.out.println("sum of elements below diagonal is: "+sum);
 
    }
}
