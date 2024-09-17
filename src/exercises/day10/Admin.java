package exercises.day10;

import exercises.day10.materials.Material;

import java.util.List;
import java.util.UUID;

public class Admin extends User{
    public Admin(String username, String password) {
        super(username, password);
    }

    @Override
    public void showMenu() {
        System.out.println("\n===== Admin Menu =====");
        System.out.println("1. Add new material " +
                "\n2. Delete material" +
                "\n3. View all materials" +
                "\n4. Logout");
    }

    public void addMaterial(List<Material> materials, Material material) {
        materials.add(material);
        System.out.println("Successfully added material " + material.getMaterialName() +"\n");
    }

    public void deleteMaterial(List<Material> materials, UUID materialId) {
        materials.removeIf(material -> material.getMaterialId().equals(materialId));
        System.out.println("Successfully deleted material from library.\n");
    }

    public void viewMaterial(List<Material> materials) {
        System.out.println("\n==== Available materials ====");
        if(materials.isEmpty()) System.out.println("No material found.");
        for(Material material : materials) {
            material.printDetails();
        }
        System.out.println("-------------------------- ---");
    }
}
