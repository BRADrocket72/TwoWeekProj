import java.util.ArrayList;

public class FibonacciCalculator {

    ArrayList<Integer> fibSequence = new ArrayList();
    public void makeSequence(int i, int i1) {
        fibSequence.add(1);
    }

    public int getValueAt(int i) {
        int value = fibSequence.get(i);
        return value;
    }
}
