import java.io.*;
import java.util.*;

public class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
       
       
       int m  = nums1.length;
       int n = nums2.length;
       
       
       double median = 0.0;
       if(m == 0 && n == 0)
       return median;
       
       if(m == 1 && n == 1)
       {
        median = (nums1[0] + nums2[0])/2;
        return median;
       }
       
       if(m == 0 && n!=0)
       {
           int medianIndex = n/2;
           if(n%2 == 0)
           
           median = (double)(nums2[medianIndex]+nums2[medianIndex+1])/2;
           
           else median = nums2[medianIndex];
           
           return median;
           
       }
       
       else if(n == 0 && m!=0)
       {
           int medianIndex = m/2;
           if(m%2==0)
           
            median = (nums1[medianIndex]+nums1[medianIndex+1])/2.0;
           
           else median = nums1[medianIndex];
           
           return median;
           
       }
       
       //double median1 = (m%2 != 0)?nums1[m/2]:(nums1[m/2]+nums1[m/2+1])/2.0;
       //double median2 = (n%2 != 0)?nums2[n/2]:(nums2[n/2]+nums2[n/2+1])/2.0;
       
       int start1 = 0;
       int end1 = m-1;
       int start2 = 0;
       int end2 =  n-1;
       while(start1 <= end1 && start2 <= end2)
       {
         
         int mid1 = start1 + (end1-start1)/2;
         int mid2 = start2 + (end2-start2)/2;
         
         double median1 = nums1[mid1];
         double median2 = nums2[mid2];
         
         if(median1<median2)
         {
             start1 = mid1;
             end2 = mid2;
         }
         
         {
             start2 = mid2;
             end1 = mid1;
         }
         if(start1 == end1 || start2 == end2)
         median = (median1+median2)/2.0;
           
       }
    
        return median;   
           
       
    }

    public static void main(String[] args)
    {
    Solution s = new Solution();
    int[] nums1 = {1,2,3,4};
    int[] nums2 = {5,6,7,8};
    double median = s.findMedianSortedArrays(nums1,nums2);

    System.out.println("Median "+median);
    }
}