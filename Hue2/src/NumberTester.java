import java.io.*;
import java.util.Scanner;

public class NumberTester implements NumberTest{
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
            
        }
    }

    public void setOddEvenTester(NumberTester oddTester)
    {
        this.oddTester = oddTester;
    }

    public void setPrimeTester(NumberTester primeTester)
    {
        this.primeTester = primeTester;
    }

    public void setPalindromeTester(NumberTester palindromeTester)
    {
        this.palindromeTester = palindromeTester;
    }

    public void testFile()
    {

    }

    @Override
    public boolean testNumber(int number) {
        return false;
    }
}