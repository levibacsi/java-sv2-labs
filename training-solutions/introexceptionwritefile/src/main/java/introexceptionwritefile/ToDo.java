package introexceptionwritefile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ToDo {
    private List<String> toDoList = new ArrayList<>();

    public void addItem (String item){
        toDoList.add(item);
    }

    public void writer() {
        try {
            Files.write(Paths.get("todolist.txt"), toDoList);
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ToDo toDo = new ToDo();

        String nextThing = "";
        while (!"x".equals(nextThing)){
            System.out.println("Tell me what to do!(Press x when you're done.)");
            nextThing = scanner.nextLine();
            if (!"x".equals(nextThing)) {
                toDo.addItem(nextThing);
            }
        }
        toDo.writer();
    }
}
