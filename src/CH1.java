import java.util.*;
import java.lang.*;

class Codechef
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int a_pt = 0;
        int b_pt = 0;
        if(sc.hasNextLine()){
            int t_case = Integer.parseInt(sc.nextLine());
            HashMap<Integer,String[]> map = new HashMap<>(t_case);
            for(int i = 0;i<t_case;i++){
                if(sc.hasNextLine()){
                    String inp = sc.nextLine();
                    String[] inp_arr = inp.split("\\s");
                    map.put(i,inp_arr);
                    int no_of_str = Integer.parseInt(inp_arr[0]);
                    for(int j = 0 ; j<=no_of_str;j++){
                        if(sc.hasNextLine()){
                            String str = sc.nextLine().toUpperCase();
                            if(str.contains("E")||str.contains("Q")||str.contains("U")||str.contains("I")||str.contains("N")||str.contains("O")||str.contains("X")){
                                a_pt++;
                            }
                            else{
                                b_pt++;
                            }
                        }
                    }
                }
            }
        }

        if(a_pt>b_pt){
            System.out.println("SARTHAK");
        }
        else if(b_pt>a_pt){
            System.out.println("ANURADHA");
        }
        else{
            System.out.println("DRAW");
        }
    }
}
