import java.io.*;
import java.util.*;

 class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int iter1 = 0;
        int iter2 = 0;
        int k=0;
        int totalLength = nums1.length + nums2.length;
        int[] arr = new int[totalLength];
        
        if(nums1.length == 0 && nums2.length == 0)
        {
            return 0;
        }
        if(nums1.length == 0)
        {
            int mid = nums2.length/2;
            return arr[mid];
        }
        if(nums2.length == 0)
        {
            int mid = nums1.length/2;
            return arr[mid];
        }
        while(iter1 < nums1.length && iter2 < nums2.length)
        {
            if(nums1[iter1] <= nums2[iter2])
            {
                arr[k] = nums1[iter1];
                iter1++;
                k++;
            }
            else
        {
            arr[k] = nums2[iter2];
            k++;
            iter2++;
        }
        }
        
        while(iter1<nums1.length && k<totalLength)
        {
          arr[k] = nums1[iter1];
          iter1++;
          k++;
        }
        while(iter2<nums2.length && k<totalLength)
        {
          arr[k] = nums2[iter2];
          iter2++;
          k++;  
        }
        int mid = (arr.length-1)/2;
      double med =0.0;
      if((arr.length)%2 != 0)
      {
         med = arr[mid];
      }
      else
      med = (arr[mid] + arr[mid+1])/2;
      return med;
    }
    public static void main(String[] args)
    {
    Solution s = new Solution();
    int[] a = new int[]{1,3};
    int[] b = new int[]{2,4};
    System.out.println(s.findMedianSortedArrays(a,b));
    }
}
