import java.util.ArrayList;
import java.util.List;

class TreeNode {
    int val;
    TreeNode left, right;

    public TreeNode(int value) {
        val = value;
        left = right = null;
    }
}

class RightviewOfBinaryTree {

    private List<Integer> result;

    public List<Integer> rightSideView(TreeNode root) {
        result = new ArrayList<>();
        rightViewUtil(root, 0);
        return result;
    }

    private void rightViewUtil(TreeNode node, int depth) {
        if (node == null) {
            return;
        }

        if (depth == result.size()) {
            result.add(node.val);
        }

        rightViewUtil(node.right, depth + 1);
        rightViewUtil(node.left, depth + 1);
    }

    public static void main(String[] args) {

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.right = new TreeNode(5);
        root.right.right = new TreeNode(4);

        RightviewOfBinaryTree rightViewBinaryTree = new RightviewOfBinaryTree();
        List<Integer> result = rightViewBinaryTree.rightSideView(root);
        System.out.println("Right view of the binary tree: " + result);
    }
}
