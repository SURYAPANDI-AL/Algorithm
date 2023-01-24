// moore voting algorithm:

// s1: initially make a variable for max canditate is first element and  count as 1.

// s2: traverse through the array if the element and the next element are same increment the count by one. 
// 	if the elements are different change the max canditate to new element and decrese count by one.

// s3: we got a final max value now travere again find the count.

// s4: if the count is greater than n/2 then the max canditate is correct else there is not any max canditate.


public class MaxCanditate{
	public int maxCanditate(int[]nums){
		int count=1,maxC=nums[0];
		for(int pos=0;pos<nums.length-1;pos++){
			if(nums[pos]==nums[pos+1])
				count++;
			else
				count--;
			if(count==0){
				maxC=nums[pos+1];
				count=1;
			}
		}
		count=0;
		for(int pos=0;pos<nums.length;pos++){
			if(nums[pos]==maxC)
				count++;
		}
		if(count>nums.length/2)
			return maxC;
		return -1;
	}
} 
