import java.util.Scanner;
public class Maintwo {
    public static void main(String []args){
     
        //String methods 
        String name = "Java course";
        String name2 = "Python course";

        System.out.println(name.length());
        System.out.println(name.charAt(3));
        System.out.println(name.indexOf("a"));
        System.out.println(name.lastIndexOf("a")); //counts from last
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());
        System.out.println(name.replace("J","M"));
        System.out.println(name.isEmpty());
        System.out.println(name.trim()); //starting & ending spaces are trimmed
        System.out.println(name.contains("v"));
        System.out.println(name.equals("java course"));//Case sensitivity
        System.out.println(name.equalsIgnoreCase("java course"));
        System.out.println(name.compareTo("Java course")); //lelexicographical comparision
        System.out.println(name.toCharArray());
        System.out.println(name.startsWith("Java"));//This method returns true if string starts with this prefix.
        System.out.println(name2.concat(" 2025"));
       
       
       
        //.substring() = A method used to extract a protion of substring
        //               .substring(start, end)

        String email = "HollowKnight@gmail.com";
        String username = email.substring(0,12); //0 will be included , 12 is excluded
        String domain = email.substring(13);
        String name3 = email.substring(email.indexOf("@")+ 1 );


        System.out.println(username);
        System.out.println(domain);
        System.out.println(name3);

        //ternary operator 
        // variable = (condition) ? ifTrue : ifFalse ;

        int score = 55;
        String PassOrFail = (score >= 60) ? "PASS" : "Fail";
        System.out.println(PassOrFail);

        //Enhanced Switch = A replacement to many else if statements
        Scanner s = new Scanner(System.in);
        System.out.print("Enter your choice of day: ");
        String day = s.nextLine();
         
         switch(day){
                case "Monday" -> System.out.println("It is a weekday");
                case "Tuesday" -> System.out.println("It is a weekday");
                case "Wednesday" -> System.out.println("It is a weekday");
                case "Thursday" -> System.out.println("It is a weekday");
                case "Friday" -> System.out.println("It is a weekday");
                case "Saturday" -> System.out.println("It is a weekend");
                case "Sunday" -> System.out.println("It is a weekend");
                default -> System.out.println("Not a day");
         }
         s.close();

















    }
}
