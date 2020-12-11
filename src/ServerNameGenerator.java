import java.util.Random;

public class ServerNameGenerator {
    public static void main (String[] args){
        String [] adjectives = {
                "fun",
                "funny",
                "loyal",
                "honest",
                "dedicated",
                "cultured",
                "strong",
                "romantic",
                "loving",
                "thoughtful",
                "caring",
                "artistic",
                "creative"
        };
        String [] nouns = {
                "husband",
                "father",
                "son",
                "friend",
                "student",
                "artist",
                "teacher",
                "web developer",
                "traveler",
                "foodie",
                "football",
                "Texas"
        };
        System.out.println("Here is your server name?");
        System.out.printf("%s-%s%n", getRandomElement(adjectives), getRandomElement(nouns));
    }
        public static String getRandomElement(String[] array) {
        Random random = new Random();
        return array [random.nextInt(array.length)];
        }

}
