
import java.util.Scanner;

public class principal {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        leitor.next();
        int diaInicial = leitor.nextInt();

        int horaInicial = leitor.nextInt();
        leitor.next();
        int minutoInicial = leitor.nextInt();
        leitor.next();
        int segundoInicial = leitor.nextInt();

        leitor.next();
        int diaFinal = leitor.nextInt();

        int horaFinal = leitor.nextInt();
        leitor.next();
        int minutoFinal = leitor.nextInt();
        leitor.next();
        int segundoFinal = leitor.nextInt();

        int inicio = diaInicial * 86400 + horaInicial * 3600 + minutoInicial * 60 + segundoInicial;

        int fim = diaFinal * 86400 + horaFinal * 3600 + minutoFinal * 60 + segundoFinal;

        int duracao = fim - inicio;

        int dias = duracao / 86400;
        duracao = duracao % 86400;

        int horas = duracao / 3600;
        duracao = duracao % 3600;

        int minutos = duracao / 60;
        int segundos = duracao % 60;

        System.out.println(dias + " dia(s)");
        System.out.println(horas + " hora(s)");
        System.out.println(minutos + " minuto(s)");
        System.out.println(segundos + " segundo(s)");

        leitor.close();
    }
}
