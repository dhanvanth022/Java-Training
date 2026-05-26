//Get and Set : The get method returns the variable value, and the set method sets the value.

public class Example3 {

    public static void main(String[] args) {
        Pen p1 = new Pen();
        p1.setColor("Blue");
        System.out.println(p1.getColor());

        p1.setTip(5);
        System.out.println(p1.getTip());

        p1.setColor("Red");
        System.out.println(p1.getColor());
    }
}

class Pen {

    private String color;
    int tip;

    String getColor() {
        return this.color;
    }

    int getTip() {
        return this.tip;
    }

    void setColor(String newColor) {
        this.color = newColor;
    }

    void setTip(int tip) {
        this.tip = tip;
    }
}
