package functionalinterface;

public class EnglishGreeting implements Greeting {
    @Override
    public void greet() {
        System.out.println("English Greeting.....");
    }
}
