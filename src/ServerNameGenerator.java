import java.util.Arrays;

public class ServerNameGenerator {
    public static void main(String[] args) {

//    Create two arrays whose elements are strings: one with at least 10 adjectives, another with at least 10 nouns.
        String[] adjectives = {"brave", "calm", "eager", "faithful", "ambitious", "nice", "lazy", "plump", "chubby", "scary"};
        System.out.println(Arrays.toString(adjectives));
        String[] nouns = {"man", "mountain", "state", "ocean", "country", "building", "cat", "airline", "religion", "history"};
        System.out.println(Arrays.toString(nouns));

//    Create a method that will return a random element from an array of strings.

        System.out.println("Here is your server name :");
//        we do not have to use class object here because we have static on methods.
        System.out.println(ServerNameGenerator.randomWord(adjectives) + "---" + ServerNameGenerator.randomWord(nouns));
    }

//    Add a main method, and inside of your main method select and random noun and adjective and hyphenate the combination
//    and display the generated name to the user.

    public static String randomWord(String[] inputWords) {
        int randomNum = (int) (Math.random() * inputWords.length);
        return inputWords[randomNum];
    }
}