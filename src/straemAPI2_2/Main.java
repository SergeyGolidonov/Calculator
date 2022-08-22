package straemAPI2_2;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Jack", "Connor", "Harry", "George", "Samuel", "John");
        List<String> families = Arrays.asList("Evans", "Young", "Harris", "Wilson", "Davies", "Adamson", "Brown");
        Collection<Person> persons = new ArrayList<>();
        for (int i = 0; i < 1_000_000; i++) {
            persons.add(new Person(
                    names.get(new Random().nextInt(names.size())),
                    families.get(new Random().nextInt(families.size())),
                    new Random().nextInt(100),
                    Sex.values()[new Random().nextInt(Sex.values().length)],
                    Education.values()[new Random().nextInt(Education.values().length)])
            );
        }

        // 1) Поиск несовершеннолетних граждан
        long minor = persons.stream()
                .filter(person -> person.getAge() < 18)
                .count();
        System.out.println(minor);

        // 2) Список фамилий призывников
        List<String> conscripts = persons.stream()
                .filter(person -> person.getAge() >= 18 && person.getAge() <= 27)
                .filter(person -> person.getSex() == Sex.MAN)
                .map(Person::getFamily)
                .collect(Collectors.toList());
        System.out.println(conscripts);

        /*
        3) Получить отсортированный по фамилии список потенциально работоспособных людей с высшим образованием
        в выборке (т.е. людей с высшим образованием от 18 до 60 лет для женщин и до 65 лет для мужчин).
         */

        Collection<Person> notRetiree = persons.stream()
                .filter(person -> person.getEducation() == Education.HIGHER)
                .filter(person -> person.getSex() == Sex.MAN ? person.getAge() >= 18 && person.getAge() <= 65
                        : person.getAge() >= 18 && person.getAge() <= 60)
                .sorted(Comparator.comparing(Person::getFamily)).collect(Collectors.toList());
        System.out.println(notRetiree);
    }
}