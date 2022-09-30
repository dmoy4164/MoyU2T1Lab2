public class ChatBotRunner {
    public static void main(String[] args) {
        ChatBot bob = new ChatBot ("Bob", 8);
        bob.greeting("don");
        bob.favoriteNumber(0);
        bob.weather();
        bob.gah();

        double m = bob.convertFeetToMeters(3);
        System.out.println("That equals " + m + " feet.");
        int an = bob.addNumbers(1938213,312312,58547);
        System.out.println("all those numbers added up equals " + an);
        int mul = bob.multiply(9812739,312913,35345935);
        System.out.println("wow big number u gibe me is " + mul);

        String bye = bob.goodbye();
        System.out.println(bye);


    }
}
