import java.util.Scanner;
import java.lang.Math;

public class Area {
    public static void main(String[] args) {
        System.out.println("请输入圆的半径：");
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        double square = r * r * Math.PI;
        System.out.println("圆的面积为：");
        System.out.printf("%.2f", square);
    }
}
