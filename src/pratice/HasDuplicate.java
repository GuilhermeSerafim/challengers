package pratice;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HasDuplicate {
    public static void main(String[] args) {
        System.out.println(hasDuplicate(List.of(1, 2, 3, 4, 5)));       
        System.out.println(hasDuplicate(List.of(1, 2, 3, 4, 5, 3)));    
        System.out.println(hasDuplicate(List.of()));                    
    }
    public static boolean hasDuplicate(List<Integer> nums) {
        if (nums == null || nums.isEmpty()) {
            return false;
        }

        Set<Integer> seen = new HashSet<>();

        for (Integer num : nums) {
            if (!seen.add(num)) {
                return true;
            }
        }

        return false;
    }
}
