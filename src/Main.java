import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe um número: ");
        int numero = scanner.nextInt();
        scanner.close();

        if (numeroFibonacci(numero)) {
            System.out.println("O número " + numero + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println("O número " + numero + " não pertence à sequência de Fibonacci.");
        }
    }

    public static boolean numeroFibonacci(int n) {
        int a = 0, b = 1, c;
        if (n == a || n == b) return true;
        while (b < n) {
            c = a + b;
            a = b;
            b = c;
            if (b == n) return true;
        }
        return false;
    }
}