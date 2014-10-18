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
    public ExampleRunner(String instanceString) {
        instanceString = instanceString;
        this.instanceString = instanceString;
        ExampleOne.classPrint(this.getClass().toString());
    }

    public void run() {
        print(STATIC_STRING);
        print(this.STATIC_STRING);
        print(instanceString);
        print(this.instanceString);
    }

    private void print(String s) {
        System.out.println(s);
    }
}
