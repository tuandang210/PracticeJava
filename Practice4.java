import java.util.Scanner;

public class Pratice4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("a: ");
        double a = sc.nextDouble();

        System.out.print("b: ");
        double b = sc.nextDouble();

        System.out.print("c: ");
        double c = sc.nextDouble();

        if(a*a+b*b==c*c || b*b+c*c==a*a || c*c+a*a==b*b){
            System.out.println("Đây là ba cạnh của tam giác vuông");
        } else {
            System.out.println("Đây không phải ba cạnh của tam giác vuông");
        }
    }
}
