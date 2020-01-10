package secondTry;

public class MainRoom {
    public static void main(String[] args) {
        Wall wall1 = new Wall("West");
        Wall wall2 = new Wall("East");
        Wall wall3 = new Wall("South");
        Wall wall4 = new Wall("North");

        Ceiling ceiling = new Ceiling(3, 55);
        Bed bed = new Bed("Modern", 4, 1, 2, 1);
        Lamp lamp = new Lamp("Retro", false, 75);

        Bedroom bedroom = new Bedroom("Bartosz's bedroom", wall1, wall2, wall3, wall4, ceiling, bed, lamp);
    }
}