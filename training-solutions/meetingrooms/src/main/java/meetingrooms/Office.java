package meetingrooms;

import java.util.ArrayList;
import java.util.List;

public class Office {
    private List<MeetingRoom> meetingRooms = new ArrayList<>();

    public List<MeetingRoom> getMeetingRooms() {
        return meetingRooms;
    }

    public void addMeetingRoom(MeetingRoom meetingRoom){
        meetingRooms.add(meetingRoom);
    }

    public void printNames(){
        System.out.println("Tárgyalók:");
        for (MeetingRoom rooms: getMeetingRooms()){
            System.out.print(rooms.getName() + " ");
        }
        System.out.println();
    }

    public void printNamesReverse(){
        System.out.println("Tárgyalók visszafelé:");
        for (int i = meetingRooms.size()-1; i >= 0; i--){
            System.out.print(getMeetingRooms().get(i).getName() + " ");
        }
        System.out.println();
    }

    public void printEvenNames(){
        System.out.println("Minden második tárgyaló:");
        for (int i = 1; i < meetingRooms.size(); i += 2){
            System.out.print(meetingRooms.get(i).getName() + " ");
        }
        System.out.println();
    }

    public void printAreas(){
        System.out.println("Tárgyalók területe:");
        for (MeetingRoom rooms: meetingRooms){
            System.out.println(rooms.getName() + " - "
                    + rooms.getWidth() + " - "
                    + rooms.getLength() + " - "
                    + rooms.getArea());
        }
    }

    public void printMeetingRoomWithName(String name) {
        System.out.println("Keresett tárgyaló adatai:");
        for (MeetingRoom rooms : meetingRooms) {
            if (name.equals(rooms.getName())) {
                System.out.println(rooms.getWidth() + " - "
                        + rooms.getLength() + " - "
                        + rooms.getArea());
            }
        }
    }

    public void printMeetingRoomContains(String namePart){
        System.out.println("Tárgyalók, melyek neve a keresett szöveget tartalmazza:");
        for (MeetingRoom rooms : meetingRooms) {
            if (rooms.getName().toLowerCase().contains(namePart.toLowerCase())) {
                System.out.println(rooms.getName() + " - "
                        + rooms.getWidth() + " - "
                        + rooms.getLength() + " - "
                        + rooms.getArea());
            }
        }
    }

    public void printAreasLargerThan(int area) {
        System.out.println("A megadottnál nagyobb méretű tárgyalók adatai:");
        for (MeetingRoom rooms : meetingRooms) {
            if (area < rooms.getArea()) {
                System.out.println(rooms.getName() + " - "
                        + rooms.getWidth() + " - "
                        + rooms.getLength() + " - "
                        + rooms.getArea());
            }
        }
    }
}
