package main.java.com.example.one;

public class BadExample {

    private static  String STATIC_STRING = "I can change because I am not 'final'. I am shared between all instances of BadExample. And, my value is unpredictable.";

    private String instanceString;

    /**
     * constructor that takes a string
     */
    public BadExample(String parameter) {
        instanceString = parameter;
    }

    public void run() {
        print(STATIC_STRING);
        print(instanceString);
        STATIC_STRING = instanceString;
        print(STATIC_STRING);
    }

    private void print(String s) {
        System.out.println(s);
    }
}
