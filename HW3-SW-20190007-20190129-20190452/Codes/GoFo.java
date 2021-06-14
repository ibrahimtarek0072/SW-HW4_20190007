import java.util.*;

/**
 * the main app class that will run all the other class
 * @author Ibrahim Tarek Mohamed
 */
public class GoFo {
    /**
     * the main method
     * in main method the user will select between the app function
     * @param args
     */
    public static void main(String[]args){

        Scanner scan=new Scanner(System.in);

        while(true){

            System.out.println("Log in as \n"+"1-player \n"+"2-Playground owner \n"+"3-Exit");
            int selected;
            selected=scan.nextInt();
        switch (selected){
            case 1:{
                /**
                 * case chose sing in as a player select the methods of player class & Booking @ join
                 */
                player p=new player();
                p.addPlayer(p);
                while (true){
                    System.out.println("1-display info \n"+"2-Book a Playground \n"+"3-join team \n"+"4-Exit");
                    int selected2;
                    selected2=scan.nextInt();
                    switch (selected2){
                        case 1:{
                            p.display();
                            break;
                        }
                        case 2:{
                            Booking b=new Booking();
                            b.addBooking(p);
                            break;
                        }
                        case 3:{
                            p.jointeam(p);
                            break;
                        }
                        case 4:{
                            return;
                        }
                    }
                }

            }
            case 2:{
                /**
                 * case sing in as a playground owner use the method of playground_owner & playground_info
                 */
                Playground_owner o=new Playground_owner();
                o.addOwner(o);
                while (true){
                    System.out.println("1-add playground \n"+"2-Exit");
                    int selected2;
                    selected2=scan.nextInt();
                    switch (selected2){
                        case 1:{
                            o.addplayground(o);
                            break;
                        }
                        case 2:{
                            return;
                        }
                    }
                }
            }
            case 3:{
                System.out.println("thanks for using our app");
                return;
            }
        }
        }
        

    }
}
