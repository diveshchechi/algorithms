// finds the candidate element for majority now you can count the occurences of it. If greater than n>2 then majority
#include <stdio.h>

int main() {
  
    int a[] = {5,5,5,5,5,5,6,7,2,5,2,2};
    
    int n = 12,count = 0, majority = 0;
    for (int i = 0; i<n ; i++){
        if(count == 0 ){
            majority = a[i];
            count++;
        }else{
        if (a[i] == majority ){
            count++;  
        }else{count--;}}
        
    
    printf("%d %d",majority,count);
    
  return 0;
}
