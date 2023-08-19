public class Ravenclaw extends Hogwarts {
    private int mind;
    private int wisdom;
    private int wit;
    private int creation;

    public Ravenclaw(String fullName, int transgression, int powerOfMagic, int mind, int wisdom, int wit, int creation) {
        super(fullName, transgression, powerOfMagic);
        this.mind = mind;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creation = creation;
    }

    @Override
    public int countSpecificScore() {
        return mind + wisdom + wit + creation;
    }

    @Override
    public String toString() {
        return "Ravenclaw{" +
                "mind=" + mind +
                ", wisdom=" + wisdom +
                ", wit=" + wit +
                ", creation=" + creation +
                "} " + super.toString();
    }
}
