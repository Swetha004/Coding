class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i=m+n-1,n1=m-1,n2=n-1;
        while(n1>=0 && n2>=0){
            nums1[i--]= (nums1[n1]>nums2[n2]? (nums1[n1--]): nums2[n2--]);
        }
        while(n2>=0){
            nums1[i--]=nums2[n2--];
        }
    }
}