
public class Example1 {

    public static void main(String[] args) {
        Pen p1 = new Pen(); //created a pen object called p1

        p1.setColor("blue");
        System.out.println(p1.color);

        p1.setTip(5);
        System.out.println(p1.tip);

        Student s1 = new Student();

        s1.calcPercentage(50,80,100);
        System.out.println(s1.percentage);

        s1.stName("dhanvant");
        System.out.println(s1.name);
    }

}

class Pen {

    String color;
    int tip;

    void setColor(String newColor) {
        color = newColor;
    }

    void setTip(int newTip) {
        tip = newTip;
    }
}

class Student {

    String name;
    int age;
    float percentage;

    void calcPercentage(int phy, int chem, int math) {
        percentage = (phy + chem + math) / 3;
    }

    void stName(String newName){
        name = newName;
    }
}
