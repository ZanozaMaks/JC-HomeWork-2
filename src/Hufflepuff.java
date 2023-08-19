public class Hufflepuff extends Hogwarts {

  private int industriousness;
  private int loyalty;
  private int honesty;

    public Hufflepuff(String fullName, int transgression, int powerOfMagic, int industriousness, int loyalty, int honesty) {
        super(fullName, transgression, powerOfMagic);
        this.industriousness = industriousness;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    @Override
    public int countSpecificScore() {
        return industriousness + loyalty + honesty;
    }

    @Override
    public String toString() {
        return "Hufflepuff{" +
                "industriousness=" + industriousness +
                ", loyalty=" + loyalty +
                ", honesty=" + honesty +
                "} " + super.toString();
    }
}
