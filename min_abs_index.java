//minimum absolute difference index
#include <stdio.h>
#include <stdlib.h>
#include <limits.h>

int main()
{
    int N = 0;
    scanf("%d", &N);
    int array[50];
    
    for(int i = 0; i < N; i++) {
        scanf("%d", &array[i]);
    }
    
    unsigned int minDiff = UINT_MAX, index = -1;
    
    for(int i = 0; i < N; i++) {
        int leftSum = 0;
        for(int j = 0; j <= i; j++) {
            leftSum += array[j];
        }
        
        int rightSum = 0;
        for(int j = i + 1; j < N; j++) {
            rightSum += array[j];
        }
        
        if(abs(leftSum - rightSum) < minDiff) {
            minDiff = abs(leftSum - rightSum);
            index = i;
        }
    }
    
    printf("%d", index);
}