import java.util.Arrays;
import java.util.Scanner;

public class ArrayChange {
    public static void main(String[] args) {
        int[] arr = new int[20];
        int i;
        for (i = 0; i < 20; i++) {
            arr[i] = i;
        }
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个0-19的整数：");
        int num = sc.nextInt();
        for (i = num; i < 19; i++) {
            arr[i] = arr[i + 1];
        }
        arr[19] = 0;
        System.out.println(Arrays.toString(arr));
    }
}
