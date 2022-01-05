package functionalinterface;

import functionalinterface.HindiGreeting;

public class WellWisher {
    public static void main(String[] args) {
        Greeting hg=new HindiGreeting();
        hg.greet();
        Greeting he=new EnglishGreeting();
        he.greet();
    }
}
