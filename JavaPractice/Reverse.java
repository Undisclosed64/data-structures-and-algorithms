public class Reverse {

    public static void main(String[] args) {
        int n = 23597;
        int ans = 0;
        while(n>0){
            int remainder = n % 10;//gives last digit
            ans = ans * 10 + remainder;/* adding the remainder to the right using this
                                         7 * 10 + 9 = 79
                                         79 * 10 + 5 = 795
                                         795 * 10 + 3 = 7953
                                         7953 * 10 + 2 = 79532
                                         */
            n = n / 10; //removes last digit and prepare the number for getting next last digit
        }
        System.out.println(ans);
    }
}