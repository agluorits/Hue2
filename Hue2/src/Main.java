import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    static int xa = 0;
    static int xb = 0;
    static int ya = 0;
    static int yb = 0;

    public static void main(String[] args) {
        NumberTest nt = (n) -> {
            return true;
        };
        CalculationOperation add = (Number a, Number b) -> {
            return new Number(a.getA() + b.getA(), a.getB() + a.getB());
        };
        CalculationOperation sub = (Number a, Number b) -> {
            return new Number(a.getA() - b.getA(), a.getB() - b.getB());
        };
        CalculationOperation mul = (Number a, Number b) -> {
            return new Number(a.getA() * b.getA(), a.getB() * b.getB());
        };
        CalculationOperation div = (Number a, Number b) -> {
            return new Number(a.getA() / b.getA(), a.getB() / b.getB());
        };

        RationalCalculator rc = new RationalCalculator(add, sub, mul, div);

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
                    printcalculation();
                    int num = enternumbers();
                    while (num == 5) {
                        printcalculation();
                        num = enternumbers();
                    }
                    switch (num) {
                        case 1:
                            Number a = new Number(xa, xb);
                            Number b = new Number(ya, yb);
                            rc.add.calc(a, b);
                            break;
                        case 2:
                            a = new Number(xa, xb);
                            b = new Number(ya, yb);
                            rc.subtract.calc(a, b);
                            break;
                        case 3:
                            a = new Number(xa, xb);
                            b = new Number(ya, yb);
                            rc.multiply.calc(a, b);
                            break;
                        case 4:
                            a = new Number(xa, xb);
                            b = new Number(ya, yb);
                            rc.divide.calc(a, b);
                            break;
                        default:
                            System.out.println("ERROR");
                            break;
                    }
                    printsolution(1, 2);
                    break;
                case 2:
                    break;
                case 3:
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

    public static void relation(int xa, int xb, int ya, int yb) {

    }

    public static void vector(int xa, int xb, int ya, int yb) {

    }

    public static void complex(int xa, int xb, int ya, int yb) {

    }

    public static void menue() {
        System.out.println("Choose calculator:\n1 - Relation calculator\n2 - Vector calculator\n3 - Complex calculator\n4 - Exit program");
    }

    public static void printcalculation() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number x a> ");
        xa = scanner.nextInt();
        System.out.print("Enter number x b> ");
        xb = scanner.nextInt();
        System.out.print("Enter number y a> ");
        ya = scanner.nextInt();
        System.out.print("Enter number y b> ");
        yb = scanner.nextInt();
    }

    public static int enternumbers() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose operation:\n1 - add\n2 - subtract\n3 - multiply\n4 - divide\n5 - enter numbers again");
        return scanner.nextInt();
    }

    public static void printsolution(int suma, int sumb) {
        System.out.println("--------------------\na = " + suma + "\nb = " + sumb + "\n--------------------");
    }
}