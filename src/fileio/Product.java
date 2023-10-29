package fileio;

public class Product {
    private String code;
    private String name;
    private String desc;
    private double unitPrice;
    private int weight;
    public Product() {
        ;
    }
    public Product(String code, String name, String desc, double unitPrice, int weight) {
        this.code = code;
        this.name = name;
        this.desc = desc;
        this.unitPrice = unitPrice;
        this.weight = weight;
    }
    public String getCode() {
        return code;
    }
    public void setCode(String code) {
        this.code = code;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDesc() {
        return desc;
    }
    public void setDesc(String desc) {
        this.desc = desc;
    }
    public double getUnitPrice() {
        return unitPrice;
    }
    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }
    public int getWeight() {
        return weight;
    }
    public void setWeight(int weight) {
        this.weight = weight;
    }
    @Override
    public String toString() {
        return "Product [code=" + code + ", name=" + name + ", desc=" + desc + ", unitPrice=" + unitPrice + "]";
    }

}
