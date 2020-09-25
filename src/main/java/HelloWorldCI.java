public class HelloWorldCI {
    public static void main(String[] args) {
        System.out.println("Hello, World of CI");
        HelloWorldCI helloWorld = new HelloWorldCI();
        System.out.println(helloWorld.isEven(12));
    }
    boolean isEven(int number){
        return number%2 == 0;
    }
}

