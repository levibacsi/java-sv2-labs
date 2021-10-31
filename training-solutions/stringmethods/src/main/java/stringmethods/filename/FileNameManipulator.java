package stringmethods.filename;

public class FileNameManipulator {

    public char findLastCharacter(String str) {
        str = str.trim();

        return str.charAt(str.length() - 1);
    }

    public String findFileExtension(String fileName) {
        fileName = fileName.trim();
        int index = fileName.lastIndexOf('.');

        return fileName.substring(index);
    }

    public boolean identifyFilesByExtension(String ext, String fileName) {
        fileName = fileName.trim();
        ext = ext.trim();
        int index = fileName.lastIndexOf('.');

        return fileName.endsWith(ext);
    }

    public boolean compareFilesByName(String searchedFileName, String actualFileName) {

        return searchedFileName.trim().equalsIgnoreCase(actualFileName.trim());
    }

    public String changeExtensionToLowerCase(String fileName) {
        fileName = fileName.trim();
        int index = fileName.lastIndexOf('.');
        String namePart = fileName.substring(0, index);
        String extension = fileName.substring(index).toLowerCase();

        return namePart + extension;
    }

    public String replaceStringPart(String fileName, String present, String target) {
        if (fileName.contains(present)) {
            return fileName.replace(present, target);
        }

        return fileName;
    }

    public static void main(String[] args) {
        FileNameManipulator fileNameManipulator = new FileNameManipulator();

        System.out.println(fileNameManipulator.findLastCharacter("this is a string"));
        System.out.println(fileNameManipulator.findLastCharacter("another string \t  \n "));

        System.out.println(fileNameManipulator.findFileExtension("autoexec.bat"));

        System.out.println(fileNameManipulator.identifyFilesByExtension("sys", "config.sys"));
        System.out.println(fileNameManipulator.identifyFilesByExtension("bat", "config.sys"));

        System.out.println(fileNameManipulator.compareFilesByName("game.exe", "Game.exe"));
        System.out.println(fileNameManipulator.compareFilesByName("game.exe", "gamm.exe"));

        System.out.println(fileNameManipulator.changeExtensionToLowerCase("WIN.INI"));

        System.out.println(fileNameManipulator.replaceStringPart("excel.xls", "xlsm", "xls"));
        System.out.println(fileNameManipulator.replaceStringPart("excel.xlsm", "xlsm", "xls"));
        System.out.println(fileNameManipulator.replaceStringPart(" this should be replaced with something .txt", " ", "_"));
    }
}
