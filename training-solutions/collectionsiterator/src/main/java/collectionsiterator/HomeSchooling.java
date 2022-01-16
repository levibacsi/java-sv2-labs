package collectionsiterator;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class HomeSchooling {
    private List<OnlineLesson> timeTable = new LinkedList<>();

    public List<OnlineLesson> getLessons() {
        return timeTable;
    }

    public void addNewLesson(OnlineLesson lesson){
        int index = timeTable.size();

        for (int i = 0; i < timeTable.size()-1; i++){
            if (timeTable.get(i).getStartTime().isBefore(lesson.getStartTime())
            && timeTable.get(i+1).getStartTime().isAfter(lesson.getStartTime())){
                index = i+1;
            }
        }
        timeTable.add(index, lesson);
    }

    public List<OnlineLesson> getLessonsByTitle(String title){
        List<OnlineLesson> lessonsByTitle = new ArrayList<>();
        for (OnlineLesson ol: timeTable){
            if (ol.getLessonTitle().equals(title)){
                lessonsByTitle.add(ol);
            }
        }
        return lessonsByTitle;
    }

    public void removeLesson(LocalDateTime startTime){
        Iterator<OnlineLesson> iterator = timeTable.iterator();
        while (iterator.hasNext()){
            OnlineLesson onlineLesson = iterator.next();
            if (onlineLesson.getStartTime().equals(startTime)){
                iterator.remove();
            }
        }
    }
}
