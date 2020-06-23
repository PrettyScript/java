class Statically {
    //fix this code, so all of the instantiation and console.logs() work.  Try not to change the signature of the class, unless absolutely necessary.
    static #glue = "Epoxy";
    jello = "Jello";

    static moveAndShake() {
        console.log(
            "Never stagnate in life.  Be agile, change, and improve..."
        );
    }

    static stubborn() {
        this.moveAndShake();
        console.log("Please don't make me change... I just don't like it...");
    }

    static explain() {
        Statically.stubborn();
        console.log(Statically.#glue);
        //write an explanation for how the keyword static behaves differently in javascript vs. java.
        console.log(
            "The static keywords can be accessed without creating an object of the class. I found that you are not able to call a non-static method from a static method. It just returns an error. The only way to get the static method to run is to make the move and shake method a static method as well. In JavaScript, the 'this' keyword can be used in order to reference other static methods, but in Java 'this' and 'super' cannot be used in static context."
        );
    }
}

//get the below code to run correctly without errors:  Make sure you explain what you did in the the explain() method, defined in the class.  Do NOT remove the 'static' keyword from the explain() method.

const stats = new Statically();

Statically.moveAndShake();
Statically.stubborn();
Statically.explain();

// console.log(stats.#glue);
console.log(stats.jello);

//Once you have finished getting statistically.js to run, refactor the code here in Java.
