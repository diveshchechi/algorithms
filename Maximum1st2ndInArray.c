#include <stdio.h>

int main() {
    
    int a[] = {1,2,1,1,1};
    int i = 0;
    int n = 5;
    
    for( i=0;i<n;i++){
        if(a[0] > a[i]){
            a[0] = a[i];
        }
        if(i>=1 && a[1] > a[i] && a[0] != a[i]){
            a[1] = a[i];
        }
    }
    
    for( i=0;i<2;i++){
        printf("%d\n",a[i]);
    }
    
    
	//code
	return 0;
}
