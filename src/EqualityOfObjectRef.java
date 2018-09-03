import FaultyExamples.LoopTrap;

public class EqualityOfObjectRef {
    public static void main(String[] args) {
        int x=100;
        long y = x;
        char a='a';
        final float b=97.0F;
        final byte c=20;


        System.out.println(b==a);
        LoopTrap loopTrap1 = new LoopTrap();
        LoopTrap loopTrap2 = null;
        //loopTrap2 = loopTrap1;
        if(loopTrap1 == loopTrap2){
            System.out.println("Equal object refs by ==");
        }
        if(loopTrap1.equals(loopTrap2)){
            System.out.println("Equal object refs by .equals()");
        }
    }
}
