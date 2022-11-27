package aincorp.adel;

public class ModNumber {

    public int modNumber(int[] arr) {
        int count = 0;

        int max = 0;

        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
                count = 1;
            } else if (max == arr[i]) {
                count++;
            }
        }

        return count;
    }

}
