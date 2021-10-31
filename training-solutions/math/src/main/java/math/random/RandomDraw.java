package math.random;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomDraw {
    public static void main(String[] args) {
        List<String> players = new ArrayList<>();
        players.add("Ma Lin");
        players.add("Liu Guoliang");
        players.add("Zhang Yining");
        players.add("Ding Ning");
        players.add("Zhang Jike");
        players.add("Ma Long");
        players.add("Wang Hao");
        players.add("Wang Liqin");
        players.add("Guo Yue");
        players.add("Fan Zhendong");

        Random random = new Random();
        int random1 = random.nextInt(5);
        int random2 = random.nextInt(5, 10);

        System.out.println(players.get(random1));
        System.out.println(players.get(random2));
    }
}
