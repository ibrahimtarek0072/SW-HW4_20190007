import java.util.ArrayList;
import java.util.Scanner;

/**
 * this is the join class that will be used to join team
 * @author Bassem Yasser Taha
 */
public class Join {
    private double BookingID;
     public ArrayList<player> team=new ArrayList<player>();
    public String pPosition;
    Scanner scan=new Scanner(System.in);
    public void setBookingID(double bookingID) {
        BookingID = bookingID;
    }

    /**
     * set function to set the position of the player
     * @param pPosition
     */
    public void setpPosition(String pPosition) {
        this.pPosition = pPosition;
    }

    /**
     * get function to get the booking ID
     * @return BookinID
     */
    public double getBookingID() {
        return BookingID;
    }

    /**
     * get function to get the player position
     * @return pPosition
     */
    public String getpPosition() {
        return pPosition;
    }

    /**
     * that main function that will be use in GoFo class
     * @param pl
     */
    public void jointeam(player pl){
        Join j=new Join();
        Booking b=new Booking();
        System.out.println("Enter the Booking ID");
        double ID;
        ID=scan.nextDouble();
        j.setBookingID(ID);
        System.out.println("=======================");
        if(j.getBookingID()==b.getBookingID()){
            System.out.println("Enter your position");
            String po;
            po=scan.next();
            j.setpPosition(po);
            j.team.add(pl);
        }
        else{
            System.out.println("Error ID");
        }
    }
}
