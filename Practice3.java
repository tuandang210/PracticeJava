import java.util.Scanner;
public class Pratice3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("a: ");
        double a = sc.nextDouble();

        System.out.print("b: ");
        double b = sc.nextDouble();

        System.out.print("c: ");
        double c = sc.nextDouble();

        if ((a+b>c)&&(a+c>b)&&(b+c>a)){
            System.out.println("Đây là 3 cạnh của 1 tam giác");
        } else {
            System.out.println("Đây không phải 3 cạnh của 1 tam giác");
        }
    }
}
