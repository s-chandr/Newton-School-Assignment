import java.io.Console;
import java.util.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class PrintEven{
    static void receven(int n){
        if(n==0)
            return ;
        if(n%2==0)
            {receven(n-2);
                System.out.printf("%d ",n);
            }

        else
            {receven(n-1);
                //System.out.printf("%d ",n-1);
            }
        
    }
    public static void main(String[] args) throws IOException{
        System.out.println("Enter the number in console");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(br.readLine());
        receven(number);
    }
}