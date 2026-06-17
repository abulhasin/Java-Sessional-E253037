class Person {
    String name;

    void show() {
        System.out.println("Name: " + name);
    }
}

class Doctor extends Person {
    void work() {
        System.out.println(name + " treats patients");
    }
}

class Teacher extends Person {
    void work() {
        System.out.println(name + " teaches students");
    }
}

class Engineer extends Person {
    void work() {
        System.out.println(name + " builds software");
    }
}

public class PersonMain {
    public static void main(String[] args) {

        Doctor d = new Doctor();
        d.name = "Rahim";
        d.show();
        d.work();

        System.out.println();

        Teacher t = new Teacher();
        t.name = "Karim";
        t.show();
        t.work();

        System.out.println();

        Engineer e = new Engineer();
        e.name = "Hasan";
        e.show();
        e.work();
    }
}