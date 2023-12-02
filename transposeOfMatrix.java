package Array2D;

import java.util.Scanner;

public class transposeOfMatrix {
    static void printMatrix(int arr[][]){
        int n = arr.length;
        for(int i = 0;i < n;i++){
            for(int j = 0;j < n;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void Transpose(int arr[][], int r, int c){
        int ans[][] = new int[c][r];
        for(int i = 0;i < r;i++){
            for(int j = 0;j < c;j++){
                ans[i][j] = arr[j][i];
            }
        }
        printMatrix(ans);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int arr[][] = new int[r][c];
        for(int i = 0;i < r;i++){
            for(int j = 0;j < c;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        printMatrix(arr);
        System.out.println();
        Transpose(arr, r, c);

    }
}
