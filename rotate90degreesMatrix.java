package Array2D;

import java.util.Scanner;

/*Given a square matrix, turn it by 90 degrees in a clockwise 
direction without using any extra space. */
public class rotate90degreesMatrix {
    static void PrintArray(int arr[][]){
        for(int i = 0;i < arr.length;i++){
            for(int j = 0;j < arr.length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static int[][] transposeInPlace(int [][]arr, int r, int c){
        for(int i = 0;i < r;i++){
            for(int j = i;j < c;j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
        return arr;
    }
    public static void reverse(int arr[]){
        int i = 0, j = arr.length - 1;
        while(i < j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
    static void rotate(int arr[][], int n){
        transposeInPlace(arr, n, n);
        for(int i = 0;i < n;i++){
            reverse(arr[i]);
        }
    }
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int r = sc.nextInt();
    int c = sc.nextInt();
    int matrix[][] = new int[r][c];
    for(int i = 0;i < r;i++){
        for(int j = 0;j < c;j++){
            matrix[i][j] = sc.nextInt();
        }
    }
    // int arr[][] = transposeInPlace(matrix, r, c);
    rotate(matrix, r);
    System.out.println("Rotated matrix : ");
    PrintArray(matrix);
    
   } 
}
