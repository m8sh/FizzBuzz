package lab1;

public class Multiples {
    public static void main(String[] args) {
        ;
    }

    public static int multiples(int n, int a, int b) {
        int j = 1;
        int k = 0;
        while (j < n) {
            boolean divisibleBy3 = j % a == 0;
            boolean divisibleBy5 = j % b == 0;

            // Print our appropriate result.
            if (divisibleBy3 && divisibleBy5) {
                k++;
            }
            else if (divisibleBy3) {
                k++;
            }
            else if (divisibleBy5) {
                k++;
            }
            j++;
            }
        System.out.println(k);
        return k;
    }
}
