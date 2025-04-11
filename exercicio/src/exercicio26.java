import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class exercicio26 {
    public static void main(String[] args) {




        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int N = scanner.nextInt();

        int i = 1;

        System.out.println("Números ímpares de 1 até " + N + ":");
        while (i <= N) {
            System.out.println(i);
            i += 2;
        }

















    }
}