/**
 * Branching nodes in the game's story tree.
 * @author Elise Maino
 */
public class Node {
    String description;
    int[] paths;

    public Node(String _description, int[] _paths) {
        description = _description;
        paths = _paths;
    }

    @Override
    public String toString() {
        return description;
    }
}
