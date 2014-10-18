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
        instanceString = instanceString;                    // this doesn't do anything
        this.instanceString = instanceString;               // this is good!
        ExampleOne.classPrint(this.getClass().toString());
    }

    public void run() {
        print(STATIC_STRING);       // this is fine
        print(this.STATIC_STRING);  // this doesn't make sense, STATIC_STRING is a static variable and should not be referenceded with 'this.'
        print(instanceString);      // this is fine
        print(this.instanceString); // this is a little redundant, but also fine
    }

    private void print(String s) {
        System.out.println(s);
    }
}
