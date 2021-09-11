package median;

import java.util.Arrays;

public class MedianofTwoSortedArrays {

	public MedianofTwoSortedArrays() {
		
	}
	
	public double getMedianOfTwoSortedArrays(int nums1[],int nums2[]) {
		int len1 = nums1.length;
		int len2 = nums2.length;
		int[] res = new int[len1 + len2];
		System.arraycopy(nums1,0,res,0,len1);
		System.arraycopy(nums2,0,res,len1,len2);
		Arrays.sort(res);
		int mid = res.length / 2;
		return (res.length % 2 != 0) ? res[mid]: (double)(res[mid] + res[mid-1]) / 2;
	}

	public static void main(String[] args) {
		MedianofTwoSortedArrays obj = new MedianofTwoSortedArrays();
		int a[] = {1,2,3,4,5,6,7,8};
		int b[] = {11,12,13,14};
		System.out.println(obj.getMedianOfTwoSortedArrays(a,b));

	}

}
