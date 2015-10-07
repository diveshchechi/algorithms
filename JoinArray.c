// Joins two sorted arrays of size m and n into a new array of size m+n
#include<stdio.h>
int main() {
  
    int a[] = {2,3,4,5,6};
    int b[] = {1,2,3};
    int n = 5;
    int m = 3;
    int c[m+n];
    int l=0,p=0;
    for(int i =0; i< m+n; i++){
         if(a[l] <= b[p]){
             c[i] = a[l];
             l++;
         }else{
             c[i] = b[p];
             p++;
         }
    }
    for(int i = 0; i<n+m; i++){
        printf("%d ",c[i]);
    }
    
    
 
  return 0;
}
    
