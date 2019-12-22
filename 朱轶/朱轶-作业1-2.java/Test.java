import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        int[] a = new int[20];
        for (int i = 0; i < 20; i++) {
            a[i] = i;
        }

        Scanner scan = new Scanner(System.in);
        System.out.println("请输入要删除的数的位置：");
        int n = scan.nextInt();

        DeleteForward df = new DeleteForward();
        df.setN(n);
        df.takeAction(a);
    }
}
