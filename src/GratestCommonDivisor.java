import java.util.Scanner;

public class GratestCommonDivisor {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("First number = ");
        int m=scanner.nextInt();
        System.out.print("Second number = ");
        int n=scanner.nextInt();
        System.out.print("Gratest Common Divisor = ");
        System.out.println(gcd(m, n));
        System.out.print("Least Common Multiple = ");
        System.out.println(lcm(m,n));

    }

    public static int gcd(int a, int b) {
        if (b == 0)  {
            return a;
        }
        int x = a % b;
        return gcd(b, x);
    }

    public static  int lcm(int a,int b){

        return a / gcd(a,b) * b;
    }

}