package aincorp.algoexpert;

public class SortedSquaredArray {

    public int[] sortedSquaredArray(int[] array) {
        int[] answerArray = new int[array.length];

        int bp = 0;
        int ep = array.length - 1;

        int counter = ep;

        while (bp <= ep) {

            int squareBp = (int) Math.pow(array[bp], 2);
            int squareEp = (int) Math.pow(array[ep], 2);

            if (squareBp < squareEp) {
                answerArray[bp] = squareBp;
                answerArray[ep] = squareEp;
                int bpCtr = bp;
                while (bpCtr > 0) {
                    if (answerArray[bpCtr - 1] > answerArray[bpCtr]) {
                        int swap = answerArray[bpCtr - 1];
                        answerArray[bpCtr - 1] = answerArray[bpCtr];
                        answerArray[bpCtr] = swap;
                    }
                    bpCtr--;
                }
                if (answerArray[bp] > answerArray[ep]) {
                    int swap = answerArray[bp];
                    answerArray[bp] = answerArray[ep];
                    answerArray[ep] = swap;
                }
            } else if (squareBp > squareEp) {
                answerArray[ep] = squareBp;
                answerArray[bp] = squareEp;
            } else if (squareBp == squareEp) {
                if (bp == ep) {
                    answerArray[counter] = squareBp;
                } else if (bp < ep) {
                    answerArray[counter] = squareBp;
                    counter--;
                    answerArray[counter] = squareBp;
                }
            }

            bp++;
            ep--;
            counter--;
        }

        return answerArray;
    }
}
