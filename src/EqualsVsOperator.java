public class EqualsVsOperator {
    public static void main(String[] args) {

        String a = new String("123");
        String b = new String("123");
        if(a == b){
            System.out.println("Ref");
        }
        if(a.equals(b)){
            System.out.println("Objects");
        }
    }
}
