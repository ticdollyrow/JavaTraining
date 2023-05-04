package Shildt.Chapter6;

public class Factorial {
    public static void main(String[] args) {
        int tmp = calculate(6);
        System.out.println(tmp);
    }
    public static int calculate(int number){
        if( number == 1) return 1;
        return calculate(number - 1) * number;
    }
}
