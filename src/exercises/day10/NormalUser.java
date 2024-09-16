package exercises.day10;

import exercises.day10.materials.Material;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class NormalUser extends User {
    private final Map<UUID, Material> materialsHistory = new HashMap<>();

    public NormalUser(String username, String password) {
        super(username, password);
    }

    @Override
    public void showMenu() {
        System.out.println("\n===== User Menu =====");
        System.out.println("1. View available materials " +
                "\n2. Borrow material" +
                "\n3. Return materials" +
                "\n4. View borrowed materials" +
                "\n4. Logout");
    }

    public void viewAvailableMaterials(List<Material> materials) {
        System.out.println("\n===== Available materials =====");
        for(Material material : materials) {
            if(material.isAvailable()) material.printDetails();
        }
    }

    public void borrowMaterial(List<Material> materials, UUID materialId) {
        for(Material material : materials) {
            if(material.getMaterialId().equals(materialId)) {
                if(material.isAvailable()) {
                    material.borrowMaterial();
                    materialsHistory.put(material.getMaterialId(), material);
                    return;
                }
            }
        }
        System.out.println("Material isn't available for borrowing.\n");
    }

    public void returnMaterial(UUID materialId) {
        Material material = materialsHistory.get(materialId);
        if(material != null) {
            material.returnMaterial();
            materialsHistory.remove(materialId);
        } else System.out.println("You haven't borrowed this material item.\n");
    }

    public void viewBorrowedMaterials() {
        System.out.println("\n===== Borrowed materials =====");
        if(materialsHistory.isEmpty()) {
            System.out.println("There is no borrowed materials.\n");
        } else {
            for(Material material : materialsHistory.values()) {
                material.printDetails();
            }
        }
    }
}
