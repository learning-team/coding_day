package main.java.com.example.one;

public class ExampleRunner {

    private static final String STATIC_STRING = "I never change because I am final. I am shared between all instances of ExampleRunner.";

    private String instanceString;

    /**
     * default constructor
     */
    public ExampleRunner() {
        instanceString = "default constructor";
    }

    /**
     * constructor that takes a string
     */
    public ExampleRunner(String parameter) {
        instanceString = parameter;
    }

    public void run() {
        print(STATIC_STRING);
        print(instanceString);
    }

    private void print(String s) {
        System.out.println(s);
    }
}
