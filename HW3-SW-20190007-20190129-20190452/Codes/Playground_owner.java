import java.math.BigDecimal;
import java.util.Scanner;
public class Playground_owner {
    Scanner scan=new Scanner(System.in);
    private String Fname,Lname,Email,paasword,Confirmpass,location;
    private int age;
    private BigDecimal nationlID;
    public Playground_info p=new Playground_info();

    public void setAge(int age) {
        this.age = age;
    }
    public Playground_owner(String name,String email,String location,int age,String phone,BigDecimal nationalID,String lname,String pass,String conpass){
        this.age=age;
        this.Email=email;
        this.location=location;
        this.Fname=name;
        this.Lname=lname;
        this.nationlID=nationalID;
        this.paasword=pass;
        this.Confirmpass=conpass;
        if(conpass!=pass){
            System.out.println("the password don't much");
            System.exit(1);

        }

    }
    public Playground_owner(){

    }

    public void setEmail(String email) {
        Email = email;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setFName(String fname) {
        this.Fname = fname;
    }
    public int getAge() {
        return age;
    }
    public String getEmail() {
        return Email;
    }

    public String getLocation() {
        return location;
    }

    public String getFname() {
        return Fname;
    }


    public void setNationlID(BigDecimal nationlID) {
        this.nationlID = nationlID;
    }

    public void setLname(String lname) {
        Lname = lname;
    }

    public void setPaasword(String paasword) {
        this.paasword = paasword;
    }

    public void setConfirmpass(String confirmpass) {
        Confirmpass = confirmpass;
        if(this.paasword!=confirmpass){
            System.out.println("password don't much");
            System.exit(1);
        }
    }

    public String getLname() {
        return Lname;
    }

    public BigDecimal getNationlID() {
        return nationlID;
    }
      public void check(){
        if(this.paasword!=this.Confirmpass){
            System.out.println("password don't match");
            System.exit(1);
        }
     }
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
    public void display(){
        System.out.println("your info is:");
        System.out.println("Frist Name:"+getFname());
        System.out.println("Last name: "+getLname());
        System.out.println("Age: "+getAge());
        System.out.println("Location: "+getLocation());
        System.out.println("Email: "+getEmail());
        System.out.println("National ID: "+getNationlID());
    }
    public void addplayground(Playground_owner o){
        this.p.playgrounds.add(this.p);
        this.p.addPlayground(o);

    }
    public static void main(String[]args){
        Playground_owner p=new Playground_owner();
        p.addOwner(p);
        p.display();
    }


}
