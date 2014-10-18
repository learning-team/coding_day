package main.java.com.example.one;


public class ExampleOne {

    public static void main(String[] args) {
        System.out.println("Hello World.");
        ExampleRunner defaultRunner = new ExampleRunner();
        defaultRunner.run();
        ExampleRunner parametrizedRunner = new ExampleRunner("Aaron & Thomas are learning stuff!");
        parametrizedRunner.run();

        BadExample badExampleOne = new BadExample("badExampleOne");
        BadExample badExampleTwo = new BadExample("badExampleTwo");

        badExampleOne.run();
        badExampleTwo.run();
    }

    public static void classPrint(String className) {
        System.out.println("My class name is " + className);
    }
}
