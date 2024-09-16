package exercises.day10.materials;

import java.util.UUID;

public abstract class Material {
    protected String materialName;
    protected int totalStock;
    protected int availableStock;
    protected UUID materialId;

    public Material(String materialName, int totalStock) {
        this.materialName = materialName;
        this.totalStock = totalStock;
        this.availableStock = totalStock;
        this.materialId = UUID.randomUUID();
    }

    public String getMaterialName() {
        return materialName;
    }

    public int getAvailableStock() {
        return availableStock;
    }

    public UUID getMaterialId() {
        return materialId;
    }

    public boolean isAvailable() {
        return availableStock > 0;
    }

    public void borrowMaterial() {
        if(isAvailable()) {
            availableStock--;
            System.out.println("Item borrowed : "+ materialName);
        } else System.out.println(materialName+" is not available right now.");
    }

    public void returnMaterial() {
        if(availableStock < totalStock) {
            availableStock++;
            System.out.println("Item returned : " + materialName);
        } else System.out.println(materialName + " has no borrowed.");
    }

    public abstract void printDetails();
}
