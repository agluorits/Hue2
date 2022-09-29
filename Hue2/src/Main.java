import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        NumberTest nt = (n)->{return true;};
        //RationalCalculator rc = (n)->{return ;};

        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        if(x < 1 || x > 4){
            System.out.println("ERROR! Please write a number between 1 and 4");
        }
        switch (x)
        {
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                return;
            default:
                System.out.println("ERROR!");
                break;
        }
    }
}