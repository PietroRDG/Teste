import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o numero: ");
        int numeroDigitado = scanner.nextInt();

        scanner.close();

        int primeiro = 0, segundo = 1;
        ArrayList<Integer> listaFibonacci = new ArrayList<>();

        for (int i = 0; i < numeroDigitado; i++) {
            System.out.print(primeiro + " ");
            listaFibonacci.add(primeiro);

            int proximo = primeiro + segundo;
            primeiro = segundo;
            segundo = proximo;
        }

        if (listaFibonacci.contains(numeroDigitado)){
            System.out.println("o numero digitado pertence a sequencia de Fibonacci");
        } else {
            System.out.println("o numero não pertence a sequencia de Fibonacci");
        }
    }
}