
// super keyword : In Java, the super keyword is used to refer to the parent class of a subclass.

class Animal{
    String color;
    Animal(){
        System.out.println("animal constructor called");
    }
}

class Horse extends Animal{
    Horse(){
        super.color = "Browm";
        System.out.println("Hourse constructor is called");
    }
}



class Example17{
    public static void main(String[] args){
        Horse h = new Horse();
        System.out.println(h.color);
    }
}