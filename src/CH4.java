import java.util.*;
import java.lang.*;
import java.io.*;

class CH4
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        if(sc.hasNextInt()){
            int test_case = sc.nextInt();
            if (test_case <= 100000 && test_case >= 1){
                String[] sol = new String[test_case];
                for (int i = 0;i<test_case ;i++ ){
                    int[] arr = new int[3];
                    for(int j = 0;j<3;j++){
                        if (sc.hasNextInt()){
                            int num = sc.nextInt();
                            if (j == 0){
                                if (num <= 100){//|| num <= 1000000000
                                    arr[0] = num;
                                }
                                else{break;}
                            }
                            else if (j == 1 || j == 2) {
                                if (num <= arr[0]){
                                    arr[j] = num;
                                }
                                else{
                                    break;
                                }
                            }
                        }
                    }
                    if (arr[0] != 0 && arr[1] != 0 && arr[2] != 0){
                        sol[i] = getAns(arr);
                    }
                    else{
                        break;
                    }
                }

                for (int i = 0;i<sol.length ;i++ ){
                    if (sol[i] != null){
                        System.out.println(sol[i]);
                    }
                    else{
                        break;
                    }
                }
            }
        }
    }
    public static String getAns(int[] arr){
        int N = arr[0];
        int X = arr[1];
        int K = arr[2];
        int[] sol_arr = new int[N];
        String sol = "";
        for (int i = 0;i<N+1 ;i++ ){
            if (i == 0){
                sol_arr[i] = N+1;
            }
            else{
                int no = (N+1) - (i*K);
                if (no<0){

                }
                else{
                    sol_arr[i] = no;
                }
            }
        }

        for (int i = 0;i<sol_arr.length ;i++ ){
            int no = sol_arr[i];
            if(no == X){
                sol = "YES";
                break;
            }
            else{
                sol = "NO";
            }
        }
        return sol;
    }
}
