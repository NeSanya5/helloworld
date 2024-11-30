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
        paper = paper+ 4;
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
        System.out.println
                ("Если в компании работает " + worker + " человек, то всего "+ timeWork + " часов работы может быть поделено между сотрудниками");
    }
}