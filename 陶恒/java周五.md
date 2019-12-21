```java
import java.util.ArrayList;
import java.util.Scanner;

public class HomeWork02 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < 20; i++) {
            list.add(i);
        }
        System.out.println(list);
        System.out.println("请输入1-19中的任何一个数");
        Scanner sc = new Scanner(System.in);
        int b =  sc.nextInt();
        list.remove(b);
        list.add(0);
        System.out.println(list);
    }
}

```



```java
import org.w3c.dom.ls.LSOutput;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Work01 {

    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);
        int R = r.nextInt();
        double S = R * R * Math.PI;
        DecimalFormat df = new DecimalFormat("#.00");
        System.out.println(df.format(S));
    }
}

```

