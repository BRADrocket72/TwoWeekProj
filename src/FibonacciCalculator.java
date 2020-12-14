import java.util.ArrayList;

public class FibonacciCalculator {


    ArrayList<Integer> fibSequence = new ArrayList();

    public FibonacciCalculator() {

    }

    public void makeSequence(int i, int end) {

        for(int j = 0; j<end; j++){
            fibSequence.add(Fibonacci(j));
        }
    }

    public int getValueAt(int i) {
        int value = fibSequence.get(i-1);
        return value;
    }
    public int Fibonacci(int counter){
        if(counter<= 1){
            return 1;
            }
        return Fibonacci(counter-1)+ Fibonacci(counter-2);
    }


    public void getSequence(int counter) {

}
}

