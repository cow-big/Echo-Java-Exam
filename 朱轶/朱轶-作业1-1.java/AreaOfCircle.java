public class AreaOfCircle {
    double r, s;

    AreaOfCircle() {
        this.r = 0;
        this.s = 0;
    }

    void setR(double r) {
        this.r = r;
    }

    double getArea() {
        s = Math.PI * this.r * this.r;
        return s;
    }
}
