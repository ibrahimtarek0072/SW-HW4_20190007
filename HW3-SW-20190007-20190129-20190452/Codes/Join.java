import java.util.ArrayList;
import java.util.Scanner;
// in the whole code we didn't use agrs or inherit because the whole code in the same package
// @ Bassem Yasser ده الجزء التاني بتاعك ياعلق بردوا
public class Join {
    private double BookingID;
     public ArrayList<player> team=new ArrayList<player>();
    public String pPosition;
    Scanner scan=new Scanner(System.in);
    // Setters
    public void setBookingID(double bookingID) {
        BookingID = bookingID;
    }

    public void setpPosition(String pPosition) {
        this.pPosition = pPosition;
    }


    //getters
    public double getBookingID() {
        return BookingID;
    }

    public String getpPosition() {
        return pPosition;
    }

    // this is the main function that will be used in the GoFo class it takes variable it's type is player

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
