public class Playground_info {
    private int player_num;
    private float open_hur,close_hur;
    private String location;
    private Playground_owner owner;

    public void setLocation(String location) {
        this.location = location;
    }

    public void setClose_hur(float close_hur) {
        this.close_hur = close_hur;
    }

    public void setOpen_hur(float open_hur) {
        this.open_hur = open_hur;
    }

    public void setOwner(Playground_owner owner) {
        this.owner = owner;
    }

    public void setPlayer_num(int player_num) {
        this.player_num = player_num;
    }

    public String getLocation() {
        return location;
    }

    public float getClose_hur() {
        return close_hur;
    }

    public float getOpen_hur() {
        return open_hur;
    }

    public int getPlayer_num() {
        return player_num;
    }

    public Playground_owner getOwner() {
        return owner;
    }
    public void display(){
        owner.display();
        System.out.println("Player numbers:"+getPlayer_num());
        System.out.println("playground location:"+getLocation());
        System.out.println("Opening Hour:"+getOpen_hur());
        System.out.println("Closing hour:"+getClass());
    }
    public static void main(String[]args){
        Playground_info p=new Playground_info();
        p.setLocation("cairo");
        p.setClose_hur(10);
        p.setOpen_hur(8);
        p.setPlayer_num(10);
        Playground_owner o=new Playground_owner("ibrahim","ibrahimtarek00072@gmail.com","cairo","single",20,"01146520613",1412001);
        p.setOwner(o);
        p.display();
    }
};

