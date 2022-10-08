//Faça um Programa que calcule a área de um quadrado, em seguida mostre o dobro desta área para o usuário.
import java.util.Scanner; //Pacote importa (Habilita) o teclado
public class Exercicio7 { 

    public static void main (String args[]) {
        Scanner enterScanner = new Scanner(System.in); // Atribui o nome "enterScanner" à entrada do teclado
        
        System.out.println("Digite a medida do lado: "); // Imprime na tela a mensagem
        double lado = enterScanner.nextInt(); //Aloca a variável lado e grava o valor digitado
        
        double area = lado * lado; //Aloca a variável area e calcula a área do quadrado
        System.out.println("A área do quadrado é: " + area + " m2 ou cm2"); // Imprime na tela a mensagem + area
        
        double dobro = area * 2; //Aloca a variável dobro e calcula o dobro da área do quadrado
        System.out.println("O dobro da área do quadrado é: " + dobro); // Imprime na tela a mensagem + dobro
        enterScanner.close(); //Encerra as entradas do teclado
    }
}