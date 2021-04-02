import java.util.Scanner;
public class Pratice1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.print("Nhập số nguyên cần kiểm tra: ");
        int number = sc.nextInt();

        if(number>=0){
            System.out.print("Đây là số nguyên dương ");
        } else {
            System.out.print("Đây là số nguyên âm");
        }
    }
}
