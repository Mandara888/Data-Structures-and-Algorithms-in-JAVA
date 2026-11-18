public class LEETCODE_852{
       public int peakIndexInMountainArray(int[] arr) {
        int left=1;
        int right=arr.length-2;
        int mid=0;
        while(left<=right){
             mid=(left+right)/2;
            if(arr[mid-1]<arr[mid] && arr[mid]>arr[mid+1]){
                return mid;
            }
            else if(arr[mid-1]<arr[mid] && arr[mid]<arr[mid+1]){
                left=mid+1;
            }
            else{
                right=mid-1;
            }
        }
        return mid;
    }
}