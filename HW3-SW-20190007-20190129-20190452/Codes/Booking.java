import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

//@Mohamed Adel Abdallah
public class Booking {
    Scanner scan=new Scanner(System.in);
    private player Player;
    private String Ewallet,EwalletBandwidth,location;
    private float price;
    private int Pnum;
    private double BookingID;

    //setters
    public void setPlayer(player player) {
        Player = player;
    }
    public void setEwallet(String ewallet) {
        //check if the Ewallet is a ISP or not
        if(ewallet!="vodafone"||ewallet!="orange"||ewallet!="etisalate"){
            System.out.println("Invalid ISP");
            return;
        }
        else{
        Ewallet = ewallet;
        }
    }
    public void setEwalletBandwidth(String ewalletBandwidth) {
        System.out.println("Enter the charge Number");
        String c;
        Scanner scan=new Scanner(System.in);
        c=scan.nextLine();
        //check if the serial number of the card is true يعني من الاخر بنشوف هو الرقم مكون من 15 رقم زي كارت الشحن ولا لا
        if(c.length()!=15){
            System.out.println("Invalid Number");
            return;
        }
        else{
            this.EwalletBandwidth=ewalletBandwidth;
        }

    }
    //modify Ewallet Bandwidth
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
     //setters and getters
    public void setPnum(int pnum) {
        Pnum = pnum;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getLocation() {
        return location;
    }

    public float getPrice() {
        return price;
    }
    //Pnum is the number of the player that can play in the playground

    public int getPnum() {
        return Pnum;
    }

    public void setBookingID(double bookingID) {
        BookingID = bookingID;
    }

    public double getBookingID() {
        return BookingID;
    }
    // the booking main function that will be used in GoFo class

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
            //check if the price and location are equal to the price and the location of the playgrounds that store in the data base ده لو عاملين داتا بيز يعني
            if(b.getPrice()==p.getPric() &&b.getLocation()==p.getLocation() &&b.getPnum()==p.getPlayer_num()){
                p.display();
                //using math.random to crate a random unique ID for the booking
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
