package day9;

public class GreetingsMain {
    public static void main(String[] args) {
        Greetings gr = new Greetings();

        gr.greeting1(); // 1. No params, No return value

        String str = gr.greeting2(); // 2. No params, Returns value
        System.out.println(str);
        // System.out.println(gr.greeting2());

        gr.greeting3("world"); // 3. Takes params, No return value

        System.out.println(gr.greeting4("world")); // 4. Takes param, Returns value
    }
}
