import animals.*;

public class Main {
    public static void main(String[] args) {
        Animals cow = new Herbivores("Марта",14,"Деревня",5, "сено");
        Animals horse = new Herbivores("Брего",10,"Властелин колец две крепости",50,"Сено");
        Animals tiger = new Predators("Гена",20,"африка", 70,"Мясо жертв");
        Animals toad = new Amphibians("Крезифрог",20,"Германия");
        Animals ping = new Nofly("Linux",12,"Твой компьютер спустя 10 лет под санкциями XD","гуляет и плавает");
        Animals eagle = new Fly("Орёль",10,"На рублевой монетке","передвигается по кассовым аппаратам");
        System.out.println(cow);
        System.out.println();
        System.out.println(horse);
        horse.eat();

        System.out.println();
        System.out.println(tiger);
        System.out.println();
        System.out.println(toad);
        System.out.println();
        System.out.println(ping);
        System.out.println();
        System.out.println(eagle);

    }
}