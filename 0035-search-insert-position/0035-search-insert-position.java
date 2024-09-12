class Solution {
    public int searchInsert(int[] a, int k) {
        int low=0,high=a.length-1;
	    while(low<=high){
	        int mid=low+(high-low)/2;
	        if(a[mid]==k){
	            return mid;
	        }
	        if(a[mid]>k){
	            high=mid-1;
	        }
	        if(a[mid]<k){
	            low=mid+1;
	        }
	    }
	    return low;
    }
}