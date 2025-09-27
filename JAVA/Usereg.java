class User {

    String username;
    String email;
    int age;
    
    // Overloaded constructors --> same name, different no.,type or order of params
    //Allow a class to have multiple constructors with different parameter lists
    //Enable objects to be initialized in various ways/
    
    
    User(String username){
        this.username = username;
        this.email = "Not provided";
        this.age = 0;
    }

    User(String username, String email){
        this.username = username;
        this.email = email;
        this.age = 0;
    }
    
}
public class Usereg{

    public static void main(String[] args){
    
    
    User u1 = new User("Dunkin");
    User u2 = new User("Miya","miya123@gmail.com");
    
    System.out.println(u1.username);
    System.out.println(u1.email);
    System.out.println(u1.age);
    
    System.out.println(u2.username);
    System.out.println(u2.email);
    System.out.println(u2.age);
    



    }
}

