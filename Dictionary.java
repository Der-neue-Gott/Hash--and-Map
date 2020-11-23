import java.util.HashMap;

public class Dictionary {
    public static void main(String[] args) {

        String text =
        "Dear Harry, Ron wrote to me and told me about his phone call to your Uncle Vernon. \n" +
        "I do hope you’re all right. I’m on holiday in France at the moment and I didn’t know \n" +
        "how I was going to send this to you — what if they’d opened it at customs? — but then Hedwig turned up! \n" +
        "I think she wanted to make sure you got something for your birthday for a change. I bought your present by owl—order; \n" +
        "there was an advertisement in the Daily Prophet (I’ve been getting it delivered; \n" +
        "it’s so good to keep up with what’s going on in the wizarding world). \n" +
        "Did you see that picture of Ron and his family a week ago? I bet he’s learning loads. \n" +
        "I’m really jealous — the ancient Egyptian wizards were fascinating. There’s some interesting local history of witchcraft here, too. \n" +
        "I’ve rewritten my whole History of Magic essay to include some of the things I’ve found out, I hope it’s not too long — \n" +
        "it’s two rolls of parchment more than Professor Binns asked for. Ron says he’s going to be in London in the last week of the holidays. \n" +
        "Can you make it? Will your aunt and uncle let you come? I really hope you can. If not, I’ll see you on the Hogwarts Express on September first! \n" +
        "Love from Hermione P.S. Ron says Percy’s Head Boy. I’ll bet Percy’s really pleased. Ron doesn’t seem too happy about it.";
        System.out.println(text);

        String textLow = text.toLowerCase().replaceAll("[\n—’!?.(),.; ]", "");


    System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -");


        HashMap<Character, Integer> textChars = new HashMap<>();
        char[] chars = textLow.toCharArray();

                for (int i = 0; i < chars.length; i++) {

                        if (!textChars.containsKey(chars[i])) {

                            textChars.put(chars[i], 0);

                        } textChars.put(chars[i], textChars.get(chars[i]) + 1);

                }

        textChars.forEach((a, b) -> System.out.println("Буква " + a + " встречается в тексте " + b + " раз.") );

    }
}