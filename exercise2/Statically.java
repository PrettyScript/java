package exercise2;

class Statically {
    //Once you have finished getting statistically.js to run, refactor the code here in Java.
    private static String glue = "Epoxy";
    private String jello = "Jello";

    public static void moveAndShake() {
        System.out.println("Never stagnate in life.  Be agile, change, and improve...");
    }

    public static void stubborn() {
        moveAndShake();
        System.out.println("Please don't make me change... I just don't like it...");
    }

    public static void explain() {
        System.out.println(glue);
        System.out.println("The static keywords can be accessed without creating an object of the class. \n" +
                "I found that you are not able to call a non-static method from a static method. \n" +
                "It just returns an error. The only way to get the static method to run is to make \n" +
                "the move and shake method a static method as well. In JavaScript, the 'this' keyword can \n" +
                "be used in order to reference other static methods, but in Java 'this' and 'super' cannot be\n" +
                "used in static context.\"");
    }

    public static void main(String[] args) {
        Statically stats = new Statically();

        Statically.moveAndShake();
        Statically.stubborn();
        Statically.explain();
        System.out.println(stats.jello);
    }
}
