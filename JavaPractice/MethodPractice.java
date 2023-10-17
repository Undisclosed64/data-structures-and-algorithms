import java.util.Scanner;

public class MethodPractice {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        int num = in.nextInt();
//        boolean ans = isPrime(num);
//        System.out.println(ans);
//        System.out.println(isArmStrong(num));

        //print all 3 digits armstrong number
        for(int i = 100; i<1000; i++){
            if(isArmStrong(i)){
                System.out.println(i + " ");
            }
        }
    }

    static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        int count = 2;

        while (count * count <= n) {
            if (n % count == 0) {
                return false;
            }
            count++;
        }
        return true;
    }


    //whether a number is armstrong or not
    static boolean isArmStrong(int n){
        int original = n;
        int sum = 0;
        while(n > 0){
            int rem = n % 10;
            n = n / 10;
            sum = sum + rem * rem * rem;
        }
        if(sum == original){
            return true;
        }
        return false;
    }
}
