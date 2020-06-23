package exercise2;

class Monkeys {

    boolean monkeyBusiness(Monkey[] monkeys) {
        //BONUS EXERCISE
        //We have a set of monkeys.  Each Monkey has a boolean smile property,
        // which indicates if that particular monkey is smiling.
        // Determine whether or not the majority of monkeys are smiling.
        // If the majority are smiling, return true.  if the majority are not smiling, return false.
        // If it is a tie, return true.
        int smiles = 0;
        int notSmiles = 0;
        for(int i=0; i<monkeys.length; i++) {

            if(monkeys[i].smile) {
                smiles++;
            } else {
                notSmiles++;
            }
        }

        if(smiles > notSmiles) {
            System.out.println("True");
            return true;
        }
        System.out.println("False");
        return false;
    }

    class Monkey {
        String name;
        public boolean smile;

        public Monkey(String name, boolean smile) {
            this.name = name;
            this.smile = smile;
        }
    }

    public static void main(String[] args) {
        //Bonus exercise instructions:  create an array of at least 3 monkeys,
        // utilizing the nested Monkey class, and determine whether the majority of them are smiling or not.
        //required monkey data:
        // Rafiqi is smiling
        // Curious George is smiling
        // King Kong is not smiling
        //You are NOT allowed to move the Monkey class.  Keep it where it is.

        Monkeys monkeys = new Monkeys();
        Monkeys.Monkey monkey = monkeys.new Monkey("Rafiqi", true);
        Monkeys.Monkey monkey1 = monkeys.new Monkey("Curious George", true);
        Monkeys.Monkey monkey2 = monkeys.new Monkey("King Kong", false);



        Monkey[] monkeyList = {monkey, monkey1, monkey2};
//        System.out.println(Arrays.toString(monkeyList));

        monkeys.monkeyBusiness(monkeyList);

    }
}