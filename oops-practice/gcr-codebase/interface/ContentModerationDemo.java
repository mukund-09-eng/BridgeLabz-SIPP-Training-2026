interface TextModeration {

    void checkOffensiveContent(String post);

    default void displayModerationPolicy() {
        System.out.println("No abusive language allowed.");
    }

    static boolean containsRestrictedWords(String post) {

        String lower = post.toLowerCase();

        return lower.contains("hate")
                || lower.contains("abuse")
                || lower.contains("offensive");
    }
}

interface SpamDetection {

    void checkSpam(String post);

    default void displayModerationPolicy() {
        System.out.println("No spam messages allowed.");
    }
}

class ContentModerator
        implements TextModeration, SpamDetection {

    @Override
    public void checkOffensiveContent(String post) {

        if (TextModeration.containsRestrictedWords(post)) {
            System.out.println("Offensive Post");
        }
    }

    @Override
    public void checkSpam(String post) {

        String lower = post.toLowerCase();

        if (lower.contains("buy now")
                || lower.contains("free money")
                || lower.contains("click here")) {

            System.out.println("Spam Post");
        }
    }

    @Override
    public void displayModerationPolicy() {

        TextModeration.super.displayModerationPolicy();
        SpamDetection.super.displayModerationPolicy();
    }
}

public class ContentModerationDemo {

    public static void main(String[] args) {

        String[] posts = {
                "Buy now and get 50% discount",
                "I hate this product",
                "Java is a great language",
                "Click here for free money"
        };

        ContentModerator moderator =
                new ContentModerator();

        moderator.displayModerationPolicy();

        System.out.println();

        for (String post : posts) {

            System.out.println("Post: " + post);

            String lower = post.toLowerCase();

            boolean spam =
                    lower.contains("buy now")
                    || lower.contains("free money")
                    || lower.contains("click here");

            boolean offensive =
                    TextModeration
                    .containsRestrictedWords(post);

            if (spam) {
                System.out.println("Result: Spam Post");
            }
            else if (offensive) {
                System.out.println("Result: Offensive Post");
            }
            else {
                System.out.println("Result: Valid Post");
            }

            System.out.println();
        }
    }
}
