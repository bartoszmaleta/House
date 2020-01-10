package firstTry;

public class App {
    public static void main(String[] args) throws Exception {
        
        Bedding bedding = new Bedding("black", "silky");
        Bed bed = new Bed("black", bedding, 2);
        Drawer drawer = new Drawer("Inferno");
        Table table = new Table(4, "gold");
        Trash trash = new Trash("waterBottle");

        Room room = new Room(table, bed, drawer, trash);

        room.emptyTrash();

    }
}