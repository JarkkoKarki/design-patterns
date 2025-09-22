package visitor;

public class SizeCalculatorVisitor implements FileSystemVisitor {
    private int totalSize = 0;

    @Override
    public void visit(File file) { // Lisätään tiedoston koko kokonaiskokoon
        totalSize += file.getSize();
    }

    @Override
    public void visit(Directory directory) { // Käydään läpi kaikki hakemiston elementit
        for (FileSystemElement element : directory.getElements()) {
            element.accept(this);
        }
    }

    public int getTotalSize() {
        return totalSize;
    }
}
