class Student {
   
    String name;
    int age;
    double gpa;
    boolean enrolled;

    Student(String name,int age,double gpa){ //Constructor :A constructor is a special method in a class that gets called automatically when you create an object.
                                             // It has the same name as the class and no return type
    this.name = name; //To differentiate between instance variables and local variables we use this variable
    this.age = age;  // "this.age" = instance variable, age = constructor parameter
    this.gpa = gpa;
    }
    void study(){
        System.out.println(this.name+" is studying");
    }
    
}
public class Studenteg{

    public static void main(String[] args){
   

    Student s1 = new Student("Maya",21,8.9); //Object creation
    Student s2 = new Student("Raga",21,7.8);
    System.out.println(s1.name);
    System.out.println(s2.age);
    s2.study();
    }}
