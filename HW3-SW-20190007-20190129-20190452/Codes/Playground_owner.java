import java.math.BigDecimal;
import java.util.Scanner;

/**
 * this class have the function that the owner will need to
 * @author Ibrahim tarek mohamed
 */
public class Playground_owner {
    Scanner scan=new Scanner(System.in);
    /**
     * create five string variable one integer and on big decimal
     * first string param
     * @param Fname hold first name
     * @param Lname hold the last name
     * @oaram Email hold email address
     * @param password hold the password
     * @param location hold the location
     * second integer param
     * @param age hold the age
     * third big decimal param
     * @param nationaID hod the national id
     */
    private String Fname,Lname,Email,paasword,location;
    private int age;
    private BigDecimal nationlID;
    public Playground_info p=new Playground_info();

    /**
     * method set age to take the age
     * @param age
     */

    public void setAge(int age) {
        this.age = age;
    }

    /**
     * constractor with param
     * @param name
     * @param email
     * @param location
     * @param age
     * @param phone
     * @param nationalID
     * @param lname
     * @param pass
     * @param conpass
     */
    public Playground_owner(String name,String email,String location,int age,String phone,BigDecimal nationalID,String lname,String pass,String conpass){
        this.age=age;
        this.Email=email;
        this.location=location;
        this.Fname=name;
        this.Lname=lname;
        this.nationlID=nationalID;
        this.paasword=pass;
        if(conpass!=pass){
            System.out.println("the password don't much");
            System.exit(1);

        }

    }

    public Playground_owner(){

    }

    /**
     * method to set the email
     * @param email
     */
    public void setEmail(String email) {
        Email = email;
    }

    /**
     * method to set the location
     * @param location
     */

    public void setLocation(String location) {
        this.location = location;
    }

    /**
     * method set to first name
     * @param fname
     */

    public void setFName(String fname) {
        this.Fname = fname;
    }
    /**
     * set method to set the national id
     * @param nationlID
     */


    public void setNationlID(BigDecimal nationlID) {
        this.nationlID = nationlID;
    }

    /**
     * set method to get the Last name
     * @param lname
     */

    public void setLname(String lname) {
        Lname = lname;
    }

    /**
     * set method to get password
     * @param paasword
     */
    public void setPaasword(String paasword) {
        this.paasword = paasword;
    }

    /**
     * get method to return the age
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * get method to return the email
     * @return Email
     */
    public String getEmail() {
        return Email;
    }

    /**
     * get method to return the location
     * @return location
     */

    public String getLocation() {
        return location;
    }

    /**
     * get method to return first name
     * @return Fname
     */

    public String getFname() {
        return Fname;
    }

    /**
     * get method to return the last name
     * @return Lname
     */
    public String getLname() {
        return Lname;
    }

    /**
     * get method to return the national ID
     * @return
     */

    public BigDecimal getNationlID() {
        return nationlID;
    }

    /**
     * addOwner is the main function that take param playground_owner
     * this function is the main function that will be used in GoFo app
     * @param p
     */
    public void addOwner(Playground_owner p){
        System.out.println("Enter your first name:");
        String name=scan.nextLine();
        p.Fname=name;
        System.out.println("Enter yor last name:");
        name= scan.nextLine();
        p.Lname=name;
        System.out.println("Enter your Email:");
        name=scan.nextLine();
        p.Email=name;
        System.out.println("Enter your password");
        String pass= scan.nextLine().trim();
        p.paasword=pass;
        System.out.println("Enter your location:");
        name=scan.nextLine();
        p.location=name;
        System.out.println("Enter your aga:");
        int a;
        a=scan.nextInt();
        p.age=a;
        System.out.println("Enter your National ID");
            BigDecimal n;
            n=scan.nextBigDecimal();
            p.nationlID=n;
        System.out.println("Thanks for using this app");
    }

    /**
     * display function to display info
     */
    public void display(){
        System.out.println("your info is:");
        System.out.println("Frist Name:"+getFname());
        System.out.println("Last name: "+getLname());
        System.out.println("Age: "+getAge());
        System.out.println("Location: "+getLocation());
        System.out.println("Email: "+getEmail());
        System.out.println("National ID: "+getNationlID());
    }

    /**
     * add playground function to add playground
     * take playground_owner param
     * @param o
     */
    public void addplayground(Playground_owner o){
        this.p.playgrounds.add(this.p);
        this.p.addPlayground(o);

    }

    /**
     * main function
     * @param args
     */
    public static void main(String[]args){
        Playground_owner p=new Playground_owner();
        p.addOwner(p);
        p.display();
    }


}
