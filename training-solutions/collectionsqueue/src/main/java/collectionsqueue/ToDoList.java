package collectionsqueue;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class ToDoList {
    private List<ToDo> toDos = new ArrayList<>();

    public void addToDo(ToDo toDo){
        toDos.add(toDo);
    }

    public List<ToDo> getToDos() {
        return toDos;
    }

    public Deque<ToDo> getTodosInUrgencyOrder(){
        Deque<ToDo> toDosInUrgencyOrder = new ArrayDeque<>();

        for (ToDo toDo: toDos){
            if (toDo.isUrgent()){
                toDosInUrgencyOrder.addFirst(toDo);
            } else {
                toDosInUrgencyOrder.addLast(toDo);
            }
        }

        return toDosInUrgencyOrder;
    }

    public static void main(String[] args) {
        ToDoList toDoList = new ToDoList();

        toDoList.addToDo(new ToDo("sleep", true));
        toDoList.addToDo(new ToDo("eat", false));
        toDoList.addToDo(new ToDo("drink", true));
        toDoList.addToDo(new ToDo("talk", false));

        System.out.println(toDoList.getTodosInUrgencyOrder());
        System.out.println(toDoList.getTodosInUrgencyOrder().pop());

        Deque<ToDo> result = toDoList.getTodosInUrgencyOrder();
        System.out.println(result);
        System.out.println(result.pop());
        System.out.println(result.pop());
        System.out.println(result.pop());
        System.out.println(result);
    }

}
