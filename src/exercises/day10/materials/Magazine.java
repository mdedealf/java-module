package exercises.day10.materials;

public class Magazine extends Material {
    private int volume;

    public Magazine(int volume, String materialName, int stockCopies) {
        super(materialName, stockCopies);
        this.volume = volume;
    }

    @Override
    public void printDetails() {
        System.out.println("ID : " + materialId);
        System.out.println("Title : " + materialName);
        System.out.println("Volume : " + volume);
        System.out.println("Total copies : " + totalStock );
        System.out.println("Available copies : " + availableStock);
    }
}
