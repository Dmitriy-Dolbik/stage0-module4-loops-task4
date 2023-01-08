package school.mjc.stage0.loops.task4;

public class NumberToBreakOn {
    public static void main(String[] args) {
        NumberToBreakOn numberToBreakOn = new NumberToBreakOn();
        numberToBreakOn.printNumbersUntilWithBreakOn(4,8);
    }
    public void printNumbersUntilWithBreakOn(int toBreakWith, int numberToGoUntil) {
        if (toBreakWith > numberToGoUntil)
        {
            System.out.println("iterating till the end");
        }
            for (int i = 1; i <= numberToGoUntil; i++) {
                System.out.println(i);
                if (i == toBreakWith){
                    break;
                }
            }
    }
}
