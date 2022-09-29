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
        VectorCalculator vc = new VectorCalculator(add, sub, mul, div);
        ComplexCalculator cc = new ComplexCalculator(add, sub, mul, div);

        int x = 0;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            menue();
            x = scanner.nextInt();
            while (x < 1 || x > 4) {
                System.out.println("ERROR! Please write a number between 1 and 4");
                x = scanner.nextInt();
            }
            int num = 0;
            Number a;
            Number b;
            Number erg;
            switch (x) {
                case 1:
                    printcalculation();
                    num = enternumbers();
                    while (num == 5) {
                        printcalculation();
                        num = enternumbers();
                    }
                    a = new Number(xa, xb);
                    b = new Number(ya, yb);
                    erg = new Number(0, 0);
                    switch (num) {
                        case 1:
                            erg = rc.add(a, b);
                            break;
                        case 2:
                            erg = rc.subtract(a, b);
                            break;
                        case 3:
                            erg = rc.multiply(a, b);
                            break;
                        case 4:
                            erg = rc.divide(a, b);
                            break;
                        default:
                            System.out.println("ERROR");
                            break;
                    }
                    printsolution(erg);
                    break;
                case 2:
                    printcalculation();
                    num = enternumbers();
                    while (num == 5) {
                        printcalculation();
                        num = enternumbers();
                    }
                    a = new Number(xa, xb);
                    b = new Number(ya, yb);
                    erg = new Number(0, 0);
                    switch (num) {
                        case 1:
                            erg = vc.add(a, b);
                            break;
                        case 2:
                            erg = vc.subtract(a, b);
                            break;
                        case 3:
                            erg = vc.multiply(a, b);
                            break;
                        case 4:
                            erg = vc.divide(a, b);
                            break;
                        default:
                            System.out.println("ERROR");
                            break;
                    }
                    printsolution(erg);
                    break;
                case 3:
                    printcalculation();
                    num = enternumbers();
                    while (num == 5) {
                        printcalculation();
                        num = enternumbers();
                    }
                    a = new Number(xa, xb);
                    b = new Number(ya, yb);
                    erg = new Number(0, 0);
                    switch (num) {
                        case 1:
                            erg = cc.add(a, b);
                            break;
                        case 2:
                            erg = cc.subtract(a, b);
                            break;
                        case 3:
                            erg = cc.multiply(a, b);
                            break;
                        case 4:
                            erg = cc.divide(a, b);
                            break;
                        default:
                            System.out.println("ERROR");
                            break;
                    }
                    printsolution(erg);
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

    public static void printsolution(Number sum) {
        System.out.println("--------------------\na = " + sum.getA() + "\nb = " + sum.getB() + "\n--------------------");
    }
}