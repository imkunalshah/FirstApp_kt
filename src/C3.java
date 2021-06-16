import java.util.Scanner;

public class C3 {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        if(sc.hasNextInt()){
            int test_case = sc.nextInt();
            int[] sol = new int[test_case];
            if (test_case <= 100000 && test_case >=1){
                for (int i = 0;i<test_case;i++){
                    if (sc.hasNextInt()) {
                        int no = sc.nextInt();
                        if (no <= 100000 && no>=1){
                            sol[i] = getAns(no);
                        }
                        else{
                            break;
                        }
                    }
                }
                for(int i = 0 ;i < test_case;i++){
                    if (sol[i]!=0){
                        System.out.println(sol[i]);
                    }
                    else{
                        break;
                    }
                }
            }
        }
    }

    private static int getAns(int no) {
        int range_start = 0;
        int range_end = (int) (Math.pow(2,no)-1);
        //System.out.println(range_end);
        //int difference = (range_end-range_start);
        int count = 0;
        int sum = 0;
        for (int i =0;i<range_end;i++){
            if (i == 0){
                count++;
            }
            else {
                sum = sum+no;
                if (sum <= range_end){
                    count++;
                }
            }
        }
        return count;
    }
}
