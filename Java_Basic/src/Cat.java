public class Cat{
    private String name;
    private String color;
    private double height;
    private double weight;

    public void setWeight(double w) {
        if (w > 0) {
            weight = w;
        } else {
            System.out.println("Error: Weight must be greater than 0");
        }
    }

    public void setHeight(double h) {
        if (h > 0) {
            height = h;
        } else {
            System.out.println("Error: Height must be greater than 0");
        }
    }

    public void setName(String n) {
        name = n;
    }

    public void setColor(String c) {
        color = c;
    }

    public void upWeight(double w) {
        if (w > 0) {
            setWeight(weight + w);
        } else {
            System.out.println("Error: Value must be greater than 0");
        }
    }

    public void downWeight(double w) {
        if (w > 0) {
            setWeight(weight - w);
        } else {
            System.out.println("Error: Value must be greater than 0");
        }
    }

    public void upHeight(double h) {
        if (h > 0) {
            setHeight(height + h);
        } else {
            System.out.println("Error: Value must be greater than 0");
        }
    }
    public void defineCat(String n, String c) {
        setName(n);
        setColor(c);
    }
    public void speak() {
        System.out.println("Name: " + name);
        System.out.println("Color: " + color);
        System.out.println("Height: " + height);
        System.out.println("Weight: " + weight);
    }
}

