package chapter03;

public class Rectangle {
    private double x;
    private double y;
    private double width;
    private double height;
    private String backgroundColor;
    /*
     * 1. 入力検証を一か所で定義できる
     * 2. 規定値を設定できる
     * 3. 型に緩い実装ができる
     */
    public Rectangle(double x, double y, double width, double height, String backgroudColor) 
            throws IllegalArgumentException {
        setX(x);
        setY(y);
        setWidth(width);
        setHeight(height);
        setBackgroundColor(backgroudColor);
    }
    public Rectangle(double width, double height, String backgroudColor) {
        this(100, 100, width, height, backgroudColor);
    }
    public Rectangle(double width, double height) {
        this(width, height, "white");
    }
    public Rectangle(String x, String y, String width, String height, String backgroundColor) {
        this(
            Double.parseDouble(x),
            Double.parseDouble(y),
            Double.parseDouble(width),
            Double.parseDouble(height),
            backgroundColor
        );
    }
    public void setX(double x) {
        this.x = x;
    }
    public double getY() {
        return y;
    }
    public void setY(double y) {
        this.y = y;
    }
    public double getWidth() {
        return width;
    }
    public void setWidth(double width) throws IllegalArgumentException {
        if (width < 10) {
            throw new IllegalArgumentException("幅が10未満");
        }
        this.width = width;
    }
    public double getHeight() {
        return height;
    }
    public void setHeight(double height) throws IllegalArgumentException {
        if (height < 10) {
            throw new IllegalArgumentException("高さが10未満");
        }
        this.height = height;
    }
    public String getBackgroundColor() {
        return backgroundColor;
    }
    public void setBackgroundColor(String backgroundColor) {
        this.backgroundColor = backgroundColor;
    }
    // 面積
    public double area() {
        return width * height;
    }
    // 対角線
    public double diagonal() {
        return Math.hypot(width, height);
    }
    // 外周
    public double perimeter() {
        return (width + height) * 2;
    }
    // 原点からの距離
    public double distance() {
        return Math.hypot(x, y);
    }
    @Override
    public String toString() {
        return "Rectangle [x=" + x + ", y=" + y + ", width=" + width + ", height=" + height + ", backgroundColor="
                + backgroundColor + "]";
    }
}
