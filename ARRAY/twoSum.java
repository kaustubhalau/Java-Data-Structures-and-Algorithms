
import java.util.HashMap;

class twoSum {

    public static int[] twoSum(int[] arr, int target) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            int difference = target - arr[i];

            if (map.containsKey(difference)) {
                return new int[] { map.get(difference), i };
            }
            map.put(arr[i], i);
        }

        return new int[] { -1 };
    }

    public static void main(String[] args) {
        int[] a = { 2, 7, 11, 15 };
        int target = 9;
        int[] answer = twoSum(a, target);
        for (int i : answer) {
            System.out.print(i + " ");

        }
    }
}