class Friend {
    // static = makes a variable or method belong to the class rather than any specific object.
    //          Commonly used for utility methods or shared resources



    static int numOfFriends; // keep track or a
    String name;

    Friend(String name){
         this.name = name;
         numOfFriends++;
    }


    
}
public class Friendeg{

    public static void main(String[] args){

        Friend f1 = new Friend("Oggy");
        System.out.println(f1.name);

        Friend f2 = new Friend("Jack");
        System.out.println(f2.name);
        System.out.println(Friend.numOfFriends); // its better to class static varibles with class name rather than its instance
    













    }}