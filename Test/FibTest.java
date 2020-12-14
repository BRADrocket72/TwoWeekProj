import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Scanner;

public class FibTest {
    FibonacciCalculator fib = new FibonacciCalculator();
    Scanner input = new Scanner(System.in);
    @Test
    public void TestBaseCaseIsOne(){
        fib.makeSequence(0,1);
        int baseCase = fib.getValueAt(1);
        Assertions.assertEquals(1,baseCase);
    }
    @Test
    public void TestCaseTwoIsOne(){
        fib.makeSequence(0,1);
        int secondCase = fib.getValueAt(1);
        Assertions.assertEquals(1, secondCase);
    }
    @Test
    public void TestCaseThreeIsTwo(){
        fib.makeSequence(0,3);
        int thirdCase = fib.getValueAt(3);
        System.out.println(fib.fibSequence);
        Assertions.assertEquals(2,thirdCase);
    }
    @Test
    public void TestCaseFourIsThree(){
        fib.makeSequence(0,4);
        int fourthcase = fib.getValueAt(4);
        System.out.println(fib.fibSequence);
        Assertions.assertEquals(3, fourthcase);
    }
    @Test
    public void TestArrayToTen(){
        fib.makeSequence(0,10);
        int fourthcase = fib.getValueAt(10);
        ArrayList<Integer> calculatedSeq = fib.fibSequence;
        System.out.println(calculatedSeq);
        Assertions.assertEquals(fib.fibSequence.size(),10);
    }








}