package methodpass;

import java.util.ArrayList;
import java.util.List;

public class WindowOperation {
    public void riseSize(List<Window> windows, int plusSize){
        for (Window w: windows){
            w.setHeight(w.getHeight() + plusSize);
        }
    }

    public static void main(String[] args) {
        Window windowB = new Window("bedroom", 100, 200);
        Window windowL = new Window("livingroom", 150, 200);

        List<Window> windowList = new ArrayList<>();
        windowList.add(windowB);
        windowList.add(windowL);

        System.out.println(windowList);

        WindowOperation windowOperation = new WindowOperation();
        windowOperation.riseSize(windowList, 10);

        System.out.println(windowList);
    }
}
