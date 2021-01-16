package interview;

import java.util.*;

public class LevelSum {

    // Please do not change this interface
    public static interface Node {
        int getValue();
        List<Node> getChildren();
    }


    static class NodeC implements Node {
        private int value;
        private List<Node> children;

        public NodeC() {
            this.value = 0;
            children = null;
        }

        public NodeC(int value, List<Node> children) {
            this.value = value;
            this.children = children;
        }

        public int getValue() {
            return value;
        }

        public List<Node> getChildren() {
            return children;
        }
    }


    /**
     * Please implement this method to
     * traverse the tree and return the sum of the values (Node.getValue()) of all nodes
     * at the level N in the tree.
     * Node root is assumed to be at the level 0. All its children are level 1, etc.
     */
    public static int getLevelSum(Node root, int n) {
        if(n == 0) {
            return 0;
        }

        List<Node> currentLevel = Arrays.asList(root);
        for(int currDepth = 1;  currDepth < n; currDepth++) {
            currentLevel = getAllChildren(currentLevel);
        }
        int result = 0;
        for(Node currentChildren : currentLevel) {
            result += currentChildren.getValue();
        }
        return result;
    }

    private static List<Node> getAllChildren(List<Node> currentLevel) {
        List<Node> result = new ArrayList<>();
        for(Node currentNode : currentLevel) {
            result.addAll(currentNode.getChildren());
        }
        return result;
    }

}
