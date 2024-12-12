public class Main {
    public static void main(String[] args) {
        System.out.println("Привет мир!");
        System.out.println("hello world!");
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        System.out.println();
        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        System.out.println();
        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        System.out.println();
        var friend = 19;
        System.out.println(friend);
        friend = friend - 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);
        System.out.println();
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);
        System.out.println();
        var boxer1 = 78.2;
        var boxer2 = 82.7;
        System.out.println(boxer1 + boxer2);
        System.out.println(boxer2 - boxer1);
        System.out.println(boxer2 % boxer1);
        System.out.println();
        var allTimeWork = 640.0;
        var timeWork = 8.0;
        var worker = allTimeWork / timeWork;
        System.out.println("Всего работников в компании — " + worker + " человек");
        worker = 94.0;
        timeWork = allTimeWork / worker;
        System.out.println("Если в компании работает " + worker + " человек, то всего " + timeWork + " часов работы может быть поделено между сотрудниками");
        System.out.println();
        int i = 27897;
        byte b = 67;
        short s = 569;
        long l = 987678965549L;
        float f = 2.786F;
        double d = 27.12;
        System.out.println("Значение переменной i с типом int равно " + i);
        System.out.println("Значение переменной b с типом byte равно " + b);
        System.out.println("Значение переменной s с типом short равно " + s);
        System.out.println("Значение переменной l с типом long равно " + l);
        System.out.println("Значение переменной f с типом float равно " + f);
        System.out.println("Значение переменной d с типом double равно " + d);
        System.out.println();
        var studentLP = 23;
        var studentAS = 27;
        var studentEA = 30;
        paper = 480;
        var paperStudent = paper / (studentAS + studentLP + studentEA);
        System.out.println("На каждого ученика рассчитано " + paperStudent + " листов бумаги");
        System.out.println();
        var bottlInMin = 8;
        var bottlIn20Min = bottlInMin * 20;
        var bottlInDay = bottlInMin * 1440;
        var bottlIn3Day = bottlInMin * 4320;
        var bottlInMonth = bottlInMin * 43200;
        System.out.println("За 20 минут машина произвела " + bottlIn20Min + " штук бутылок");
        System.out.println("За 1 день машина произвела " + bottlInDay + " штук бутылок");
        System.out.println("За 3 дня машина произвела " + bottlIn3Day + " штук бутылок");
        System.out.println("За 1 месяц машина произведет " + bottlInMonth + " штук бутылок");
        System.out.println();
        var whitePaint = 2;
        var brownPaint = 4;
        var countPaint = 120;
        var rooms = countPaint / (whitePaint + brownPaint);
        System.out.println("В школе, где " + rooms + " классов, нужно " + whitePaint * rooms + " банок белой краски и " + brownPaint * rooms + " банок коричневой краски");
        System.out.println();
        var banan = 5;
        var milk = 2;
        var ice = 2;
        var eggs = 4;
        var cocktailGram = (banan * 80) + (milk * 105) + (ice * 100) + (eggs * 70);
        System.out.println("Завтрак спортсмена весит " + cocktailGram + " гарммов или " + cocktailGram / 1000f + " килограмов.");
        System.out.println();
        var loseWeightKilo = 7;
        var loseWeightGrams = loseWeightKilo * 1000;
        System.out.println("Если спотсмен теряет по 250 грамм в день тоему потребуется " + loseWeightGrams / 250 + " дней ,а если по 500 грамм то " + loseWeightGrams / 500 + " дней чтобы сбросить 7 кг");
        System.out.println();
        var salaryMasha1 = 67760;
        var salaryMasha2 = salaryMasha1 + ((salaryMasha1 / 100f) * 10);
        System.out.println("Маша теперь получает " + salaryMasha2 + " рублей. Годовой доход вырос на " + (salaryMasha2 % salaryMasha1) * 12 + " рублей");
        System.out.println();
        var salaryDen1 = 83690;
        var salaryDen2 = salaryDen1 + ((salaryDen1 / 100f) * 10);
        System.out.println("Денис теперь получает " + salaryDen2 + " рублей. Годовой доход вырос на " + (salaryDen2 % salaryDen1) * 12 + " рублей");
        System.out.println();
        var salaryKristina1 = 76230;
        var salaryKristina2 = salaryKristina1 + ((salaryKristina1 / 100f) * 10);
        System.out.println("Кристина теперь получает " + salaryKristina2 + " рублей. Годовой доход вырос на " + (salaryKristina2 % salaryKristina1) * 12 + " рублей");
        System.out.println();
        int age = 18;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + " то он совешеннолетний");
        } else {
            System.out.println("Если возраст человека равен " + age + " он не достиг совершеннолетия, нужно немного подождать");
        }
        System.out.println();
        int temperature = -5;
        if (temperature >= 5) {
            System.out.println("На улице " + temperature + " градусов можно идти без шапки");
        } else {
            System.out.println("На улице " + temperature + " градусов  нужно надеть шапку");
        }
        System.out.println();
        int speed = 50;
        if (speed >= 60) {
            System.out.println("Если скорость " + speed + " то придется заплатить штраф");
        } else {
            System.out.println("Если скорость " + speed + " то можно ездить спокойно");
        }
        System.out.println();
        age = 5;
        if (age >= 2 && age <= 6) {
            System.out.println("Если возраст человека равен " + age + " то ему нужно ходить в детский сад.");
        }
        if (age >= 7 && age <= 17) {
            System.out.println("Если возраст человека равен " + age + " то ему нужно ходить в школу.");
        }
        if (age >= 18 && age <= 24) {
            System.out.println("Если возраст человека равен " + age + " то его место в университете.");
        }
        if (age > 24) {
            System.out.println("Если возраст человека равен " + age + " то ему пора ходить на работу.");
        }
        System.out.println();
        int ageKid = 5;
        if (ageKid <= 5) {
            System.out.println("Если возраст ребенка равен " + ageKid + " то он не может кататься на аттракционе.");
        }
        if (ageKid > 5 && ageKid < 14) {
            System.out.println("Если возраст ребенка равен " + ageKid + " то он может кататься только в сопровождении взрослого. Если взрослого нет, то кататься нельзя.");
        }
        if (ageKid >= 14) {
            System.out.println("Если возраст ребенка равен " + ageKid + " то он может кататься без сопровождения взрослого.");
        }
        System.out.println();
        int people = 400;
        if (people >= 102) {
            System.out.println("Вагон полный");
        }
        if (people <= 60) {
            System.out.println("В вагоне свободно " + (60 - people) + " сидячих мест и " + (102 - 60) + " стоячих места");
        } else {
            System.out.println("В вагоне 0 сидячих мест и " + (102 - people) + " стоячих мест");
        }
        System.out.println();
        int one = 110;
        int two = 16;
        int three = 50;
        if (one > two && one > three){
            System.out.println(one + " самое большое число");
        }
        if (two > one && two > three){
            System.out.println(two + " самое большое число");
        }
        if (three >one && three > two){
            System.out.println(three + " самое большое число");
        }

    }
}