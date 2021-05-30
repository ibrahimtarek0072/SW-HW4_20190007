public class player {
    private String fristName,lastName,Email,Password,ConfirmPassword;
    private int age;
    public player(){

    }
    public player(String fristName,String lastName,String Email,String Password,String conPass,int age){
        this.Password=Password;
        this.ConfirmPassword=conPass;
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

    public void setConfirmPassword(String confirmPassword) {
        ConfirmPassword = confirmPassword;
    }
    public void confirmPass(){
        if(this.Password !=this.ConfirmPassword){
            System.out.println("there is no matching between password and confirming password");
            System.exit(1);
        }
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
}
