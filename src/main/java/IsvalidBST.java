import helper.TreeNode;

public class IsvalidBST {
    /**
     * https://leetcode.com/explore/interview/card/amazon/78/trees-and-graphs/514/
     */

    public static void main(String[] args) {

        TreeNode validTree = new TreeNode(2,new TreeNode(1), new TreeNode(3));
        TreeNode invalidTree = new TreeNode(1,new TreeNode(2), new TreeNode(3));

        System.out.println(dfs(validTree,null,null));
        System.out.println(dfs(invalidTree,null,null));
    }

    static boolean dfs(TreeNode curr, Integer lowerLimit, Integer upperLimit) {
        //base case
        if (curr == null) {
            return true;
        }

        //Return immediately when it is for the node is invalid
        //  checking lowerLimit!=null, because left most node have no lower limit, so we do not compare
        //  checking upperLimit!=null, because right most node have no upper limit, so we do not compare
        if ((lowerLimit != null && curr.val <= lowerLimit) || (upperLimit != null && curr.val >= upperLimit)) {
            return false;
        }
        return ((dfs(curr.left, lowerLimit, curr.val)) && (dfs(curr.right, curr.val, upperLimit)));
    }
}
