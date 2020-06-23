//program to find painter's partition problem
public class Solution_Painter's_Problem {
  public boolean isValid(int nop, int[] arr, long mid)
{
int n = arr.length;
int painter = 1;
long painting = 0;

    for(int i=0; i<n; i++)
    {
        if(arr[i] > mid )   return false;
        
        if(arr[i] + painting > mid)
        {
            ++painter;
            painting = arr[i];
            
            if(painter > nop)
                return false;
        }
        else
        {
            painting += arr[i];
        }
    }
    
    return true;
}

public int paint(int nop, int uot, int[] arr) {
    
    int n = arr.length;
    long low = 0, high = 0;
    
    for(int i=0; i<n; i++)
    {
        high = high % 10000003 + arr[i] % 10000003;
    }
    high = high * uot;
    long ans = high % 10000003;
    
    while(low <= high)
    {
        long mid = low + (high - low)/2;
        
        if(isValid(nop, arr, mid))
        {
            ans = mid % 10000003;
            high = mid - 1;
        }
        else
        {
            low = mid + 1;
        }
    }
    
    return (int)((ans * uot) % 10000003);
}
}

