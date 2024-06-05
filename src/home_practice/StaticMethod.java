package home_practice;

public class StaticMethod {

    static int a= 10;
    static int b= 20;
    int c= 30;
    public static void main(String[] args) {
        m1();//method called directly
    }

    static void m1(){
        System.out.println(a);
        System.out.println(b);
        StaticMethod sta = new StaticMethod();
        System.out.println(sta.c);//instant method called with object only
    }
}
