public class CountingOccurences {
    public static void main(String[] args) {
        int n = 13839;
        int target = 3;
        int count = 0;
        while(n>0){
            int remainder = n % 10;//gives last digit 13839 % 10 = 9
            if(remainder == target){
                count++;
            }
            n = n / 10; //removes last digit
        }
        System.out.println(count);
    }
}
