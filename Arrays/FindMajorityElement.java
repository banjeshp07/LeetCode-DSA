package Arrays;
public class FindMajorityElement {
    public static int majorityElement(int[] nums) {
        int n = nums.length;
        int candidate = nums[0];
        int count = 0;
        
        for(int i = 0; i<n ; i++){

            if(count==0){
                candidate=nums[i];
            }
            
            if(candidate==nums[i]){
                count++;
            }
            else{
                count--;
            }
            
        }
          return candidate;
    }
    public static void main(String[] args) {
        int[] nums ={2, 2, 1, 1, 2, 2};
        System.out.println(majorityElement(nums));
    }
  
}

