public class FibonacciApp {
    public static void main(String[] args) {
        int inputNumber = 8;

        int passtofunc =fibonacciSequence(inputNumber);

        System.out.println("Number at position : "+ inputNumber
                +" in fibonacci sequence is ==> "+passtofunc);
    }

    static int fibonacciSequence(int number)
    {
        if (number <= 1)
            return number; //just return same number if 1 or less than 1 is entered
        return fibonacciSequence(number - 1) + fibonacciSequence(number - 2);
    }
}
