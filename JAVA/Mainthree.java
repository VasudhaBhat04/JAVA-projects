public class Mainthree {

    static int x = 3; //CLASS VARIABLE
    public static void main(String[] args){
        //method or function = a block of reusable code that is executed when called ()
    happyBirthday(); //method call
    happyBirthday(); // can call mutiple times

    
    happyBirthday("Yuno"); 

    System.out.println(add(5,3));

    System.out.println(add(3.4,5.2));

    //int x = 1;
    //System.out.println(x);//LOCAL VARIBALE 
    dosomething();
    System.out.println(adde(1,2,3,4,6));
    
    }
    //method definition
    static void happyBirthday(){
        System.out.println("Happy birthday to you");
    }
    // method with parameters
    static void happyBirthday(String name){
       System.out.println("Happy Birthday, " + name + "!"); 
    }
    //method with return type
    static int add(int a, int b) {
        return a + b;   // returns an int
    }
    static double add(double a, double b){ //Method Overloading (same name, different parameters)
        return a + b; //returns a double
    }
    static void dosomething(){
        int x =2;  //LOCAL VARIABLE
        System.out.println(x);  //LOCAL VARIABLE > CLASS VARIABLE
    }
    //varargs = allow a method to accept varying # of arguments
    //          makes method more flexible, no need for overloaded method
    //          java will pack the arguments into arra
    
    static int adde(int... numbers){ //Variable amout of int arguments can be sent
        int sum = 0;
        for(int number : numbers){
            sum+=number;
        }
       return sum;
    }

}
