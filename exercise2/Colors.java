package exercise2;

import java.util.ArrayList;
import java.util.Arrays;

public class Colors {

    // needs to return a String[]

    String[] colorful(String[] strings) {
//         For the given strings, keep all the strings that begin with a color
//         ("red", "yellow", "green", "blue", etc.) return an array of strings that start with a color.
//         discard all the other strings.  If no strings start with a color in the input array,
//         return an empty array.
        String[] colors = {"blue", "red", "yellow", "black", "green", "pink"};
        ArrayList<String> colorsString = new ArrayList<>();
        for(int i=0; i<strings.length; i++) {
            for(int j=0; j<colors.length; j++) {
                if (Arrays.asList(strings[i]).get(0).contains(colors[j])) {
                    colorsString.add(strings[i]);
                }
            }
        }
        String[] newArray = new String[colorsString.size()];
        colorsString.toArray(newArray);
        System.out.println(Arrays.toString(newArray));
        return newArray;
    }

    public static void main(String[] args) {
        Colors code = new Colors();
        code.colorful(new String[]{"bluebird","red herring",
                "yellow bumblebee","black spider", "green monkey","pink",
                "great gatsby","feeding frenzy","black bird","widowmaker",
                "quran","bible","torah"});
        System.out.println("This is the Colors class");
    }

}

