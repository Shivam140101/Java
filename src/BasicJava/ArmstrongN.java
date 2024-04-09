package BasicJava;

public class ArmstrongN {
    public static void main(String[] args) {
        int num=0,i;
        int  sum=0,rem=0;

        i=1;
        while(i <1000) {
            num =i;
            sum =0;
            while(num !=0) {
                rem = num % 10;
                sum += (rem *rem *rem);
                num /= 10;
            }
            if(i == sum)
                System.out.println("The number is Armstrong "+i);
            i++;
        }
        System.out.println("End of main "+sum);
    }
}
