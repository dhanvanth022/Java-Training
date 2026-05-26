class Address {
    String city;

    Address(String city) {
        this.city = city;
    }
}

class Person {
    String name;
    Address address;

    // Constructor
    Person(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    // Shallow Copy Constructor
    Person(Person p) {
        this.name = p.name;
        this.address = p.address; // SAME reference
    }

    void display() {
        System.out.println(name + " lives in " + address.city);
    }

    public static void main(String[] args) {
        Address addr = new Address("Hyderabad");
        Person p1 = new Person("Dhanvanth", addr);

        Person p2 = new Person(p1);

        // Modify copied object
        p2.address.city = "Chennai";

        p1.display(); // changed!
        p2.display();
    }
}