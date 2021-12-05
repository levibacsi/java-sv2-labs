package interfacedefaultmethods.longword;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class LongWord implements FileOperations{

    private Path path;

    public LongWord(Path path) {
        this.path = path;
    }

    @Override
    public String getLongWord() {
        List<String> wordList = readFromFile(path);
        StringBuilder sb = new StringBuilder();
        sb.append(wordList.get(0));

        for (int i = 1; i < wordList.size(); i++){
            sb.append(wordList.get(i).substring(wordList.get(i).length()-1));
        }

        return sb.toString();
    }
}
