package Tasks;
import java.util.*;

public class symmetricTreeStack {
    public static void main(String[] args) {

    }
    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root.left);
        stack.push(root.right);

        while (!stack.isEmpty()) {
            TreeNode l = stack.pop();
            TreeNode r = stack.pop();

            if (r == null && l == null) {
                continue;
            }

            if (l == null || r == null || l.val != r.val) {
                return false;
            }
            stack.push(l.left);
            stack.push(r.right);

            stack.push(l.right);
            stack.push(r.left);
        }
        return stack.isEmpty();
    }
}
