package functionalinterface;

import functionalinterface.HindiGreeting;

public class WellWisher {
    public static void wish(Greeting greeting){  //Greeting interface is a parameter
        greeting.greet();//that class greet method call
    }
    public static void main(String[] args) {
        Greeting hg=new HindiGreeting();
        //hg.greet();
        wish(hg);
        Greeting he=new EnglishGreeting();
        //he.greet();
        wish(he);
    }
}
