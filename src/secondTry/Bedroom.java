package secondTry;

public class Bedroom {
    private String name;
    private Wall wall;
    private Wall wall2;
    private Wall wall3;
    private Wall wall4;
    private Ceiling ceiling;
    private Bed bed;
    private Lamp lamp;

    // TODO: create Constructro after creating classes!

    public Lamp getLamp() {
        return this.lamp;
    }

    public void makeBed() {
        System.out.println("Beddrom -> Making bed");
        bed.make();
    }
}