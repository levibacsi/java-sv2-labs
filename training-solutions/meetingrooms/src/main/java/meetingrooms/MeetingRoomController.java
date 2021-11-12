package meetingrooms;

import java.util.Scanner;

public class MeetingRoomController {

private Office office = new Office();

    public void readOffice() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Új tárgyaló neve?");
        String name = scanner.nextLine();
        System.out.println("új tárgyaló szélessége méterben?");
        int width = scanner.nextInt();
        System.out.println("új tárgyaló hosszúsága méterben?");
        int length = scanner.nextInt();
        MeetingRoom meetingRoom = new MeetingRoom(name, length, width);
        office.addMeetingRoom(meetingRoom);
    }

    public void printMenu(){
        System.out.println(new StringBuilder().append("1. Tárgyaló rögzítése\n")
                .append("2. Tárgyalók sorrendben\n")
                .append("3. Tárgyalók visszafele sorrendben\n")
                .append("4. Minden második tárgyaló\n")
                .append("5. Területek\n")
                .append("6. Keresés pontos név alapján\n")
                .append("7. Keresés névtöredék alapján\n")
                .append("8. Keresés terület alapján\n")
                .append("9. Kilépés"));
    }

    public void runMenu() {
        int menuNumber = 0;
        do {
            System.out.println("Kérem válasszon az alábbi menüpontok közül:");
            printMenu();


            Scanner scanner = new Scanner(System.in);
            menuNumber = scanner.nextInt();
            scanner.nextLine();
            switch (menuNumber) {
                case 1:
                    readOffice();
                    break;
                case 2:
                    office.printNames();
                    break;
                case 3:
                    office.printNamesReverse();
                    break;
                case 4:
                    office.printEvenNames();
                    break;
                case 5:
                    office.printAreas();
                    break;
                case 6:
                    System.out.println("Tárgyaló neve?");
                    String name = scanner.nextLine();
                    office.printMeetingRoomWithName(name);
                    break;
                case 7:
                    System.out.println("Tárgyaló név részlet?");
                    String namePart = scanner.nextLine();
                    office.printMeetingRoomContains(namePart);
                    break;
                case 8:
                    System.out.println("Tárgyaló minimális területe?");
                    int area = scanner.nextInt();
                    scanner.nextLine();
                    office.printAreasLargerThan(area);
                case 9:
                    break;

            }
        } while (menuNumber != 9);
    }


    public static void main(String[] args) {
        MeetingRoomController meetingRoomController = new MeetingRoomController();

        meetingRoomController.runMenu();
    }
}
