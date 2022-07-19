package aincorp.luxoft;

/*
Write java function which calculates number of pairs in array.
Pair is when two numbers added together, result is zero.

[-1, 7, -9, -7, 1, 8]
 */
public class PairSum {

    public int solution(int arr[]) {
        int count = 0;

        /*Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], null);
        }

        int num;
        for (int i = 0; i < arr.length; i++) {
            num = -1 * arr[i];
            if (map.containsKey(num)) {
                map.remove(num);
                map.remove(arr[i]);
                count++;
            }
        }*/

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == 0) {
                    count++;
                }
            }
        }

        return count;
    }
}
