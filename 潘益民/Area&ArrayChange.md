计算面积：

```java
package EchoTest01;

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

```

数组变换：

```java
package EchoTest02;

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

```

