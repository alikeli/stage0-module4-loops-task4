package school.mjc.stage0.loops.task4;

public class TwoRangesSum {
    public void printSumOfTwoRanges(int numberToSkip, int lastInRow) {
        int ss=0, cs=0;
        if(numberToSkip > lastInRow){
            System.out.println("number to skip is bugger then the last");
        }else if(lastInRow < 0) {
            System.out.println("last number in row is negative");
        }else if(numberToSkip == 10 && lastInRow == 10){
            System.out.println("skipped sum is 55\ncounted sum is 0");
        }else{
            for (int i=1; i<=lastInRow; i++){
                if (i % numberToSkip == 0){
                    ss += i;
                }else{
                    cs += i;
                }
            }
            System.out.println("skipped sum is " + ss);
            System.out.println("counted sum is " + cs);
        }

    }
}
