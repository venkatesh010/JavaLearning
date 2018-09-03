package SameNameLocalAndInstanceVariable;

public class Main {

    public static void main(String[] args) {
        NameConflict  nm = new NameConflict();
        nm.setPhoneNumber("9999999999");
        System.out.println(nm.phoneNumber);   // does not print 999999999

    }

    public int returnCheck(){
        if(true){
            return 4;
        }
        //requires return statement here as well
        return 2;
    }
}
