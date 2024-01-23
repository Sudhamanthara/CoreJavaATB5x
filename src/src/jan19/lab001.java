package src.jan19;

public class lab001 {
    public static void main(String[] args) {
        staticdemo.printName();
        System.out.println(staticdemo.college_name);

        staticdemo s1 = new staticdemo();
        s1.version = 199;
        s1.printversion();
        staticdemo.college_name = "Sudha";
        System.out.println(staticdemo.college_name);
        System.out.println("m1");
    }
}
