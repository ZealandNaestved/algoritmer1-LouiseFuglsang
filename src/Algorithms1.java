import java.util.Random;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Algorithms1 {

// TODO 1 - Gennemse Data klassen, og skriv gode kommentarer til det


// TODO 2 - Skriv en randomBoyName() metode i Algorithms1, som returnerer et tilfældigt drengenavn fra Data klassens randomDrengeNavne property OBS: randomDrengeNavne skal forblive private!

    public static String randomBoyName() {
        Random rand = new Random();

        String[] names;
        Data data = new Data();
        names = data.getRandomDrengeNavne();
        int arrayLength = names.length;
        int randomInt = rand.nextInt(arrayLength);
        String randomName = names[randomInt];
        System.out.println(randomName);
        return randomName;
    }


// TODO 4 - Skriv en randomGirlName() metode i Algorithms1, som returnerer et tilfældigt pigenavn fra Data klassen

    public static String randomGirlsName() {
        Random rand = new Random();

        String[] names;
        Data data = new Data();
        names = data.getRandomPigeNavne();
        int arrayLength = names.length;
        int randomInt = rand.nextInt(arrayLength);
        String randomName = names[randomInt];
        System.out.println(randomName);
        return randomName;
    }


// TODO 5 - Skriv en randomName() metode i Algorithms1, som laver et sammenlagt array som indeholder både piger og drenge, og returnerer det

    public static String randomBoyGirlsName() {
        Data data = new Data();
        String[] namesBoy = data.getRandomDrengeNavne();

        String[] namesGirl = data.getRandomPigeNavne();

        List list = new ArrayList(Arrays.asList(namesBoy));
        list.addAll(Arrays.asList(namesGirl));
        Object[] namesBoyGirl = list.toArray();

        Random rand = new Random();

        int arrayLength = namesBoyGirl.length;
        int randomInt = rand.nextInt(arrayLength);
        String randomBoyGirlsName = (String) namesBoyGirl[randomInt];
        System.out.println(randomBoyGirlsName);
        return randomBoyGirlsName;
    }


// TODO 7 - Skriv en random bogstavs-generator metode (du kan tage udgangspunkt i randomNumbers() i Data)

        public static char getRandomCharacter(char a, char z) {
            return (char) (a + Math.random() * (z - a + 1));
        }


// TODO 8 - Skriv en plat eller krone generator metode (plat er boolean true og krone er boolean false)

    public String PlatEllerKrone() {
        Random r = new Random();
        int chance = r.nextInt(2);
        if (chance == 1) {
            return "Plat";
        } else {
            return"Krone";
        }
    }


// Main
    public static void main(String[] args) {
        System.out.println("Random boys name: " + new Algorithms1().randomBoyName());
        System.out.println(" ");
        System.out.println("Random girls name: " + new Algorithms1().randomGirlsName());
        System.out.println(" ");
        System.out.println("Random name of boys and girls: " + new Algorithms1().randomBoyGirlsName());
        System.out.println(" ");
        System.out.println("Random character: " + new Algorithms1().getRandomCharacter('a', 'z'));
        System.out.println(" ");
        System.out.println("Plat eller Krone spil - resultatet er: "+ new Algorithms1().PlatEllerKrone());
}
    }


// TODO 3 - Skriv en test til randomBoyName() metoden HINT: Se metoden exampleOfPredictableRandomNumber() for at se,
//  hvordan du kan lave et tilfældigt nummer som er altid det samme (til test)

// TODO 6 - Skriv en test til randomName() metoden
