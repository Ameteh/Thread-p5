 public class Unsync951 {
        public static void main(String args[]) {
            new PrintStringsThread("Hello ", "there.");
            new PrintStringsThread("How are ", "you?");
            new PrintStringsThread("Thank you ", "very much!");
        }
    }