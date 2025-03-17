//custom exceptions
class CheckGender extends Exception{//Exception class 01
    CheckGender(){
        super("Give valid gender....");
    }
}
public class gender {
    //Exception Method inside Main class
    public static void checkValid(String gender) throws CheckGender {
        if (gender == "male") {
            System.out.println("Gender male is matched");
        } else if (gender == "female") {
            System.out.println("Gender female is matched");
        } else if (gender == "trans") {
            System.out.println("Gender trans is matched");
        } else {
            throw new CheckGender();
        }
    }

    public static void main(String[] args) {
        try {
            checkValid("trans");  // Line 20 (example argument, you can change it as needed
        } catch (CheckGender e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }
    }
}
