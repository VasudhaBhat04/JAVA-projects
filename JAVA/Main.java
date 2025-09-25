import java.util.Scanner; //User input - Scanner class

public class Main {
        public static void main(String[] args){

            System.out.println("Hello World!!"); // Println for new line or can add "\n"
            System.out.print("Hi everyone\n"); // This is a comment
            System.out.println("How are you??"); //sout + tab
        /* Variable = a reusable container for a value
                      a variable behaves as if it was the value it contains
                      Primitive --> simple value stored directly in memory(stack) int,double,char,boolean
                      Reference --> memory address(stack) that points to heap   string,array,object
         Steps to creating a variable
         1.declaration
         2.assignment

         */
         String S = "Engineering student";
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
        double height = scanner.nextDouble();
        
        System.out.print("Are you a student? "); 
        boolean isStudent = scanner.nextBoolean();
        
        System.out.println("Hello " +name);

        if(age<18){
            System.out.println("Sorry bro u can't cast vote");
        }else
        System.out.println("Vote for right leader!!");

        System.out.println("You're" +height+ "cms");
        if(isStudent){
            System.out.println("Hello champ!!");
        }else{
            System.out.println("Hello there!");
        }

        scanner.close(); //Close your scanner object
        
    
    
    
    
    
    
    
    
    
    
        
    
    
    }

// This is a comment
/* This
    is
    a
    multi-line
    comment
 */
}
