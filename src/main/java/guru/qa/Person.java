package guru.qa;

public class Person {
    int age; //значение по-умолчанию 0
    String name; // значение по-умолчанию null

    public Person(int age, String name) { // конструктор
        this.age = age;
        this.name = name;
    }

    public Person() {  // конструктор по-умолчанию (данный конструктор дает возможность создать пустой объект класса); Если был создан ранее хоть один конструктор,то если необходим конструктор по-умолчанию его нужно вот так (явно) объявлять
    }

    void goToPension(){
        if (age > 65) {
            System.out.println("Я на пенсии");
        } else {
            System.out.println("я еще молод");
        }

    }

    void sayName(){
        System.out.println("Мое имя: " + name);
    }

}
