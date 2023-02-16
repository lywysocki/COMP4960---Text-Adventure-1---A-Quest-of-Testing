import java.util.Scanner;

public class Main {
    public static Node[] graph = {
        /* 00 */ new Node("Test Node 0!", new int[]{1}),
        /* 01 */ new Node("Test Node 1!", null)
    };

    public Node head = new Node("Test Node!", new int[]{1});

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Node currentNode = graph[0];
        while (true) {
            System.out.println(currentNode);
            if(null != currentNode.paths) {
                int choice = -1;
                while (choice < 0) {
                    System.out.print("Choose your path: ");
                    try {
                        choice = Integer.parseInt(in.nextLine());
                        currentNode = graph[currentNode.paths[choice - 1]];
                    } catch (NumberFormatException e) {
                        System.out.println("Please enter a numeric character!");
                    } catch (IndexOutOfBoundsException e) {
                        System.out.println("That path does not exist!");
                        choice = -1; // so that we loop again
                    }
                }
            } else {
                System.out.println("Game over!");
                break;
            }
        }
    }
}
