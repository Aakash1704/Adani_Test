import java.util.*;
 public class First_Question {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int [][] marks = new int[r][c];
        Random randint = new Random();
        for(int i =0;i<r;i++) {
            for(int j =0;j<=c; j ++){
                marks[i]
[j]=randint.nextInt(100);            
        }

    }
    System.out.println(Arrays.deepToString(marks));
    sc.close();
 }
 }