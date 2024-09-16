package exercises.day10.materials;

public class Book extends Material {
    private String author;

    public Book(String author, String materialName, int stockCopies) {
        super(materialName, stockCopies);
        this.author = author;
    }

    @Override
    public void printDetails() {
        System.out.println("ID : " + materialId);
        System.out.println("Title : " + materialName);
        System.out.println("Author : " + author);
        System.out.println("Total copies : " + totalStock);
        System.out.println("Available copies : " + availableStock);
    }
}
