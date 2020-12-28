import java.util.List;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> listInt = new Stack<Integer>();
        listInt.add(1);
        listInt.add(2);
        listInt.add(3);
        listInt.add(4);
        listInt.add(5);
        listInt.add(6);
        listInt.add(7);
        listInt.add(8);
        listInt.add(9);
        listInt.add(10);
        listInt.push(100);
        System.out.println("Before: " + listInt);

        Stack<Integer> newListInteger = new Stack<>();
        int size = listInt.size();

        for (int i = 0; i < size; i++) {
            newListInteger.add(listInt.pop());
        }
        System.out.println("------after reversed------"+newListInteger);
        //==============================================
        Stack<String> listString = new Stack<>();
        listString.add("1");
        listString.add("2");
        listString.add("3");
        listString.add("4");
        listString.add("5");
        listString.add("6");
        listString.add("7");
        listString.add("8");
        listString.add("9");
        listString.add("10");
        listString.push("100");



        Stack<String> newListString= new Stack<>();
        int sizeString = listString.size();
        System.out.println("Before: " +listString);

        for (int i = 0; i < sizeString; i++) {
            newListString.add(listString.pop());
        }
        System.out.println("------after reversed String------"+newListString);

    }

}
