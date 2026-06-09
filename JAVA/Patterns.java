//import java.util.*;


public class Patterns {
    public static void main(String[] args){ {
        //Solid rectangle
       /*  for(int i = 1;i<=4;i++){
              for(int j = 1;j<=5;j++){
                  System.out.print("*");
        }
            System.out.println("");
        }
             
           //Hollow rectangle
           for(int i = 1;i<=4;i++){
              for(int j = 1;j<=5;j++){
                  if ( (i == 1 || j == 1 || i == 4 || j == 5) )
                  System.out.print("*");
                  else 
                   System.out.print(" ");
        } 
            System.out.println("");
        }
       //Half pyramid
       
       for(int i = 1;i<=4;i++){
              for(int j = 1;j<=i;j++){
                  
                  System.out.print("*");
                 
        } 
            System.out.println("");
        } 
    //Inverted half pyramid
        for(int i = 4;i>=1;i--){
              for(int j = 1;j<=i;j++){
                  
                  System.out.print("*");
                 
        } 
            System.out.println();
        }
       //Half pyramid Mirrored

      int n = 4, m=5;
        for(int i = 1;i<=n;i++){
              for(int j = 1;j<=n-i;j++){
                   System.out.print(" "); //For loof --> spaces
              }
                  for(int j = 1;j<=i;j++){
                   System.out.print("*"); //For loof --> stars
              } System.out.println("");
        }
       // Half pyramid (NUMBERS)
       int n = 5, m=5;
        for(int i = 1;i<=n;i++){
                  for(int j = 1;j<=i;j++){
                   System.out.print(j+" "); 
              } System.out.println("");
        }
        //Inverted half pyramid numbers 
         int n = 5, m=5;
        for(int i = n;i>=1;i--){
                  for(int j = 1;j<=i;j++){
                   System.out.print(j+" "); 
              } System.out.println("");
}
    
       // floyd's triangle
       int n = 5, m=5;
        int count = 1;
        for(int i = 1;i<=n;i++){
                  for(int j = 1;j<=i;j++){
                   System.out.print(count+ " "); 
                   count ++;
              } System.out.println("");
        }
        
       // 0-1 triangle
       int n = 5, m=5;
        for(int i = 1;i<=n;i++){
                  for(int j = 1;j<=i;j++){
                      if ((i+j)%2 == 0)
                   System.out.print("1"); //even cell sums
                   else
                   System.out.print("0"); //odd cell sum
              } System.out.println("");
        }*/
       //Butterfly pattern
        




    
}
    }}