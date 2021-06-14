import java.util.*;

/**
 * play ground info class that have functions to add play ground
 * @author Bassem yasser taha
 */
public class Playground_info {
    /**
     * the class have two int variable, three float variable, two string variable and playground_owner variable
     */
    Scanner scan=new Scanner(System.in);
    private int player_num;
    private float open_hur,close_hur,pric;
    private String location,playground_name;
    private Playground_owner owner;
    public ArrayList<Playground_info> playgrounds=new ArrayList<Playground_info>();
    public void setLocation(String location) {
        this.location = location;
    }

    /**
     * set method to set the closing hour
     * @param close_hur
     */

    public void setClose_hur(float close_hur) {
        this.close_hur = close_hur;
    }

    /**
     * set method to set the open hour
     * @param open_hur
     */

    public void setOpen_hur(float open_hur) {
        this.open_hur = open_hur;
    }

    /**
     * set method to set the owner
     * @param owner
     */

    public void setOwner(Playground_owner owner) {
        this.owner = owner;
    }

    /**
     * set method to set the number of the players
     * @param player_num
     */
    public void setPlayer_num(int player_num) {
        this.player_num = player_num;
    }

    /**
     * set method to set the playground name
     * @param playground_name
     */
    public void setPlayground_name(String playground_name) {
        this.playground_name = playground_name;
    }

    /**
     * set method to set the price
     * @param pric
     */
    public void setPric(float pric) {
        this.pric = pric;
    }

    /**
     * get method to return the location
     * @return location
     */

    public String getLocation() {
        return location;
    }

    /**
     * get method to return closing hour
     * @return close_hur
     */
    public float getClose_hur() {
        return close_hur;
    }

    /**
     * get method to return open hour
     * @return open_hur
     */
    public float getOpen_hur() {
        return open_hur;
    }

    /**
     * get method to return the player number
     * @return player_num
     */
    public int getPlayer_num() {
        return player_num;
    }

    /**
     * get method to return the owner
     * @return owner
     */
    public Playground_owner getOwner() {
        return owner;
    }

    /**
     * get method to return the price
     * @return price
     */
    public float getPric() {
        return pric;
    }

    /**
     * get method to return the play ground name
     * @return playground_name
     */
    public String getPlayground_name() {
        return playground_name;
    }


    /**
     * this method used to modify the price
     * @param price
     */
    public void modifyPrice(int price){
        this.pric=price;
    }

    /**
     * display function to display the playgrounds
     */

        public void display(){
        owner.display();
        System.out.println("Player numbers:"+getPlayer_num());
        System.out.println("playground location:"+getLocation());
        System.out.println("Opening Hour:"+getOpen_hur());
        System.out.println("Closing hour:"+getClass());
        System.out.println("Price ber Hour: "+getPric());
        System.out.println("Playground name: "+getPlayground_name());
    }

    /**
     * addplayground is the main function that will be used in the GoFo
     * @param owner
     */
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

    /**
     * display the storing playground that stored in the data base in any
     */
    public void displayplaygrounds(){
            for(int i=0;i<playgrounds.size();i++){
                System.out.println("Playgrouns: "+playgrounds.get(i));
            }
    }
};

