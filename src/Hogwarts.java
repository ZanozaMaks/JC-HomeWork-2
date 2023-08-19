public abstract class Hogwarts {
    private String fullName;
    private int transgression;
    private int powerOfMagic;

    public Hogwarts(String fullName, int transgression, int powerOfMagic) {
        this.fullName = fullName;
        this.transgression = transgression;
        this.powerOfMagic = powerOfMagic;
    }

    abstract public int countSpecificScore();

    public void compare(Hogwarts hogwarts) {
        if (this.getClass().equals(hogwarts.getClass())) {
            compareSpecificScore(hogwarts);
        } else {
            compareScore(hogwarts);
        }
    }

    private void compareSpecificScore (Hogwarts hogwarts) {
        int studentOne = this.countSpecificScore();
        int studentTwo = hogwarts.countSpecificScore();

        if (studentOne > studentTwo) {
            System.out.println("Ученик(ца) "+ this.getFullName() + " сильнее Ученика(цы) " + hogwarts.getFullName());
        } else if (studentOne < studentTwo) {
            System.out.println("Ученик(ца) "+ hogwarts.getFullName() + " сильнее Ученика(цы) " + this.getFullName());
        } else {
            System.out.println("Сила учеников равна");
        }
    }

    private void compareScore(Hogwarts hogwarts) {
        int studentOne = getPowerOfMagic() + getTransgression();
        int studentTwo = hogwarts.getPowerOfMagic() + hogwarts.getTransgression(); // сравниваем учеников

        if (studentOne > studentTwo) {
            System.out.println("Ученик(ца) "+ this.getFullName() + " сильнее Ученика(цы) " + hogwarts.getFullName());
        } else if (studentOne < studentTwo) {
            System.out.println("Ученик(ца) "+ hogwarts.getFullName() + " сильнее Ученика(цы) " + this.getFullName());
        } else {
            System.out.println("Сила учеников равна");
        }
    }


    public String getFullName() {
        return fullName;
    }

    public int getTransgression() {
        return transgression;
    }

    public int getPowerOfMagic() {
        return powerOfMagic;
    }

    public String fullName() {
        return fullName;
    }
    public int transgression() {
        return transgression;
    }
    public int powerOfMagic() {
        return powerOfMagic;
    }

    @Override
    public String toString() {
        return "Hogwarts{" +
                "Полное имя" + fullName + '\'' +
                ", трансгрессирование" + transgression +
                ", Сила магии" + powerOfMagic +
                '}';
    }
}
