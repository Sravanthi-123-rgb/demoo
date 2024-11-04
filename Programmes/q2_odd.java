public class q2_odd {
    public static void main(String[] args) {
        int num=2345678;
        int count=0;
        while (num!=0) {
           int rem=num%10;
            if(rem %2!=0){
                count++;
            }
            num=num/10;
        }
        System.out.println(count);
    }
}
