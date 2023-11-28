//<DemonstrateStringbuilder> -- Demonstrate String Building

package demonstrateStringbuilder;

import java.util.Random;

class Word {
    private String[] article = {"the", "a", "one", "some", "any"};
    private String[] noun = {"boy", "girl", "dog", "town", "car"};
    private String[] verb = {"drove", "jumped", "ran", "walked", "skipped"};
    private String[] preposition = {"to", "from", "over", "under", "on"};
    private Random random = new Random();

    public String getArticle() {
        return article[random.nextInt(article.length)];
    }

    public String getNoun() {
        return noun[random.nextInt(noun.length)];
    }

    public String getVerb() {
        return verb[random.nextInt(verb.length)];
    }

    public String getPreposition() {
        return preposition[random.nextInt(preposition.length)];
    }
}

class Sentence {
    private Word word;
    
    public Sentence(Word word) {
        this.word = word;
    }

    public String getSentence() {
        StringBuilder sentence = new StringBuilder();
        sentence.append(capitalizeFirst(word.getArticle()))
                .append(" ")
                .append(word.getNoun())
                .append(" ")
                .append(word.getVerb())
                .append(" ")
                .append(word.getPreposition())
                .append(" ")
                .append(word.getArticle())
                .append(" ")
                .append(word.getNoun())
                .append(".");
        return sentence.toString();
    }

    private String capitalizeFirst(String str) {
        return Character.toUpperCase(str.charAt(0)) + str.substring(1);
    }
}

public class DemonstrateStringbuilder {
    public static void main(String[] args) {
       
    	System.out.println("Josiah Barringer - Assignment 4\n");
    	
    	Word word = new Word();
        Sentence sentenceGenerator = new Sentence(word);

        for (int i = 1; i <= 20; i++) {
            String sentence = sentenceGenerator.getSentence();
            System.out.println("Sentence " + i + ": " + sentence);
        }
    }
}
