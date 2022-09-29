import java.io.*;
import java.util.Scanner;

public class NumberTester implements NumberTest {
    private NumberTester oddTester;
    private NumberTester primeTester;
    private NumberTester palindromeTester;

    public static void main(String[] args) throws FileNotFoundException {
        new NumberTester("src/numbers.txt");
    }

    public NumberTester(String fileName) throws FileNotFoundException {
        int testfaelle = 0;
        File file = new File(fileName);
        Scanner scanner = new Scanner(file);
        testfaelle = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < testfaelle; i++) {
            String line = scanner.nextLine();
            String[] n = line.split(" ");
            int n1 = Integer.parseInt(n[0]);
            int n2 = Integer.parseInt(n[1]);
            //System.out.println(n1 + " " + n2);
            switch (n1) {
                case 1:
                    if (n2 % 2 == 0) {
                        System.out.println(n2 + " ist eine gerade Zahl!");
                    } else {
                        System.out.println(n2 + " ist eine ungerade Zahl!");
                    }
                    break;
                case 2:
                    if (isPrime(n2)) {
                        System.out.println(n2 + " ist eine Primzahl!");
                    } else {
                        System.out.println(n2 + " ist keine Primzahl!");
                    }
                    break;
                case 3:
                    char[] check = String.valueOf(n2).toCharArray();
                    System.out.println(isPalindrom(check));
                    break;
                default:
                    System.out.println("ERROR");
                    break;
            }
        }
    }

    public static boolean isPalindrom(char[] wort) {
        boolean palindrom = false;
        if (wort.length % 2 == 0) {
            for (int i = 0; i < wort.length / 2 - 1; i++) {
                if (wort[i] != wort[wort.length - i - 1]) {
                    return false;
                } else {
                    palindrom = true;
                }
            }
        } else {
            for (int i = 0; i < (wort.length - 1) / 2 - 1; i++) {
                if (wort[i] != wort[wort.length - i - 1]) {
                    return false;
                } else {
                    palindrom = true;
                }
            }
        }
        return palindrom;
    }

    public void setOddEvenTester(NumberTester oddTester) {
        this.oddTester = oddTester;
    }

    public void setPrimeTester(NumberTester primeTester) {
        this.primeTester = primeTester;
    }

    public void setPalindromeTester(NumberTester palindromeTester) {
        this.palindromeTester = palindromeTester;
    }

    public void testFile() {

    }

    @Override
    public boolean testNumber(int number) {
        return false;
    }

    public static boolean isPrime(int p) {

        int[] array = new int[p - 1];
        int[] copyarray = new int[p - 1];
        int num = 2;
        for (int i = 0; i < p - 1; i++) {
            array[i] = num;
            num++;
        }

        for (int i = 0; i < p - 1; i++) {
            for (int j = 0; j < p - 1; j++) {
                if (array[i] == 0) {
                    break;
                } else if (array[i] == array[j]) {
                } else if (array[j] % array[i] == 0) {
                    array[j] = 0;
                }
            }
        }

        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != 0) {
                copyarray[counter] = array[i];
                counter++;
            }
        }

        int[] sumarray = new int[counter];
        for (int i = 0; i < counter; i++) {
            sumarray[i] = copyarray[i];
        }


        for (int s : sumarray) {
            if (s == p) {
                return true;
            }
        }
        return false;
    }
}