import java.util.*;
public class Q2_Practice {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[]arr = new int[n];
        for (int i = 0;i<n; i++){
            arr[i]=in.nextInt();           

        }
        for( int i = 0;i<n;i++){
            System.out.println(arr[i]+" ");
        }
        int max= arr[0];
        for (int i = 0;i<n;i++){
            if (arr[i]>max){
                max = arr[i];
            }
        }
        System.out.println("max="+max);
        int min = arr[0];
        for ( int i = 0;i<n;i++){
            if (min>arr[i]){
                min = arr[i];
            }
        }
        System.out.println("min="+min);
        in.close();
    }
}
