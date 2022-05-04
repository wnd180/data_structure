//자료구조 과제 #5 60201901 권성중
import java.util.*;

public class BinaryTree<Key extends Comparable<Key>> {
    private Node root;

    public BinaryTree() {root = null;}
    public Node getRoot() {return root;}
    public void setRoot(Node newRoot) {root = newRoot;}

    public boolean isEmpty() {return root ==null;}

    public void preorder(Node n){
        if(n!=null){
            System.out.print(n.getKey()+" ");
            preorder(n.getLeft());
            preorder(n.getRight());
        }
    }

    public void inorder(Node n){
        if(n!=null){
            inorder(n.getLeft());
            System.out.print(n.getKey()+" ");
            inorder(n.getRight());
        }
    }

    public static Node Copy(Node n)
    {
        if (n == null) {
            return null;
        }

        Node copynode = new Node(n.getKey(),null,null);
        copynode.setLeft(Copy(n.getLeft()));
        copynode.setRight(Copy(n.getRight()));
        return copynode;
    }

    public void postorder(Node n){
        if(n!=null){
            postorder(n.getLeft());
            postorder(n.getRight());
            System.out.print(n.getKey()+" ");
        }
    }

    public void levelorder(Node root){
        Queue<Node> q = new LinkedList<Node>();
        Node t;

        q.add(root);
        while(!q.isEmpty()){
            t = q.remove();
            System.out.print(t.getKey()+" ");
            if(t.getLeft()!=null)
                q.add(t.getLeft());
            if(t.getRight()!=null)
                q.add(t.getRight());
        }
    }

    public int size(Node n){
        if(n==null)
            return 0;
        else
            return (1+size(n.getLeft())+size(n.getRight()));
    }

    public int height(Node n){
        if(n == null)
            return 0;
        else
            return (1+Math.max(height(n.getLeft()),height(n.getRight())));
    }

    public static boolean isEqual(Node n, Node m){
        if(n==null||m==null)
            return n==m;
        if(n.getKey().compareTo(m.getKey())!=0)
            return false;

        return (isEqual(n.getLeft(),m.getLeft()) && isEqual(n.getRight(),m.getRight()));
    }

}
