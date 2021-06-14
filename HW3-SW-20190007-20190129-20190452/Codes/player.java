import java.util.Scanner;

/**
 * this is the player class that will be used by the players
 * @author Mohamed Adel Abdallah
 */
public class player {
    Scanner scan=new Scanner(System.in);
    private String fristName,lastName,Email,Password;
    private int age;
    public player(){

    }
    public player(String fristName,String lastName,String Email,String Password,String conPass,int age){
        this.Password=Password;
        this.age=age;
        this.fristName=fristName;
        this.lastName=lastName;
        this.Email=Email;
        if(conPass!=Password){
            System.out.println("there is no matching between password and confirming password");
            System.exit(1);
        }
    }

    /**
     * set function to set the email
     * @param email
     */
    public void setEmail(String email) {
        Email = email;
    }

    /**
     * set function to set the age
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * set function to set the frist name
     * @param fristName
     */
    public void setFristName(String fristName) {
        this.fristName = fristName;
    }

    /**
     * set function to set the last name
     * @param lastName
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * set method to set the password
     * @param password
     */
    public void setPassword(String password) {
        Password = password;
    }

    /**
     * get function to return the email
     * @return Email
     */
    public String getEmail() {
        return Email;
    }

    /**
     * get function to return the first name
     * @return firstName
     */
    public String getFristName() {
        return fristName;
    }

    /**
     * get function to return the last name
     * @return lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * get function to return the age
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * display function
     */
    public void display(){
        System.out.println("Name: "+getFristName()+" "+getLastName());
        System.out.println("Age:"+getAge());
        System.out.println("Email: "+getEmail());
    }
    public void jointeam(player pl){
        Join j=new Join();
        j.jointeam(pl);
    }

    /**
     * the main function that will be used in the GoFo class
     * @param p
     */
    public void addPlayer(player p){
        System.out.println("Enter your first name:");
        String name=scan.nextLine();
        p.fristName=name;
        System.out.println("Enter yor last name:");
        name= scan.nextLine();
        p.lastName=name;
        System.out.println("Enter your Email:");
        name=scan.nextLine();
        p.Email=name;
        System.out.println("Enter your password");
       String pass= scan.nextLine().trim();
        p.Password=pass;
        System.out.println("Enter your aga:");
        int a;
        a=scan.nextInt();
        p.age=a;
    }

    /**
     * the main function
     * @param args
     */
    public static void main(String[]args){
        player p=new player();
        p.addPlayer(p);
        p.display();
    }


    }


