import java.util.*;
public class heapSort{
    public static int counter;
     public static void heapsort(int [] A){
         buildHeap(A);
         for (int i = A.length - 1 ; i >= 1 ; i--){
             int temp = A[0];
             A[0] =  A[i];
             A[i] = temp;
             heapify(A,0,i);
             
         }
     }
     public static void heapify(int [] A,int i,int n){
         int temp;
         int l = 2*i + 1;
         int r = 2*i + 2;
         int largest;
         if (l<n && A[l] > A[i]){
             largest = l;
             counter += 2;
         }
         else{
             largest = i;
             counter++;
         }
         if(r < n && A[r] > A[largest]){
             largest = r;
             counter++;
         }
         if (largest != i){
             temp = A[i];
             A[i] = A[largest];
             A[largest] = temp;
             heapify(A,largest,n);
             counter += 5;
         }
         counter += 7;
     }
     
     public static void buildHeap(int[] A){
         //int heapSize = A.length;
         int i;
         for (i = (A.length )/2 ; i>=0; i--){
             heapify(A,i,A.length);
             counter += 2;
         }
         counter+=2;
     }
     
     public static void main(String []args){
        System.out.println("chechi");
        int n = 8;
        int i;
        Random dk = new Random();
        int[] arr = new int[n]; 

        for( i=0;i<n;i++){
                arr[i] = dk.nextInt(1000);
            }
      
        for(i = 0; i<n ;i++){
       System.out.println(arr[i]);
        }
        heapsort(arr);
        System.out.println("chechi");
        for(i = 0; i<n ;i++){
            System.out.println(arr[i]);
             }
    
    }
}
