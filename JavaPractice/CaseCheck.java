import java.util.Scanner;

public class CaseCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char ch = input.next().trim().charAt(0);
        if(ch >= 'a' && ch <= 'z'){
            System.out.println("it is lowercase");
        } else {
            System.out.println("it is Uppercase");
        }

    }
}

