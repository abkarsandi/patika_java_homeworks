import java.util.Scanner;
public class ucgen_alani_hesaplama {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        double u = (a+b+c)/2;
        double areaSquared = u * (u-a) * (u-b) *(u-c);
        double area = Math.pow(areaSquared, .5);
        System.out.println(area);
    }
}
