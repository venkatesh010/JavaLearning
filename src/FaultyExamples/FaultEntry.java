package FaultyExamples;

public class FaultEntry {
    public static void main(String... args) {
        LoopTrap loopTrap = new LoopTrap();
        // Loops back and forth to give you stack overflow exception
        loopTrap.loop();
    }
}
