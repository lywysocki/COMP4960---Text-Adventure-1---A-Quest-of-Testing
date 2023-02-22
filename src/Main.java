import java.util.Scanner;

public class Main {
    public static Node[] graph = {
            /* 00 */ new Node("You are walking down an empty street and come upon an old, empty mansion. It seems rundown and uninhabited for at least a decade.\n1. Keep walking\n2. Enter the mansion", new int[]{1,2}),
            /* 01 */ new Node("You decide to keep walking and soon forget the mansion ever existed.", null),
            /* 02 */ new Node("When you enter the mansion, you are welcomed by the foyer.\n1. Go upstairs\n2. Go to the living room\n3. Go to the kitchen", new int[]{3,4,5}),
            /* 03 */ new Node("You stumble upon two rooms, the master bedroom and the bathroom. You end up going to the bathroom. You find a lit candle causing a golden glow below the mirror. You see yourself and a mysterious figure in the reflection.\n1. Scream in fear\n2. Blow out the candle", new int[]{6,7}),
            /* 04 */ new Node("Once you enter the living room, you see a fireplace, a piano, and a door that seems to lead you to the kitchen.\n1. Go to the fireplace\n2. Go to the kitchen", new int[]{10,14}),
            /* 05 */ new Node("Upon entering the kitchen, you see a door leading outside and an entrance to the living room\n1. Go outside\n2. Enter the living room", new int[]{15,4}),
            /* 06 */ new Node("Your fear took over causing you to scream and run out of the house as fast as you can.", null),
            /* 07 */ new Node("You blow out the candle and are met with darkness.\n1. Leave while you can\n2. Continue your exploration into the master bedroom", new int[]{8, 9}),
            /* 08 */ new Node("You leave the house, forever wondering what it was you saw in the mirror.", null),
            /* 09 */ new Node("You exit the bathroom and proceed into the master bedroom which ends up being locked. You try to see if you can rattle the door open. It doesn’t work. You end up having to break the door down. Once you enter the room you come face to face with… a CAT!", null),
            /* 10 */ new Node("You come to the fireplace and it seems to have a switch\n1. Turn it on\n2. Leave it off and go to the house kitchen", new int[]{11,14}),
            /* 11 */ new Node("You turn the fireplace on\n1. Sit and watch\n2. Go to explore the house", new int[]{12,13}),
            /* 12 */ new Node("You decide to sit and watch the fireplace. The warmth of the flame makes you sleepy and you eventually fall asleep. You soon wake up to the glow the still burning fire and turn to see it is now dark outside. You’ve decided you’ve spent too much time in this abandoned mansion and leave to walk back home.", null),
            /* 13 */ new Node("You decide to leave the room to go explore the house some more. You open the door to return to the foyer. Just as you’re about to decide on where to go next you hear a bang from the living room. You quickly re-enter to see the room is now beginning to be engulphed in flames. You try to extinguish the fire, but it does not work. You now decide it is time to run, but it seems all the doors are locker, or stuck? As the room becomes clouded in black smoke, you begin to realized your fate; you lay down on the piano chair and soon fall asleep as the flames engulf you.", null),
            /* 14 */ new Node("Once you enter the kitchen the door seems to slam shut behind you. You walk over to the door that leads you to the foyer: that door is locked too now. It seems your only option is to go outside.\n1. Go outside", new int[]{15}),
            /* 15 */ new Node("You open the door to outside and breath in the fresh air. What a weird house that was. You begin on your journey back home.", null)
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
