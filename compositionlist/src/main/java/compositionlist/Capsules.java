package compositionlist;

import java.util.ArrayList;
import java.util.List;

public class Capsules {
    List<String> capsules = new ArrayList<>();

    public void addLast (String color){
        capsules.add(color);
    }

    public void addFirst(String color){
        capsules.add(0, color);
    }

    public void removeFirst() {
        capsules.remove(0);
    }

    public void removeLast(){
        capsules.remove(capsules.size()-1);
    }

    @Override
    public String toString() {
        return "Capsules{" +
                "capsules=" + capsules +
                '}';
    }

    public static void main(String[] args) {
        Capsules capsules = new Capsules();

        capsules.capsules.add("black");
        capsules.addFirst("white");
        capsules.addLast("red");

        System.out.println(capsules);

        capsules.removeFirst();
        capsules.removeLast();

        System.out.println(capsules);
    }
}


