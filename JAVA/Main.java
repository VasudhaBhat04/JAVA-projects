import java.util.Scanner; //User input - Scanner class
import java.util.Random;
public class Main {
        public static void main(String[] args){

           /* System.out.println("Hello World!!"); // Println for new line or can add "\n"
            System.out.print("Hi everyone\n"); // This is a comment
            System.out.println("How are you??"); //sout + tab
         Variable = a reusable container for a value
                      a variable behaves as if it was the value it contains
                      Primitive --> simple value stored directly in memory(stack) int,double,char,boolean
                      Reference --> memory address(stack) that points to heap   string,array,object
         Steps to creating a variable
         1.declaration
         2.assignment

         */
         /*String S = "Engineering student";
         int year = 2025 ;
         double gpa=3.79;
         char grade ='A';
         boolean isTopper = false;


        System.out.println("Hi i am a " + S + " of batch " + year + ", my gpa is "+ gpa + " with " +grade+ " grade");
        if(isTopper){
            System.out.println( "No! no! not a topper");
        } else
        System.out.println("Rarely study");

        //User input import scanner
        //Scanner scanner_object_name = new Scanner(System.in);

         Scanner scanner = new Scanner(System.in); //scanner object

        System.out.print("Enter your name: ");
        String name = scanner.nextLine(); //nextLine reads string with space while .next() doesn't
        
        System.out.print("Enter your age: "); 
        int age = scanner.nextInt();  //.nextInt reads only integer

        System.out.print("Enter your height: "); 
        double height = scanner.nextDouble(); //.nextDouble reads double
        
        System.out.print("Are you a student? "); 
        boolean isStudent = scanner.nextBoolean(); //.for boolean variables
        
        System.out.println("Hello " +name);

        if(age<18){
            System.out.println("Sorry bro u can't cast vote");
        }else
        System.out.println("Vote for right leader!!");

        System.out.println("You're " +height+ " cms");
        if(isStudent){
            System.out.println("Hello champ!!");
        }else{
            System.out.println("Hello there!");
        }

        
        
       //If u accept int/ double first .nextInt() or .nextDouble() & then accept String the new line character buffer still be there hence use .nextLine() before accepting any string input

       System.out.print("Enter the no.of flowers you got: "); 
       int flower = scanner.nextInt();
        
       scanner.nextLine(); //use this to avoid buffer newline problem ( condition if u use nextInt() or nextDouble() before nextLine() )

       System.out.print("Enter the color of flowers you got: "); 
       String color = scanner.nextLine();
       
    
       System.out.println("You got " +flower+ " " +color+ " coloured flowers!!");
    
       scanner.close(); //Close your scanner object 

      //if - statements = performs a block of code if its condition is true 
      
      Scanner s = new Scanner(System.in);

      System.out.print("Enter your age: "); 
      int age = s.nextInt();

      if (age>=65){
        System.out.println("You're a senior!");
      }else if (age>=18){
        System.out.println("You're an adult!");
      } else if (age < 0){
        System.out.println("You haven't been born yet!");
      }else if(age == 0){
       System.out.println("You're a baby <3");
      } else
      System.out.println("You're a child !");
    
      s.close(); 
    
     //Random object - import Random from utils at top of your code
     //Random random_object_name = new Random();
        
    Random random = new Random();

    int num = random.nextInt(12, 18); //between 12 & 18 , & lso 12 not 18c
    System.out.println(num);
     //Only .nextInt(). Range -ve 2B to +ve 2B hence use .nextInt(Inclusive, Exclusive)
    double dec = random.nextDouble(1, 2); //between 0 & 1 or give origin & bounds
    System.out.println(dec);

    boolean isHeads = random.nextBoolean(); //random boolean
    if(isHeads){
    System.out.println("Heads !!");
    }else 
    System.out.println("Tails !!");

    //Math class (caps M) Math
    System.out.println(Math.PI);
    System.out.println(Math.pow(2,3)); //.pow is for double .powExact is for int
    System.out.println(Math.E);
    System.out.println(Math.abs(-5));
    System.out.println(Math.abs(-5));
    System.out.println(Math.round(1.234));
    System.out.println(Math.sqrt(625));
    System.out.println(Math.ceil(3.14)); //round up
    System.out.println(Math.floor(3.14)); //round down
    System.out.println(Math.max(99,100));
    System.out.println(Math.min(99,100));
    System.out.println(Math.multiplyExact(99,100));
    double a = 5, b = 3, c;
    c = Math.sqrt(Math.pow(a,2) + Math.pow(b,2));
    System.out.println(Math.ceil(c)); */
     
    // printf() in JAVA used to formatted output
    /* Format Specifiers: These begin with a percent sign (%) and are followed by characters that indicate the data type and desired formatting. Common specifiers include:
       %s: for strings
       %d: for integers
       %f: for floating-point numbers (doubles, floats)
       %c: for characters   
       %b: for booleans
       %t: for date/time formatting (requires additional time-related specifier*/
         String S = "Engineering student";
         int year = 2025 ;
         double gpa=3.793456;
         char grade ='A';
         boolean isEmployed = false;


        System.out.printf("Hi i am a  %s  of batch  %d , my gpa is  %.2f  with  %c  grade and Employement status:%b %n",S,year,gpa,grade,isEmployed);
        
    /*flags before specifiers you add it

       + = outputs a plus
       , = comma grouping separator
       ( = negative no.s are enclosed within ()
        space = dispaly minus if negative, display space if positive
     */

        double p1 = 9000.99;
        double p2 = 10000000.15;
        double p3 = -36000.23;
       
        System.out.printf("% .3f\n", p1);
        System.out.printf("%+,.2f%n", p2); // %n = \n new line character but only in printf
        System.out.printf("%(.3f\n", p3);
        /*OUTPUT
            9000.990
          +10,000,000.15
          (36000.230)
         */



   

// This is a comment
/* This
    is
    a
    multi-line
    comment
 */
} }
