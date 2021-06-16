import java.util.*;
import java.lang.*;
import java.io.*;

class CH2
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        if(sc.hasNextInt()){
            int test_case = sc.nextInt();
            int[] sol = new int[test_case];
            for (int i = 0;i<test_case ;i++ ){
                int[] arr = new int[3];
                for(int j = 0;j<3;j++){
                    if (sc.hasNextInt()){
                        arr[j] = sc.nextInt();
                    }
                }
                sol[i] = getSugar(arr);
            }

            for (int i = 0;i<sol.length ;i++ ){
                System.out.println(sol[i]);
            }
        }
    }

    public static int getSugar(int[] arr){
        int X = arr[0];
        int A = arr[1];
        int B = arr[2];
        int sol = 0;
        int final_sol = 0;
        sol = A + ((100-X)*B);
        final_sol = sol * 10;
        return final_sol;
    }
}
