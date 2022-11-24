package school.mjc.stage0.conditions.task3;

public class AlphabeticCharacters {
    public void vowelDeterminer(char character) {
        int dec = (int) character;
        //65-90 97-122
        if (dec<65||dec>90 && dec<97||dec>122) {
            System.out.println("wrong alphabet!");
        } else if (dec == 65 || dec == 69 || dec == 73 || dec == 79 ||
                   dec == 85 || dec == 97 || dec == 101|| dec == 105||
                   dec == 111|| dec ==117) {
            System.out.println("Vowel");
        } else {
            System.out.println("Consonant");
        }

    }
}
