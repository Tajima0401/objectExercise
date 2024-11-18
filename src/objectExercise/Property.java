package objectExercise;

public class Property {

	private String propertyName;
    private String ownerName;
    private String propertyType;
    private int price;

    public Property(String propertyName, String ownerName, String propertyType, int price) {
        this.propertyName = propertyName;
        this.ownerName = ownerName;
        this.propertyType = propertyType;
        this.price = price;
    }

    public String getPropertyName() {
        return propertyName;
    }

    public void setPropertyName(String propertyName) {
        this.propertyName = propertyName;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getPropertyType() {
        return propertyType;
    }

    public void setPropertyType(String propertyType) {
        this.propertyType = propertyType;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void printInfo() {
        System.out.println("=============================");
        System.out.println("物件名：" + propertyName);
        System.out.println("物件所有者名：" + ownerName);
        System.out.println("物件種別：" + propertyType);
        System.out.println("物件価格：" + price + "円");
    }
}