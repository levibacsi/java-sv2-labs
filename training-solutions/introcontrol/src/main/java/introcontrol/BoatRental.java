package introcontrol;

import java.util.Scanner;

public class BoatRental {
    public static void main(String[] args) {
        System.out.println("Team size?");
        Scanner scanner = new Scanner(System.in);
        int teamSize = scanner.nextInt();
        String boatTaken = "";
        String freeBoat = "";
        if (teamSize < 10) {
            {if (teamSize % 5 == 1 || teamSize % 5 == 2) {
                boatTaken = "2, ";
                }
            if (teamSize % 5 == 3) {
                    boatTaken = "3, ";
                }
            if (teamSize % 5 == 4) {
                    boatTaken = "2, 3, ";
            }
            if (teamSize >= 5 && teamSize < 10){
                    boatTaken = boatTaken + "5";
                }
            }
        }

        if (boatTaken.indexOf("2") < 0) {
            freeBoat = "2, ";
        }
        if (boatTaken.indexOf("3") < 0) {
            freeBoat = freeBoat + "3, ";
        }
        if (boatTaken.indexOf("5") < 0) {
            freeBoat = freeBoat + "5";
        }


        if (teamSize >= 10) {
            boatTaken = "2, 3, 5";
            freeBoat = "";
            System.out.println("Remaining on shore: " + (teamSize - 10));
        }
        System.out.println("Boats taken: " + boatTaken);
        System.out.println("Free boats: " + freeBoat);
        ;
    }

}
