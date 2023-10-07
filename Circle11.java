public class Circle11 {
    public double x, y, r;
    static int circlecount = 0;

    public Circle11(double x, double y, double r) {
        this.x = x;
        this.y = y;
        this.r = r;
    }

    public Circle11(double r) {
        this(0.0, 0.0, r);
        circlecount++;
    }

    public Circle11() {
        this(0.0, 0.0, 0.1);
        circlecount++;
    }

    // AN INSTANCE METHOD RETURN THE BIGGER OF TWO CIRCLES
    public Circle11 bigger(Circle11 c) {
        if (c.r > r)
            return c;
        else
            return this;
    }

    public static Circle11 bigger(Circle11 a, Circle11 b) {
        if (a.r > b.r)
            return a;
        else
            return b;
    }

    public static void main(String[] args) {
        Circle11 a = new Circle11(2.0);
        Circle11 b = new Circle11(3.0);
        Circle11 c = a.bigger(b);
        Circle11 d = Circle11.bigger(a, b);//static method can be called directly by class name
    }
}
