import java.util.*;

//import javax.sql.rowset.spi.SyncResolver;
public class secondQ {
    static void columnWiseSorting(int arr[][], int colmn) {
        Arrays.sort(arr, new Comparator<int[]>(){
            public int compare(int[] frst, int[] scnd) {
                if(frst[colmn-1]> scnd[colmn-1]) {
                    return 1;
                }
                else return -1;
            }
        });
        for(int i =0;i<arr.length;i++){
            for(int j =0;j<arr[i].length;j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
        public static void main(String[] args) {
            int arr[] [] = new int [] [] {
                {12, 14, 4},
                {14, 23, 20},
                {28, 25, 8},
                {11, 5, 1} };
                columnWiseSorting(arr,1);
            }
        }
        
    
    

