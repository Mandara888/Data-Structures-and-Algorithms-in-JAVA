public class LEETCODE_4 {
     public static int [] merge(int nums1[],int nums2[]){
        int n=nums1.length;
        int m=nums2.length;
        int mergeArray[]=new int[m+n];
        int i=0,k=0,j=0;
        while(i<n && j<m){
            if(nums1[i]<=nums2[j]){
                mergeArray[k]=nums1[i];
                i++;
                k++;
            }else{
                mergeArray[k]=nums2[j];
                k++;
                j++;
            }
        }
        while(i<n){
            mergeArray[k]=nums1[i];
            k++;
            i++;
        }
        while(j<m){
            mergeArray[k]=nums2[j];
            k++;
            j++;
        }
        return mergeArray;
    }
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
       int arr[]= merge(nums1,nums2);
       int left=0;
       int right=arr.length-1;
       int mid=0;
       if(arr.length%2 != 0){
            mid=(left+right)/2;
            return (double) arr[mid];
       }
       else{
        mid=(left+right)/2;
        return (double)(arr[mid]+arr[mid+1])/2;
       }
    }
}
