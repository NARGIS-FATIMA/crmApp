package tekPyramid;



public class ReverseSentence {
    public static void main(String[] args) {
        String sentence = "This is a sample sentence";
        String reversedSentence = "";

        // Split the sentence into words
        String[] words = sentence.split(" ");

        // Iterate through the words in reverse order
        for (int i = words.length - 1; i >= 0; i--) {
            reversedSentence += words[i] + " ";
        }

        // Remove trailing space
        reversedSentence = reversedSentence.trim();

        System.out.println("Original sentence: " + sentence);
        System.out.println("Reversed sentence: " + reversedSentence);
    }
}
