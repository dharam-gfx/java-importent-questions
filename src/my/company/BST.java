package my.company;

public class BST {
    int val;
    BST left;
    BST right;
    BST (int x){
        val=x;
    }
    public BST find(BST root ,BST p){
        BST node=null;
        while (root != null){
            if (p.val >=root.val){
                root=root.right;

            }
            else {
                node=root;
                root=root.left;
            }
        }
        return  node;
    }

    public static void main(String[] args) {

    }
}
