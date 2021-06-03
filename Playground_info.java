import java.util.*;
public class Playground_info {
    Scanner scan=new Scanner(System.in);
    private int player_num;
    private float open_hur,close_hur,pric;
    private String location,playground_name;
    private Playground_owner owner;
    public ArrayList<Playground_info> playgrounds=new ArrayList<Playground_info>();
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

    public void setPric(float pric) {
        this.pric = pric;
    }

    public float getPric() {
        return pric;
    }
    public void modifyPrice(int price){
        this.pric=price;
    }

    public void setPlayground_name(String playground_name) {
        this.playground_name = playground_name;
    }

    public String getPlayground_name() {
        return playground_name;
    }

    public void display(){
        owner.display();
        System.out.println("Player numbers:"+getPlayer_num());
        System.out.println("playground location:"+getLocation());
        System.out.println("Opening Hour:"+getOpen_hur());
        System.out.println("Closing hour:"+getClass());
        System.out.println("Price ber Hour: "+getPric());
        System.out.println("Playground name: "+getPlayground_name());
    }
    public void addPlayground(Playground_owner owner){
        Playground_info p=new Playground_info();
        p.owner=owner;
        System.out.println("Enter the plaGround Name");
        String playground_name;
        playground_name=scan.nextLine().trim();
        System.out.println("===========================");
        p.playground_name=playground_name;
        System.out.println("Enter how many player in this playground");
        int num;
        num=scan.nextInt();
        p.player_num=num;
        System.out.println("============================");
        System.out.println("Enter the location");
        String loc;
        loc=scan.nextLine().trim();
        p.location=loc;
        System.out.println("============================");
        System.out.println("Enter the price ber hour");
        float pric;
        pric=scan.nextFloat();
        p.pric=pric;
        System.out.println("-===========================");
        System.out.println("Enter the opening hour");
        float op;
        op=scan.nextFloat();
        p.open_hur=op;
        System.out.println("=============================");
        System.out.println("Enter the colsing hour");
        float ch;
        ch=scan.nextFloat();
        p.close_hur=ch;
        p.playgrounds.add(p);

    }
    public void displayplaygrounds(){
            for(int i=0;i<playgrounds.size();i++){
                System.out.println("Playgrouns: "+playgrounds.get(i));
            }
    }
};

