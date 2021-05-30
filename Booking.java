import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class Booking {
    private player Player;
    private String Ewallet,EwalletBandwidth;

    public void setPlayer(player player) {
        Player = player;
    }

    public void setEwallet(String ewallet) {
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
        if(c.length()!=15){
            System.out.println("Invalid Number");
            return;
        }
        else{
            this.EwalletBandwidth=ewalletBandwidth;
        }

    }
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




    public static void main(String[]args){


    }

}
