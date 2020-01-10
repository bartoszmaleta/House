package firstTry;

public class Room {
    private Table table;
    private Bed bed;
    private Drawer drawer;
    private Trash trash;

    public Room(Table table, Bed bed, Drawer drawer, Trash trash) {
        this.table = table;
        this.bed = bed;
        this.drawer = drawer;
        this.trash = trash;
    }

    public void emptyTrash() {
        trash.takeOutTheTrash();
    }

    public Table getTable() {
        return table;
    }

    public void setTable(Table table) {
        this.table = table;
    }

    public Bed getBed() {
        return bed;
    }

    public void setBed(Bed bed) {
        this.bed = bed;
    }

    public Drawer getDrawer() {
        return drawer;
    }

    public void setDrawer(Drawer drawer) {
        this.drawer = drawer;
    }

    public Trash getTrash() {
        return trash;
    }

    public void setTrash(Trash trash) {
        this.trash = trash;
    }
    
}