package main.java.com.example.one;


public class ExampleOne {

    /**
     * this is the main method!
     */
    public static void main(String[] args) {
        /* This just shows us that we are in business */
        System.out.println("Hello World.");

        /* Run some tests showing how the ExampleRunner class works */
        ExampleRunner defaultRunner = new ExampleRunner();
        ExampleRunner parametrizedRunner = new ExampleRunner("Aaron & Thomas are learning stuff!");

        defaultRunner.run();
        parametrizedRunner.run();

        /* Run some tests showing how the BadExample class works */
        BadExample badExampleOne = new BadExample("badExampleOne");
        BadExample badExampleTwo = new BadExample("badExampleTwo");

        badExampleOne.run();
        badExampleTwo.run();
    }

    /**
     * this is a static method that can be referenced without creating an instance of the ExampleOne class
     */
    public static void classPrint(String className) {
        System.out.println("My class name is " + className);
    }
}
