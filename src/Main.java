public class Main {
    public static void main(String[] args) {

// студенты

        Gryffindor harryPotter = new Gryffindor("Гарри Поттер", 100, 100, 100, 100, 100);
        Gryffindor hermioneGranger = new Gryffindor("Гермиона Грейнджер", 100, 76, 50, 100, 100);
        Gryffindor ronWeasley = new Gryffindor("Рон Уизли", 51, 75, 80, 100, 100);

        Slytherin dracoMalfoy = new Slytherin("Драко малфой", 71, 89, 75, 100, 100, 95, 100);
        Slytherin grahamMontagu = new Slytherin("Грэхэм Монтегю", 50, 40, 50, 91, 15, 32, 60);
        Slytherin gregoryGoyle = new Slytherin("Грегори Гойл", 50, 44, 50, 95, 23, 44, 62);

        Hufflepuff zachariasSmith = new Hufflepuff("Захария Смит", 40, 71, 40, 40, 58);
        Hufflepuff cedricDiggory = new Hufflepuff("Седрик Диггори", 63, 59, 50, 50, 66);
        Hufflepuff justinFinchFletchley = new Hufflepuff("Джастин Финч-Флетчли", 67, 40, 49, 100, 40);

        Ravenclaw zhouChang = new Ravenclaw ("Чжоу Чанг", 55, 61, 60, 13, 100, 50);
        Ravenclaw padmaPatil = new Ravenclaw ("Падма Патил", 30, 43, 24, 100, 52, 49);
        Ravenclaw marcusBelby = new Ravenclaw ("Маркус Белби", 14, 50, 100, 48, 84, 75);




// выводим данные о студенте

        System.out.println(hermioneGranger);
        System.out.println(marcusBelby);

// сравниваем студентов

        padmaPatil.compare(marcusBelby);
        zhouChang.compare(grahamMontagu);

// сравниваем поля

        harryPotter.compare(ronWeasley);
        dracoMalfoy.compare(cedricDiggory);

    }

}
