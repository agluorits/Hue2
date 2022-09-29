import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        NumberTest nt = (n)->{return true;};
        //RationalCalculator rc = (n)->{return ;};
        int x = 0;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            menue();
            x = scanner.nextInt();
            while (x < 1 || x > 4) {
                System.out.println("ERROR! Please write a number between 1 and 4");
                x = scanner.nextInt();
            }
            switch (x) {
                case 1:
                    relation();
                    break;
                case 2:
                    vector();
                    break;
                case 3:
                    complex();
                    break;
                case 4:
                    System.out.println("Exiting programm!");
                    return;
                default:
                    System.out.println("ERROR!");
                    break;
            }
        }
    }

    public static void relation()
    {

    }

    public static void vector()
    {

    }

    public static void complex()
    {

    }

    public static void menue()
    {
        System.out.println("Choose calculator:\n1 - Relation calculator\n2 - Vector calculator\n3 - Complex calculator\n4 - Exit program");
    }

    public static void enternumbers()
    {
        System.out.println("Choose operation:\n1 - add\n2 - subtract\n3 - multiply\n4 - divide\n5 - enter numbers again");
    }

    public static void printsolution(int suma, int sumb)
    {
        System.out.println("--------------------\na = " + suma + "\nb = " + sumb + "\n--------------------");
    }
}