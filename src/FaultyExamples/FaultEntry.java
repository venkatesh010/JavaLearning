package FaultyExamples;


public class FaultEntry {
    public static void main(String... args) {
        int a = 100_000_000;
        int hex = 0x10B;
        int octal = 0413;
        System.out.println("octal: " + octal);
        System.out.println("hex: " + hex);
        System.out.println("+: " + (octal+hex));


        System.out.println(a);
        System.out.println("Yoo");
        LoopTrap loopTrap = new LoopTrap();
        // Loops back and forth to give you stack overflow exception
        loopTrap.loop();
    }
}
