package FaultyExamples;

import java.util.List;
import java.util.Scanner;

public class TestFault {
    public static void main(String[] args) {
           // main();
           // main(args);  //infinite loop
        String multiLine="fgfgfg\ngfgf";
        Scanner scanner = new Scanner(System.in);
        System.out.println(multiLine);
    }

    private static void main() {
        System.out.println("Hello");
    }

//wont compile as varargs and arrays
}
