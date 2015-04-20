import java.util.*;
public class binaryTree {
    public static node root;
    public static void insert(node chechi,int data){
        if(data > chechi.head && chechi.right == null){
            node chechi2 = new node();
            chechi2.head = data;
            chechi.right = chechi2;
        }
        else if(data > chechi.head && chechi.right != null) {
            chechi = chechi.right;
            insert(chechi,data);
        }
        
        if(data < chechi.head && chechi.right == null){
            node chechi2 = new node();
            chechi2.head = data;
            chechi.left = chechi2;
        }
        else if(data < chechi.head && chechi.right != null) {
            chechi = chechi.left;
            insert(chechi,data);
        }
    }
    
    public static void inorder(node chechi){
    	if(chechi == null) return;
    	inorder(chechi.left);
    	System.out.println(chechi.head);
    	inorder(chechi.right);
    }
    
    public static void preorder(node chechi){
    	if(chechi == null) return;
    	System.out.println(chechi.head);
    	preorder(chechi.left);
    	preorder(chechi.right);
    }
    
    public static void postorder(node chechi){
    	if(chechi == null) return;
    	postorder(chechi.left);
    	postorder(chechi.right);
    	System.out.println(chechi.head);
    }
    
    public static void main(String[] args) {
        System.out.println("Chechi");
        Scanner dk = new Scanner(System.in);
        int size = dk.nextInt();
        int data;
        node chechi = new node();
        chechi.head = dk.nextInt();
        node root = chechi;
        for(int i = 0; i<size;i++){
            data = dk.nextInt();
            insert(chechi,data);
            
        }
        System.out.println("Inorder");
        inorder(root);
        System.out.println("Preorder");
        preorder(root);
        System.out.println("Postorder");
        postorder(root);
    }

}
class node{
    int  head = 0;
    node left = null;
    node right = null;
    void print(){
        System.out.println(head);
    }
}
