import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        double n1, n2;
        double soma;

        System.out.println("digite dois números: ");
        n1 =  entrada.nextInt();
        n2 = entrada.nextInt();

       soma = (n1+n2);
       System.out.println( "A soma dos dois números é " + soma);

    }
}
