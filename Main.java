public class Main {
    public static void main(String[] args) {
        String name = "Robby";
        String birthday = "08/21/2024";

        System.out.println("Welcome to CS 112!");

        

        askHowDoing(name);
        System.out.println(userBirthday(birthday));


    }

    public static String userBirthday(String birthday) {
        String personBirthday = "Robby's birthdate is "+ birthday;
        return personBirthday;
    }
    
    public static void askHowDoing(String name) {
        System.out.println("How are you doing? " + name);
    } 
}