import java.util.Arrays;

public class DeleteForward {
    int n;

    DeleteForward() {
        this.n = 0;
    }

    void setN(int n) {
        this.n = n;
    }

    void takeAction(int[] a) {
        for (int i = this.n; i < 19; i++) {
            a[i] = a[i + 1];
        }
        a[19] = 0;
        System.out.println(Arrays.toString(a));
    }
}
