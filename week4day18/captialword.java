import java.util.Scanner;

public class captialword
  {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();

        String capitalizedSentence = capitalizeWords(sentence);
        System.out.println("Capitalized sentence: " + capitalizedSentence);
    }

    public static String capitalizeWords(String sentence) 
    {
        String[] words = sentence.split(" ");
        StringBuilder capitalizedSentence = new StringBuilder();

        for (String word : words)
          {
            if (!word.isEmpty()) 
            {
                char firstLetter = Character.toUpperCase(word.charAt(0));
                String restOfWord = word.substring(1);
                String capitalizedWord = firstLetter + restOfWord;

                capitalizedSentence.append(capitalizedWord).append(" ");
            }
        }

        return capitalizedSentence.toString().trim();
    }
}
