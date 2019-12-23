import java.util.Scanner;

public class yuan {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println("请输入圆的半径(整数)");
        int x = a.nextInt();
        double y = Math.pow(x, 2) * Math.PI;
        System.out.println(String.format("%.2f", y));//保留俩位"%.几f"就是几位小数
    }
}
