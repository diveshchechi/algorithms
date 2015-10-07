#include<stdio.h>
void reverse(int arr[], int start, int end)
{
   int temp;
   if(start >= end)
     return;
   temp = arr[start];   
   arr[start] = arr[end];
   arr[end] = temp;
   rvereseArray(arr, start+1, end-1);   
}  
int main() {
  
    int a[] = {5,5,5,5,5,5,6,7,2,5,2,2,1};
    int n = 13;
    //maj(a,n);
    reverse(a,0,n);
    
    
  return 0;
}
