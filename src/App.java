public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World! ");

        show(12, 1, 12,23,32);
    } 

    public static void show(int a, int b, int ...args){

        for(int i : args)
        System.out.println(i);

    }
}
