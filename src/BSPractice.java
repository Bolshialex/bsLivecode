import java.util.ArrayList;
import java.util.List;

public class BSPractice {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        nums.add(2);
        nums.add(4);
        nums.add(4);
        nums.add(5);
        nums.add(8);
        nums.add(9);
        nums.add(22);

        int toInsert = 7;

        System.out.println(insertLocation(nums, toInsert));
    }

    public static int insertLocation(List<Integer> data, int toInsert){
        int low = 0;
        int high = data.size();

        int mid; 

        while(low < high){
            int distance = high - low;
            mid = low + (distance/ 2);

            int item = data.get(mid);
            if(toInsert == item){
                return mid;
            }else if(toInsert < item){
                high = mid;
            }else{
                low = mid + 1;
            }
        }
        return low;
    }
}