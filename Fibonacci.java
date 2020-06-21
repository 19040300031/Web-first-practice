public class Fibonacci {
        static int of(int number) {
        if ((number == 0) || (number == 1))
            return number;
        else
            return of(number - 1) + of(number - 2);
        }
    
        public static void main(String[] args) {
            for (int i = 1; i <= 200; i++){
            System.out.printf("Fibonacci.of(%d) == %d\n",
            i, Fibonacci.of(i));
        }
    }
}