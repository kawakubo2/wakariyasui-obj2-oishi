package chapter24.sample2;

public enum Color {
    WHITE("WS202-1"),
    BLACK("BS202-1"),
    GOLD("GS202-1");
    private String modelNumber;
    private Color(String modelNumber) {
        this.modelNumber = modelNumber;
    }
    public String getModelNumber() {
        return modelNumber;
    }
}
