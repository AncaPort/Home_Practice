package home_practice;

public class NoReturnWithParams {

    public static void main(String[] args) {
        addition(10, 20);
        NoReturnWithParams no = new NoReturnWithParams();
        no.sub(100,30);
        print("Shital","sanghani");
        no.print1("well","boy");
    }

    //static method
    public static void addition(int a, int b) {
        int ans = a + b;
        System.out.println(ans);
    }

    //instance method
    public void sub(int a, int b) {
        int answer = a - b;
        System.out.println(answer);
    }
    public int s1(int a,int b){
        int ans = a + b;
        return ans;

    }
//static string method
    private static void print(String name, String surname){
        System.out.println("name is: " +name+ " and surname is: "+surname);
    }
    //instance string method
  public void print1(String girl,String men){
        System.out.println("name is: "+girl+ " " +men);
    }

}
