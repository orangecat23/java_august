package regex;

public class RegexEx {
    public static void main(String[] args) {
        String email = "test123@gmail.com";
        String regex = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
        if (email.matches(regex)) {
            System.out.println("valid email");
        } else {
            System.out.println("invalid email");
        }
    }

}
