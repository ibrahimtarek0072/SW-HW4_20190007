import sun.security.util.Password;

import java.util.Scanner;

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

    public void setEmail(String email) {
        Email = email;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setFristName(String fristName) {
        this.fristName = fristName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setPassword(String password) {
        Password = password;
    }
    public String getEmail() {
        return Email;
    }

    public String getFristName() {
        return fristName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }
    public void display(){
        System.out.println("Name: "+getFristName()+" "+getLastName());
        System.out.println("Age:"+getAge());
        System.out.println("Email: "+getEmail());
    }
    public void jointeam(player pl){
        Join j=new Join();
        j.jointeam(pl);
    }
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
    public static void main(String[]args){
        player p=new player();
        p.addPlayer(p);
        p.display();
    }


    }


