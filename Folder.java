import java.util.ArrayList;

public class Folder {
    private String folderName;
    private ArrayList<Folder> folderList;
    private ArrayList<File> fileList;


    public Folder(String folderName) {
        this.folderName = folderName;
        this.folderList = new ArrayList<Folder>();
        this.fileList = new ArrayList<File>();
    }

    public String getFolderName() { return folderName; }
    public void setFolderName(String folderName) {  this.folderName = folderName; }

    public Folder getFolder(String folderName) {
        for (Folder f : folderList) {
            if (f.folderName.equals(folderName)) { return f; }
            Folder found = f.getFolder(folderName);
            if (found != null) {
                return found;
            }
        }
        return null;
    }
    public void insertFolder(Folder folder) { folderList.add(folder); }
    public void deleteFolder(String folderName) {
        for (int i = 0; i < folderList.size(); i++) {
            Folder f = folderList.get(i);
            if (f.getFolderName().equals(folderName)) {
                folderList.remove(i);
                break;
            } 
            else { f.deleteFolder(folderName); }
        }
    }

    public File getFile(String fileName) {
        for (File f : fileList) {
            if (f.getFileName().equals(fileName)) { return f; }
        }
        return null;
    }
    public void insertFile(File file) { fileList.add(file); }
    public void deleteFile(String fileName) { fileList.removeIf(f -> (f.getFileName().equals(fileName))); }

    public void print(int level) {
        System.out.println("|    ".repeat(level) + folderName);
        if (!folderList.isEmpty()) { for (Folder f : folderList) { f.print(level + 1); } }
        if (!fileList.isEmpty()) { for (File f : fileList) { f.print(level + 1); } }
    }
}
