package firstTry;

public class Trash {
    private String emptyBottle;

    public Trash(String emptyBottle) {
        this.emptyBottle = emptyBottle;
    }

    public String getEmptyBottle() {
        return emptyBottle;
    }

    public void throwingToTheTrash(String trash) {
        System.out.println("I am throwing " + trash + " to the trash");
    }

    // public void emptyTrash() {
    //     takeOutTheTrash();
    // }

    public void takeOutTheTrash() {
        System.out.println("Go out and take out the trash");
        goOutAndThrowTrashToTheBin();
    }

    private void goOutAndThrowTrashToTheBin() {
        System.out.println("Going out and throwing trash to the bin.");
    }
}