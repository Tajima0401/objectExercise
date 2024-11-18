package objectExercise;

public class Apartment extends Property {

    private String layout;

    public Apartment(String propertyName, String ownerName, int price, String layout) {
        super(propertyName, ownerName, "マンション", price);
        this.layout = layout;
    }

    public String getLayout() {
        return layout;
    }

    public void setLayout(String layout) {
        this.layout = layout;
    }

    public void printInfo() {
        super.printInfo();
        System.out.println("間取り：" + layout);
        System.out.println("=============================");
    }
}
