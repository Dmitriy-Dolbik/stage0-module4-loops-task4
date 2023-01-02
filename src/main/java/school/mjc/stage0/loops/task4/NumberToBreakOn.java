package school.mjc.stage0.loops.task4;

public class NumberToBreakOn {
    public static void main(String[] args) {
        NumberToBreakOn numberToBreakOn = new NumberToBreakOn();
        numberToBreakOn.printNumbersUntilWithBreakOn(4,8);
    }
    public void printNumbersUntilWithBreakOn(int toBreakWith, int numberToGoUntil) {
        if (toBreakWith > numberToGoUntil){
            System.out.println("iterating till the end");
            for (int i = 0; i <= numberToGoUntil; i++) {
                System.out.println(i);
            }
        } else {
            for (int i = 0; i <= toBreakWith; i++) {
                System.out.println(i);
            }
        }

    }
}
