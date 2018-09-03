package SameNameLocalAndInstanceVariable;


public class NameConflict {
    String phoneNumber = "1234567890";
    public void setPhoneNumber(String... phone){
        String phoneNumber;
        if(phone.length != 0)
        phoneNumber = phone[0];

    }



}
