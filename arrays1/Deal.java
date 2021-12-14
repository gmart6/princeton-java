public class Deal {
    public static void main(String[] args) {
        int hands = Integer.parseInt(args[0]);

        String[] suits = {"clubs", "diamonds", "hearts", "spades"};
        String[] ranks = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "jack", "queen", "king", "ace"};

        // Create and populate the deck
        String[] deck = new String[suits.length * ranks.length];
        for (int i = 0; i < ranks.length; i++) {
            for (int j = 0; j < suits.length; j++) {
                deck[suits.length * i + j] = ranks[i] + " of " + suits[j];
            }
        }

        // Shuffle the deck
        int n = deck.length;
        for (int i = 0; i < n; i++) {
            int r = i + (int) (Math.random() * (n - i));
            String temp = deck[r];
            deck[r] = deck[i];
            deck[i] = temp;
        }

        for (int i = 0; i < hands; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.println(deck[i + j]);
            }
            System.out.println();
        }

    }
}
