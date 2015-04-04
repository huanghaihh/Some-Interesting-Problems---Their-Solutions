/* Here is problem definition:
Given an array of size n, find the majority element. 
The majority element is the element that appears more than ⌊ n/2 ⌋ times.
You may assume that the array is non-empty and the majority element always exist in the array.
*/
// First super short solution:

public class MajorityElement{
	public int majorityelement(int[] num){
		Arrays.sort(num);
		return num[num.length / 2];
	}
}

// A more illustrative solution:

public class MajorityElement{
	public int majorityelement(int[] num){
		int count = 1, major = num[0];
        for(int i = 1; i < num.length; i++){
            if(count == 0) {major = num[i]; count++;}
            else if(num[i] != major) count--;
            else count++;
        }
        return major;
	}
}
