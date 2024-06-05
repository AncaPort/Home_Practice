package home_practice;

public class InstantMethod {

    int a = 10;//a instant variable
    int b = 20;//b instant variable

    public static void main(String[] args) {
        InstantMethod inst = new InstantMethod();
        inst.m1();//method called with object

    }
    //instant method decration
    private void m1(){//static or instance called directly
        System.out.println(a);
        System.out.println(b);

    }
}
