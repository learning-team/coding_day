package main.java.com.example.one;


public class ExampleOne {

    public static void main(String[] args) {
        System.out.println("Hello World.");
        ExampleRunner defaultRunner = new ExampleRunner();
        defaultRunner.run();
        ExampleRunner parametrizedRunner = new ExampleRunner("Aaron & Thomas are learning stuff!");
        parametrizedRunner.run();
    }
}
