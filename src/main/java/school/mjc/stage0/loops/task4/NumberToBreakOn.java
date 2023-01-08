package school.mjc.stage0.loops.task4;

public class NumberToBreakOn {
    public static void main(String[] args) {
        NumberToBreakOn numberToBreakOn = new NumberToBreakOn();
        numberToBreakOn.printNumbersUntilWithBreakOn(19,8);
    }
    public void printNumbersUntilWithBreakOn(int toBreakWith, int numberToGoUntil) {
        if (toBreakWith > numberToGoUntil){
            System.out.println("iterating till the end");
            for (int i = 1; i <= numberToGoUntil; i++) {
                System.out.println(i);
            }
            for (int i = 1; i <= numberToGoUntil; i++) {
            }
        } else {
            for (int i = 1; i <= toBreakWith; i++) {
                System.out.println(i);
            }
        }

    }
}
