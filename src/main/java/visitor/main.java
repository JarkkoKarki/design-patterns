package visitor;

public class main {
    public static void main(String[] args) {
        Directory root = new Directory("root");
        File file1 = new File("document.txt", 5);
        File file2 = new File("photo.jpg", 15);
        File file3 = new File("video.mp4", 200);

        Directory subDir = new Directory("subfolder");
        File file4 = new File("notes.txt", 2);
        File file5 = new File("music.mp3", 50);

        subDir.addElement(file4);
        subDir.addElement(file5);

        root.addElement(file1);
        root.addElement(file2);
        root.addElement(file3);
        root.addElement(subDir);

        // Size
        SizeCalculatorVisitor sizeVisitor = new SizeCalculatorVisitor();
        root.accept(sizeVisitor);
        System.out.println("Size of files: " + sizeVisitor.getTotalSize());

        // Search
        SearchVisitor searchVisitor = new SearchVisitor(".txt");
        root.accept(searchVisitor);
        System.out.println("Files found:");
        for (File f : searchVisitor.getMatchingFiles()) {
            System.out.println(" - " + f.getName() + " (" + f.getSize() + ")");
        }
    }
}