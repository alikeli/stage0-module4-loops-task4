package school.mjc.stage0.loops.task4;

public class NumberToBreakOn {
    public void printNumbersUntilWithBreakOn(int toBreakWith, int numberToGoUntil) {
        if (toBreakWith > numberToGoUntil) {
            System.out.println("iterating till the end");
            int count = 0;
            do {System.out.println(count + 1);
                count ++;
            } while (count < numberToGoUntil);

//            for (int i = 0; i < numberToGoUntil; i++) {
//                System.out.println(i + 1);
//            }
        } else {
            for (int i = 0; i <= numberToGoUntil; i++) {
                System.out.println(i + 1);
                if (i + 1 == toBreakWith)
                    break;
            }
        }
    }
}





