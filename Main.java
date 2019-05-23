public class Main {
            public static void main (String[] args) {
            String s = "Apples are better than pears";
            printSomethingSomeTimes(s,5);
        }

        private static void printSomethingSomeTimes(String phrase, int count) {
            for (int i = 1; i <= count; i++ ){
                System.out.println(phrase);
            }
        }

    }
