import java.util.*;
public class bubbleSort{
    public static void main(String []args){
        int i,j,counter = 0;
        Scanner chechi = new Scanner(System.in);
        Random dk = new Random();
        int temp;
        int n = 1000;
        int[] arr = new int[n];
        for(i=0;i<n;i++){
            arr[i] = dk.nextInt(50);
        }
        
        System.out.println("The unsorted array is here :");
        for(i=0;i<n;i++){
            System.out.println(arr[i]);
        }
        
        for (i = 0; i<n; i += 1){
            counter++;
            for (j = n-1; j>0 ;j -= 1){
                counter++;
                if(arr[j-1]>arr[j]){
                    temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1]  = temp;
                    counter += 4;
                }
                counter++;
            }
            counter++;
        }
        counter++;
        System.out.println("The sorted array is here :");
        for(i=0;i<n;i++){
            System.out.println(arr[i]);
        }
        System.out.println(counter);
    }
}
