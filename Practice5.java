import java.util.Scanner;

public class Pratice5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số cần kiểm tra: ");
        int number = sc.nextInt();

        if((number%3==0)&&(number%5==0)){
            System.out.println("FIZZBUZZ");
        } else if (number%3==0){
            System.out.println("FIZZ");
        } else if (number%5==0){
            System.out.println("BUZZ");
        }
    }
}
