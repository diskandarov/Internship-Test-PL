package test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        int xO = 0;
        int yO = 0;
        int r = 0;
        Scanner scanner = new Scanner(new File(args[0]));
        while (scanner.hasNext()) {
            xO = scanner.nextInt();
            yO = scanner.nextInt();
            r = scanner.nextInt();
        }
        scanner.close();
        Scanner scanner1 = new Scanner(new File(args[1]));
        while (scanner1.hasNext()) {
            double a = Math.pow(scanner1.nextInt()-xO, 2) + Math.pow(scanner1.nextInt() - yO, 2);
            double b = Math.pow(r, 2);
            if (a == b){
                System.out.println("0");
            } else if (a > b) {
                System.out.println("2");
            }else System.out.println("1");
        }
        scanner1.close();
    }
}
