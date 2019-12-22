import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class zuoye {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            a.add(i);
        }
        Scanner b = new Scanner(System.in);
        System.out.println("请输入一个数(0~19)");
        int x = b.nextInt();
        a.remove(x);
        a.add(0);
        Object[] c = a.toArray();//网上说可以转换成数组,再用Arrays.toString(c)输出
        System.out.println(Arrays.toString(c));
    }
}
