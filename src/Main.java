import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int max = 1000;
        int min = 0;
        System.out.println("Привет, идиотина, загадай число, а я его угадаю");
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i <= 10; i++) {
            int current = (max + min) / 2;
            if (i == 10) {
                System.out.println("Что за ультрачисло ты загадал? Я не угадал, уважение ");
                break;
            }
            System.out.println("Твое число " + current + " ?");
            char input = scan.next().charAt(0);
            switch(input) {
                case '>' :
                    min = current;
                    break;
                case '<' :
                    max = current;
                    break;
                case '=' :
                    System.out.println("ХА");
                    break;
                default:
                    System.out.println("ЧТО ТЫ ВВЕЛ, БАРАН?");
            }
            if (input == '=') {
                break;
            }
        }
    }
}