import java.util.LinkedList;
import java.util.Queue;

public class TreeDataTech {
    static class Node {
        int data;
        Node left, right;
        Node(int item) {
            data = item;
            left = right = null;
        }
    }

    static class BinaryTree {
        int index=-1;
        Node BuildTree(int[] nodes){
            index++;
            if(nodes[index]==-1){
                return null;
            }
            Node root= new Node(nodes[index]);
            root.left=BuildTree(nodes);
            root.right=BuildTree(nodes);

            return root;
        }
    }

    public static void preOrder(Node root){
        if(root==null){
            System.out.print(-1 + " ");
            return;
        }
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public static void inOrder(Node root){
        if(root==null){
            System.out.print(-1 + " ");
            return;
        }
        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }

    public static void postOrder(Node root){
        if(root==null){
            System.out.print(-1 + " ");
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data + " ");
    }

    public static void levelOrder(Node root){
        if(root == null){
            System.out.println("Tree is empty");
            return;
        }
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        q.add(null);

        while(!q.isEmpty()){
            Node node=q.remove();
            if(node == null){
                System.out.println();
                if(q.isEmpty()){
                    return;
                }else{
                    q.add(null);
                }
            }else{
                System.out.print(node.data + );
                if(node.left != null){
                    q.add(node.left);
                }
                if(node.right != null){
                    q.add(node.right);
                }
            }
        }
    }

    /*
            1
        2       3
       4 5       6
     */
    public static void main(String[] args) {
        int[] nodes= new int[]{1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree= new BinaryTree();
        Node root=tree.BuildTree(nodes);
        System.out.println(root.data);
        preOrder(root);
        System.out.println();
        inOrder(root);
        System.out.println();
        postOrder(root);
        System.out.println("level order");
        levelOrder(root);
    }
}
