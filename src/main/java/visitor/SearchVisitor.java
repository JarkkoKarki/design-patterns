package visitor;

import java.util.ArrayList;
import java.util.List;

public class SearchVisitor implements FileSystemVisitor {
    private String extension;
    private List<File> matchingFiles = new ArrayList<>();

    public SearchVisitor(String extension) {
        this.extension = extension;
    }

    @Override
    public void visit(File file) { // Tarkistetaan tiedoston pääte
        if (file.getName().endsWith(extension)) {
            matchingFiles.add(file);
        }
    }

    @Override
    public void visit(Directory directory) { // Käydään läpi kansion sisältö
        for (FileSystemElement element : directory.getElements()) {
            element.accept(this);
        }
    }

    public List<File> getMatchingFiles() {
        return matchingFiles;
    }
}
