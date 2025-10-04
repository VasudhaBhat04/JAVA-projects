import java.util.Scanner;
import java.util.Arrays;
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
        System.out.println(name.endsWith("Java"));//False
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
                case "Saturday", "Sunday" -> System.out.println("It is a weekend"); //can separte same cases with comma
                default -> System.out.println("Not a day"); 

         }
         s.close();

        //String builder
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" World");
        System.out.println(sb); // Hello World

        sb.insert(5, " Java");
        System.out.println(sb); // Hello Java World

        sb.delete(5, 10);
        System.out.println(sb); // Hello World

        sb.reverse();
        System.out.println(sb); // dlroW olleH


        //Arrays

        int[] a ={100,200,300,400,500,600,700,800,900,1000};
        a[3] = 9000;
        System.out.println(a[3]);
        System.out.println(a.length);
         
        for (int i:a){ //Enhanced for loop for(return type variable) or for-each loop
            System.out.println(i);
        }
        
        String[] flower ={"Rose","Lillies","Lotus","Jasmine","Diasies","Hibiscus"};
        
        System.out.println(flower[3]);
        System.out.println(flower.length);
        Arrays.sort(flower);//sorts
        System.out.println(Arrays.toString(flower)); // Returns a string representation of a 1D array.Arrays.deepToString() for multiD arrays\

        
        Arrays.fill(flower,"Marigolds"); //fills array elements with Marigolds
        System.out.println(Arrays.toString(flower));

        Arrays.fill(flower, 2, 4, "Marigold"); //[Rose, Lillies, Marigold, Marigold, Diasies, Hibiscus]
        System.out.println(Arrays.toString(flower));

        //Taking user input for array(static memory)
       Scanner sc = new Scanner(System.in);
       String[] foods;
       int size;

       System.out.println("How many # of food do you want??");
       size = sc.nextInt();

       sc.nextLine();

       foods = new String[size];

       for(int i=0;i<foods.length;i++){
       System.out.print("Enter a food: ");
       foods[i] = sc.nextLine();
       }

        for(String food : foods){
            System.out.println(food);
        }

        sc.close();

        // 1. Arrays.sort()
        int[] numbers = {5, 2, 9, 1, 3};
        Arrays.sort(numbers);
        System.out.println("Sorted numbers: " + Arrays.toString(numbers));

        // 2. Arrays.toString() / Arrays.deepToString()
        String[] fruits = {"Apple", "Orange", "Banana"};
        System.out.println("Fruits array: " + Arrays.toString(fruits));

        String[][] foods2D = {
            {"Dosa", "Idli"},
            {"Pizza", "Pasta"}
        };
        System.out.println("2D foods array: " + Arrays.deepToString(foods2D));

        // 3. Arrays.equals() / Arrays.deepEquals()
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {1, 2, 3};
        int[][] arr2D1 = {{1,2},{3,4}};
        int[][] arr2D2 = {{1,2},{3,4}};

        System.out.println("arr1 equals arr2? " + Arrays.equals(arr1, arr2));
        System.out.println("arr2D1 deepEquals arr2D2? " + Arrays.deepEquals(arr2D1, arr2D2));

        // 4. Arrays.copyOf() / Arrays.copyOfRange()
        int[] copy1 = Arrays.copyOf(arr1, 5); // extra spaces filled with 0
        System.out.println("Copy of arr1 with length 5: " + Arrays.toString(copy1));

        int[] copy2 = Arrays.copyOfRange(arr1, 1, 3); // from index 1 to 2
        System.out.println("Copy of arr1 from index 1 to 2: " + Arrays.toString(copy2));

        // 5. Arrays.fill()
        int[] filledArray = new int[5];
        Arrays.fill(filledArray, 7);
        System.out.println("Filled array: " + Arrays.toString(filledArray));

        // 6. Arrays.binarySearch()
        int[] searchArray = {1, 3, 5, 7, 9};
        int index = Arrays.binarySearch(searchArray, 5);
        System.out.println("Index of 5 in searchArray: " + index);

        // If element not found
        int notFound = Arrays.binarySearch(searchArray, 4);
        System.out.println("Index of 4 in searchArray (not found): " + notFound);

    }
}
