import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入半径r：");
        double r = scan.nextDouble();

        AreaOfCircle aoc = new AreaOfCircle();
        aoc.setR(r);
        System.out.println("圆的面积为：" + String.format("%.2f", aoc.getArea()));
    }
}
