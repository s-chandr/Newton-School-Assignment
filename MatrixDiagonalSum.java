import java.io.Console;
import java.util.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class MatrixDiagonalSum{
    
    public static void main(String[] args) throws IOException{
        System.out.println("Enter the Size N of the Matrix");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(br.readLine());
        int Matrix[][] = new int[N][N];
        for(int i = 0; i < N; i++){
            for(int j = 0; j < N;j++){
                Matrix[i][j] = sc.nextInt();
            }
        }
        int PDsum=0,SDsum=0;
        for(int i = 0,j=0; i < N; i++,j++){
            PDsum+=Matrix[i][j];
            SDsum+=Matrix[N-i-1][j];
        }
        
        System.out.printf("Primary Diagonal Sum: %d\nSecondary Diagonal Sum: %d\nTotal Sum: %d",PDsum,SDsum,PDsum+SDsum);
        //The Total Sum has center element included twice 
        //to remove subtract Matrix[N/2][N/2] from totalsum
        
    }
}