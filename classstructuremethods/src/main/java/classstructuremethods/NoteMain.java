package classstructuremethods;
import java.util.Scanner;

public class NoteMain {
    public static void main(String[] args) {
        Note note = new Note();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Your name?");
        String name = scanner.nextLine();
        note.setName(name);

        System.out.println("Your topic?");
        String topic = scanner.nextLine();
        note.setTopic(topic);

        System.out.println("Your text?");
        String text = scanner.nextLine();
        note.setText(text);

        System.out.println(note.getNoteText());
    }
}
