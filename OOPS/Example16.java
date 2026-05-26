//  Static keyword: Static keyword in java is used to share the same variable or method of a given class.

class Student{

    static int returnPercentage(int mat, int che, int phy){
        return (mat + che+phy) /3;
    }
    String name;
    int roll;

    static String schoolName;

    void setName(String name){
        this.name = name;
    }

    String getName(){
        return this.name;
    }

}

class Example16{
    public static void main(String[] args){
        Student s1 = new Student();
        s1.schoolName = "Sri chaitanya";

        Student s2 = new Student();
        System.out.println(s2.schoolName);

        Student s3 = new Student();
        System.out.println(s3.schoolName);
        System.out.println(s3.returnPercentage(30,50,60));

        
    }
}