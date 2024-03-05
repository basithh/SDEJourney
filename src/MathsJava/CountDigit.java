package MathsJava;

import java.io.InputStream;
import java.util.Scanner;

public class CountDigit {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        String a = scanner.nextLine();
        Integer i = Integer.valueOf(a);
        int num = 0;
        while (i>0){
            i=i/10;
            num++;
        }
        System.out.println(num);

        System.out.println(Math.floor(Math.log10(1234)+1));
    }
}
