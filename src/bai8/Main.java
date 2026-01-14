package bai8;

public class Main {
    public static void decimalToBinary(int number, MyStack stack){
        while(number > 0){
            stack.push(number % 2);
            number /= 2;
        }
    }

    public static void printBinary(MyStack stack) throws Exception {
        while (!stack.isEmpty()) {
            System.out.print(stack.pop());
        }
    }


    public static void main(String[] as) throws Exception {
        int number = 30;
        MyStack stack = new MyStack(32);

        decimalToBinary(number, stack);
        printBinary(stack);

    }
}
