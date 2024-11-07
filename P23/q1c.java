package P23;

public class q1c {
    public static void main(String[] args) {
        String spell="Aguamenti";
        System.out.println(spell.indexOf("m"));

        String palindrome = "Never odd or even";

        palindrome = palindrome.replaceAll("e", "www");
        System.out.println(palindrome);

        System.out.println(palindrome.split("w")[1]);

        String[] words = {"Harry", "Ron", "Hermione"};
        System.out.println(words[1].length());

        String word = "piertotum locomotor";
        String[] parts = word.split("o");
        System.out.println(parts[1]);
        System.out.println(parts[1].contains(spell));

    }
}
