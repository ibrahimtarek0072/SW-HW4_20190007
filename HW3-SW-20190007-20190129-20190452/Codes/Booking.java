import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

/**
 * the booking class that used to book the playground
 * @author Mohamed Adel Abdallah
 */
public class Booking {
    Scanner scan=new Scanner(System.in);
    private player Player;
    private String Ewallet,EwalletBandwidth,location;
    private float price;
    private int Pnum;
    private double BookingID;

    /**
     * set function to set the player
     * @param player
     */
    public void setPlayer(player player) {
        Player = player;
    }

    /**
     * set function to set the Ewallet
     * in this function we will check if the Ewallet is an ISP or not
     * @param ewallet
     */
    public void setEwallet(String ewallet) {
        if(ewallet!="vodafone"||ewallet!="orange"||ewallet!="etisalate"){
            System.out.println("Invalid ISP");
            return;
        }
        else{
        Ewallet = ewallet;
        }
    }

    /**
     * set function to hold the bandwidth in Ewallet
     * @param ewalletBandwidth
     */
    public void setEwalletBandwidth(String ewalletBandwidth) {
        System.out.println("Enter the charge Number");
        String c;
        Scanner scan=new Scanner(System.in);
        c=scan.nextLine();
        if(c.length()!=15){
            System.out.println("Invalid Number");
            return;
        }
        else{
            this.EwalletBandwidth=ewalletBandwidth;
        }

    }

    /**
     * function to modify Ewallet bandwidth by charging
     * @param ewalletBandwidth
     */
    public void modifyEWB(String ewalletBandwidth){
        System.out.println("Enter the charge Number");
        String c;
        Scanner scan=new Scanner(System.in);
        c=scan.nextLine();
        if(c.length()!=15){
            System.out.println("Invalid Number");
            return;
        }
        else{
            this.EwalletBandwidth=ewalletBandwidth;
        }

    }

    /**
     * set function to set the player number
     * @param pnum
     */
    public void setPnum(int pnum) {
        Pnum = pnum;
    }

    /**
     * set method to set the location
     * @param location
     */
    public void setLocation(String location) {
        this.location = location;
    }

    /**
     * set function to set the price
     * @param price
     */
    public void setPrice(float price) {
        this.price = price;
    }

    /**
     * get function to return the location
     * @return location
     */
    public String getLocation() {
        return location;
    }

    /**
     * get function to return the price
     * @return price
     */
    public float getPrice() {
        return price;
    }

    /**
     * get function to return player number
     * @return
     */
    public int getPnum() {
        return Pnum;
    }

    /**
     * set function to set the booking id
     * @param bookingID
     */
    public void setBookingID(double bookingID) {
        BookingID = bookingID;
    }

    /**
     * gvet function to get the booking id
     * @return
     */
    public double getBookingID() {
        return BookingID;
    }

    /**
     * the main method that will be used in the GoFo class
     * @param pl
     */

    public void addBooking(player pl){
        Booking b=new Booking();
        Playground_info p=new Playground_info();
        b.Player=pl;
        System.out.println("Enter the number of the players");
        int num;
        num=scan.nextInt();
        b.setPnum(num);
        System.out.println("===========================");
        System.out.println("Enter the location");
        String loc;
        loc=scan.nextLine();
        b.setLocation(loc);
        System.out.println("===========================");
        System.out.println("Enter the price");
        float price;
        price=scan.nextFloat();
        b.setPrice(price);
        System.out.println("============================");
        for(int i=0;i<p.playgrounds.size();i++){
            if(b.getPrice()==p.getPric() &&b.getLocation()==p.getLocation() &&b.getPnum()==p.getPlayer_num()){
                p.display();
                double ID=Math.random();
                System.out.println("Booking ID: "+ID);
                b.setBookingID(ID);
            }
            else{
                System.out.println("there is no such playground \n plz select other locations or price");
            }
        }

    }




    public static void main(String[]args){


    }

}
