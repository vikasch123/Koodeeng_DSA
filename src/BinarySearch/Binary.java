import java.util.*;
class Binary
{
    static public int binSrch(int[] array,int target,int lo,int hi)
    {
        int mid;
        if(lo<hi)
        {
              mid=lo+(hi-lo)/2;
        }
        else
        return -1;

        if(array[mid]==target)
        return mid;


        if(target>array[mid])
        return binSrch(array, target, mid+1, hi);

        return binSrch(array, target, lo, mid-1);
    }

   static public int binarySearch(int[] array, int target)
    {
        return binSrch(array, target, 0, array.length-1);
    }


    public static void main(String[] args) {
        int [] array={12,13,45,67,98,101};
        System.out.println(binarySearch(array, 98));

    }
}