package MathsJava;

public class ReverseDigit {

    public int reverse(int x) {

        int num = 0;
        int que = Math.abs(x);
        while (que != 0) {
            num = (num * 10) + (que % 10);
            if (num > (Integer.MAX_VALUE - que % 10) / 10) {
                return 0;
            }
            que = que / 10;
        }
        // if(num>Integer.MAX_VALUE||num<Integer.MIN_VALUE){
        //     return 0;
        // }
        return x < 0 ? (-num) : num;
    }


    public static void main(String[] args) {
        ReverseDigit reverseDigit = new ReverseDigit();
        System.out.println(reverseDigit.reverse(-2147483412));
    }
}
