class Grandfather {
    void company() {
        System.out.println("Grandfather owns a business");
    }
}

class Father extends Grandfather {
    void car() {
        System.out.println("Father owns a car");
    }
}

class Son extends Father {
    void hobby() {
        System.out.println("Son likes playing games");
    }
}

public class FamilyMain {
    public static void main(String[] args) {
        Son s = new Son();

        s.company();
        s.car();
        s.hobby();
    }
}