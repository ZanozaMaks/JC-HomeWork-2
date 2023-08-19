public class Slytherin extends Hogwarts {
    private int cunning;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int lustForPower;

    public Slytherin(String fullName, int transgression, int powerOfMagic, int cunning, int determination, int ambition, int resourcefulness, int lustForPower) {
        super(fullName, transgression, powerOfMagic);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.lustForPower = lustForPower;
    }

    @Override
    public int countSpecificScore() {
        return cunning + determination + ambition + resourcefulness + lustForPower;
    }

    @Override
    public String toString() {
        return "Slytherin{" +
                "cunning=" + cunning +
                ", determination=" + determination +
                ", ambition=" + ambition +
                ", resourcefulness=" + resourcefulness +
                ", lustForPower=" + lustForPower +
                "} " + super.toString();
    }
}
