import java.util.Scanner;
//Biblioteca
public class Informacoesdousuario {
    public static void main(String[] args) {
        Integer valor;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe um numero: ");

        valor = scanner.nextInt();
        System.out.println(valor + 10);
        }
}