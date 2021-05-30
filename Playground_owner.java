public class Playground_owner {
    private String name,Email,location,state,phone_num;
    private int age,nationlID;

    public void setAge(int age) {
        this.age = age;
    }
    public Playground_owner(String name,String email,String location,String state,int age,String phone,int nationalID){
        this.age=age;
        this.Email=email;
        this.location=location;
        this.name=name;
        this.phone_num=phone;
        this.nationlID=nationalID;
        this.state=state;
    }
    public Playground_owner(){

    }

    public void setEmail(String email) {
        Email = email;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhone_num(String phone_num) {
        this.phone_num = phone_num;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getAge() {
        return age;
    }

    public String getPhone_num() {
        return phone_num;
    }

    public String getEmail() {
        return Email;
    }

    public String getLocation() {
        return location;
    }

    public String getName() {
        return name;
    }

    public String getState() {
        return state;
    }

    public void setNationlID(int nationlID) {
        this.nationlID = nationlID;
    }

    public int getNationlID() {
        return nationlID;
    }

    public void display(){
        System.out.println("your info is:");
        System.out.println("Name:"+getName());
        System.out.println("Age: "+getAge());
        System.out.println("Location: "+getLocation());
        System.out.println("Email: "+getEmail());
        System.out.println("State:"+getState());
        System.out.println("Phone: "+getPhone_num());
        System.out.println("National ID: "+getNationlID());
    }
}
