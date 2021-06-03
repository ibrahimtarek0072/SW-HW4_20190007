public class Playground_owner {
    private String Fname,Lname,Email,paasword,Confirmpass,location;
    private int age,nationlID;
    public Playground_info p=new Playground_info();

    public void setAge(int age) {
        this.age = age;
    }
    public Playground_owner(String name,String email,String location,int age,String phone,int nationalID,String lname,String pass,String conpass){
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


    public void setNationlID(int nationlID) {
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

    public int getNationlID() {
        return nationlID;
    }
      public void check(){
        if(this.paasword!=this.Confirmpass){
            System.out.println("password don't much");
            System.exit(1);
        }
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
    public void displayPlaygrounds(){
        this.p.displayplaygrounds();
    }
    public static void main(String []args){
        Playground_owner o=new Playground_owner();
        o.setFName("ibrahim");
        o.setLname("tarek");
        o.setAge(20);
        o.setEmail("ibrahimtarek00072@gmail.com");
        o.setLocation("cairo");
        o.setPaasword("01146520613");
        o.setConfirmpass("01146520613");
        o.addplayground(o);
        o.displayPlaygrounds();
    }
}
