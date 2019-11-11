import com.owainlewis.dsa.datastructures.tree.*;

public class Main {
    public static void main(String [] args) {
        BinarySearchTree<Integer> tree = new BinarySearchTree<>();
        tree.insert(10);
        tree.insert(20);
        tree.insert(4);
        tree.insert(40);

        System.out.println(String.format("Search %s", tree.contains(10)));
        System.out.println(String.format("Search %s", tree.contains(100)));
    }
}
