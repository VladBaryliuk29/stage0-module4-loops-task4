package school.mjc.stage0.loops.task4;

public class TwoRangesSum {
    public void printSumOfTwoRanges(int numberToSkip, int lastInRow) {
        int skippedSum = 0;
        int sum = 0;
        boolean toStop = false;
        if (lastInRow < 0) {
            System.out.println("last number in row is negative");
            toStop = true;
        }
        for (int i = 1; i <= lastInRow; i++) {
            if (numberToSkip > lastInRow) {
                System.out.println("number to skip is bugger then the last");
                toStop = true;
                break;
            }
            if (i <= numberToSkip) {
                skippedSum += i;
                continue;
            }
            sum += i;
        }
        if (!toStop) {
            System.out.println("skipped sum is " + skippedSum);
            System.out.println("counted sum is " + sum);
        }
    }
}
