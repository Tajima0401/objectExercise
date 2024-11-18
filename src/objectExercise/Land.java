package objectExercise;

public class Land extends Property {

    private double area;

    public Land(String propertyName, String ownerName, int price, double area) {
        super(propertyName, ownerName, "土地", price);
        this.area = area;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

     public void printInfo() {
        super.printInfo();
        System.out.println("広さ：" + area + "㎡");
        System.out.println("=============================");
    }
}