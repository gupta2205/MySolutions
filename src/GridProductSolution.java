import java.io.*;
import java.util.Scanner;
public class GridProductSolution{
    public static void main(String[] args) {

           Scanner input = new Scanner(System.in);
           System.out.print("Enter the number of rows: ");
           int Rows = input.nextInt();
           System.out.print("Enter the number of columns: ");
           int Columns = input.nextInt();
           int[][] array = new int[Rows][Columns];
           System.out.println("Enter the numbers in array: ");
           for (int i = 0; i < array.length; i++)
           {
               for (int j = 0; j < array[i].length; j++)
                   array[i][j] = input.nextInt();
           }

           int G[][]= array;

//        int G[][] = new int[][]{
//                {8, 2, 22, 97, 38, 15},
//                {49, 49, 99, 40, 17, 81},
//                {81, 49, 31, 73, 55, 79},
//                {52, 70, 95, 23, 4, 60},
//                {22, 31, 16, 71, 51, 67},
//                {24, 47, 32, 60, 99, 3}} ;
//
//      System.out.println("length of row: " + G.length);
//      System.out.println("");

      int i, j, curMax=0, sum = 0 ;
        for(i = 0; i < G.length-2; i++){
            for(j=0; j < G[i].length-2; j++){
                sum = G[i][j]*G[i][j+1]*G[i][j+2];
                if(curMax< sum){
                    curMax = sum ;
                }
                System.out.println("sum of Horizontal line: " +sum );
                System.out.println("Curmax is: " + curMax );
                sum = G[i][j]*G[i+1][j]*G[i+2][j];
                if(curMax< sum){
                    curMax = sum ;
                }
                System.out.println("sum of Horizontal line: " +sum );
                System.out.println("Curmax is: " + curMax );
                sum = G[i][j]*G[i+1][j+1]*G[i+2][j+2];
                if(curMax< sum){
                    curMax = sum ;
                }
                System.out.println("sum of Horizontal line: " +sum );
                System.out.println("Curmax is: " + curMax );
            }
        }
      System.out.println("");
    }
}