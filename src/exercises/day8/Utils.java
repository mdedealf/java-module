package exercises.day8;

import java.util.UUID;

public class Utils {

    public static String generateTicketUuid() {
        UUID uuid = UUID.randomUUID();
        return uuid.toString().replaceAll("-", "").toUpperCase();
    }

    public static String generateCustomerUuid() {
        UUID uuid = UUID.randomUUID();
        return uuid.toString().toUpperCase();
    }
}
