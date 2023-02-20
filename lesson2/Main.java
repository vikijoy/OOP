package oop_lesson2;
public class Main {
    public static void main(String[] args) {
        Person.addPerson("Ирина", 56);
        Person.addPerson("Игорь", 60);
        Person.addPerson("Вася", 30);
        Person.addPerson("Маша", 27);
        Person.addPerson("Женя", 10);
        Person.addPerson("Ваня", 8);
        Person.addPerson("Саша", 9);
        GeoTree gt = new GeoTree();
        gt.appendPerentChild(Person.getPersonList().get("Ирина"), Person.getPersonList().get("Вася")); // Ирина родитель Васи
        gt.appendPerentChild(Person.getPersonList().get("Ирина"), Person.getPersonList().get("Маша")); // Ирина родитель Маши
        gt.appendPerentChild(Person.getPersonList().get("Вася"), Person.getPersonList().get("Женя")); // Вася родитель Жени
        gt.appendPerentChild(Person.getPersonList().get("Вася"), Person.getPersonList().get("Ваня")); // Вася родитель Ивана
        gt.appendVifeHusbent(Person.getPersonList().get("Ирина"), Person.getPersonList().get("Игорь")); // Ирина жена Игоря
        gt.appendPerentChild(Person.getPersonList().get("Игорь"), Person.getPersonList().get("Вася")); // Игорь родитель Васи
        gt.appendPerentChild(Person.getPersonList().get("Игорь"), Person.getPersonList().get("Вася")); // Игорь родитель Маши
        gt.appendPerentChild(Person.getPersonList().get("Игорь"), Person.getPersonList().get("Саша")); // Игорь родитель Саши

        // Ищем детей Ирины
        System.out.println("Дети Ирины");
        System.out.println(new Research(gt).spend(Person.getPersonList().get("Ирина"), Relationship.parent));
        // Ищем детей Игоря
        System.out.println("Дети Игоря");
        System.out.println(new Research(gt).spend(Person.getPersonList().get("Игорь"), Relationship.parent));

        // Ищем мужа Ирины (Чья жена Ирина?)
        System.out.println("Муж Ирины");
        System.out.println(new Research(gt).spend(Person.getPersonList().get("Ирина"), Relationship.vife));

        // Ищем людей определенного возраста
        System.out.println(new Research(gt).searchAge());
    }
}
