import java.io.*;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        threeSum(new int[] {-1,0,1,2,-1,-4});
    }

    public static void threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        int length = nums.length;
        for (int i = 0; i < length; i++) {
            // 去重 注意范围判定
            if (i < length -1 && nums[i + 1] == nums[i]) { continue;}
            // 定义左右指针
            int j = i + 1, k = length - 1;
            while(j < k) {
                if (nums[j] + nums[k] == -nums[i]) {
                    List<Integer> tmp = new ArrayList<Integer>(Arrays.asList(nums[i], nums[j], nums[k]));
                    ans.add(tmp);
                    j++;
                    k--;
                    // 分别对左右指针也去重 注意范围判定
                    while(j < length - 1 && nums[j] == nums[j - 1]) {j++;}
                    while(k > 0 && nums[k] == nums[k + 1]) {k--;}
                } else if (nums[j] + nums[k] > -nums[i]) {
                    k--;
                } else {
                    j++;
                }      
            }
        }
        System.out.println(ans); 
    }
}

