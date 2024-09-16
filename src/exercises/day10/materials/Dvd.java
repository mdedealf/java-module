package exercises.day10.materials;

public class Dvd extends Material{
    private float duration;

    public Dvd(float duration, String materialName, int stockCopies) {
        super(materialName, stockCopies);
        this.duration = duration;
    }

    @Override
    public void printDetails() {
        System.out.println("ID : " + materialId);
        System.out.println("Title : " + materialName);
        System.out.println("Duration : " + duration);
        System.out.println("Total copies : " + totalStock);
        System.out.println("Available copies : " + availableStock);
    }
}
