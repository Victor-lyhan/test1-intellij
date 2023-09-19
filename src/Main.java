import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Press Opt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        Scanner input = new Scanner(System.in);
        System.out.println("Test1 - intelliJ");
        int integers;
        boolean isStop = true;
        while(isStop) {
            integers = input.nextInt();
            switch (integers) {
                case 0:
                    System.out.println("This is 1 less than 1");
                    break;
                case 1:
                    System.out.println("This is 1 less than 2");
                    break;
                case 2:
                    System.out.println("This is 1 less than 3");
                    break;
                case 3:
                    System.out.println("This is 1 less than 4");
                    break;
            }
            if(input.nextLine().contains("Stop")){
                isStop = false;
            }
        }
        input.close();

    }
}