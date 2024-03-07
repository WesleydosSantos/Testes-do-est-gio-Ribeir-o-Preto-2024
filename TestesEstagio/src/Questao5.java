import java.util.Scanner;

public class Questao5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma string: ");
        String texto = scanner.nextLine();

        String textoInvertido = inverterString(texto);

        System.out.println("String invertida: " + textoInvertido);

        scanner.close();
    }

    public static String inverterString(String texto) {
        char[] caracteres = texto.toCharArray();
        int inicio = 0;
        int fim = caracteres.length - 1;

        while (inicio < fim) {
            // Troca os caracteres de posição
            char temp = caracteres[inicio];
            caracteres[inicio] = caracteres[fim];
            caracteres[fim] = temp;

            // Atualiza os índices para o próximo par de caracteres
            inicio++;
            fim--;
        }

        // Converte o array de caracteres de volta para uma string
        return new String(caracteres);
    }
}
