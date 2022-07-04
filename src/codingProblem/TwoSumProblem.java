package codingProblem;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class TwoSumProblem {

	public int[] twoSum(int[] nums, int target) {
		int[] ans = new int[2];
		// if(nums.length==2){
		// ans[0] = 0;
		// ans[1] = 1;
		// return ans;
		// }
		// for(int i=0; i<=nums.length-2; i++){
		// for(int j=i+1; j<nums.length; j++){
		// if(nums[i]+nums[j]==target){
		// ans[0] = i;
		// ans[1] = j;
		// return ans;
		// }
		// }
		// }
		// return ans;
		Map<Integer, Integer> map = new HashMap<>();
		Map<Integer, Integer> mapp = new HashMap<>();

		for (int i = 0; i < nums.length; i++) {
			if (map.getOrDefault(nums[i], -1) == -1) {
				map.put(nums[i], i);
			} else {
				mapp.put(nums[i], i);
			}
		}
		System.out.println(map);
		System.out.println(mapp);

		Set<Integer> keys = map.keySet();
		for (Integer k : keys) {
			System.out.println(k);
			if(k==(target-k)) {
				System.out.println(k);
				ans[0] = map.get(k);
				ans[1] = mapp.get(k);
				return ans;
			}
			else {
				if(map.get(target-k)!=null) {
					ans[0] = map.get(k);
					ans[1] = map.get(target-k);
					return ans;
				}
			}
		}
		return null;
	}

	public static void main(String[] args) {
		int[] nums = new int[] {2,7,3,3,9,8,5,8};
		int[] ans = new TwoSumProblem().twoSum(nums, 6);
		for(int a: ans) {
			System.out.println(a);
		}
	}

}
