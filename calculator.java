import java.util.*;

public class calculator {

    public static void main (String[] args){
    Scanner scan = new Scanner (System.in);

        double nmr1;
        double nmr2;
        int metodo;

        System.out.println("Bem-vindo(a) a calculadora feita em JAVA, criada por Aquiles Duarte, aluno do projeto Soli Deo Gloria.");

        System.out.println("Vamos começar, escolha o metodo da sua calculadora, digite 1 para multiplicação, 2 para divisão, 3 para soma e 4 para subtração.");
        metodo = scan.nextInt();

        System.out.println("Digite o primeiro numero para o seu calculo.");
        nmr1 = scan.nextDouble();

        System.out.println("Digite o segundo numero para o seu calculo.");
        nmr2 = scan.nextDouble();

        if (metodo == 1) {
          System.out.println("O valor da sua multiplicação é: " + (nmr1 * nmr2));
        }
            else if (metodo == 2) {
          System.out.println("O valor da sua divisão é " + (nmr1 / nmr2));
        }
            else if (metodo == 3) {
          System.out.println("O valor da sua soma é " + (nmr1 + nmr2));
        }
        else if (metodo == 4) {
          System.out.println("O valor da sua subtração é " + (nmr1 - nmr2));
        }
  }
}