#include<stdio.h>
void reverse(int *a,int n){
    int start = 0, end = n-1,temp = 0;
     
    for(start = 0;start<end;start++ ){
        temp = a[start];
        a[start] = a[end];
        a[end] = temp;
        end--;
        
    }
    for(int i = 0; i<n; i++){
        printf("%d ",a[i]);
    }
    
}

int main() {
  
    int a[] = {5,5,5,5,5,5,6,7,2,5,2,2,1};
    int n = 13;
    //maj(a,n);
    reverse(a,n);
    
    
  return 0;
}
