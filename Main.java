import java.io.File;
import java.util.*;

public class Main {

    public static void teleprompter() {
         Queue<String> lines;
        try {
            File script = new File("./src/input.txt");
            Scanner stringScanner = new Scanner(script);
            lines = getScriptLines(stringScanner);
            while(!lines.isEmpty()) {
                System.out.println(lines.poll());
                Thread.sleep(3000);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static Queue<String> getScriptLines(Scanner input) {
        //Note we use an ArrayDeque here since Queue is an interface and not a concrete object
        //ArrayDeques support even more operations but we won't use them here!
        Queue<String> output = new ArrayDeque<>();
        String text = input.nextLine();

        //TODO: Change this to populate the queue with individual sentences
        //Hint: text.split("\\.") will give you an array of sentences
        output.add(text);

        return output;
    }
    public static void undoDemo() {
        Scanner scanner = new Scanner(System.in);
        //TODO: What data structure should this be to implement undo?
        List<String> actions = new ArrayList<>();
        String input = scanner.nextLine();
        while(!input.equals("exit")) {
            if (input.equals("ctrl-z")) {
                //TODO: add undo functionality here
            } else if (input.equals("ctrl-y")) {
                //TODO: add redo functionality here
                //Hint: do you need more data structures for this?
            } else {
                actions.add(input);
            }

            for(String s : actions) {
                System.out.println(s);
            }
            input = scanner.nextLine();
        }

    }
    public static void main(String args[]) {
        //Comment out whichever problem you're not working on at the moment to test your program

        teleprompter();
        undoDemo();
    }
}
