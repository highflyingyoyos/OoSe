import java.util.LinkedList;

public class Baum {
    public TNode wurzel;
    public Baum(TNode pWurzel){
        wurzel = pWurzel;
    }

    public void travPostOrder(){
        postOrder(wurzel);
    }

    public void travInOrder(){
        inOrder(wurzel);
    }

    public void travPreOrder(){
        preOrder(wurzel);
    }

    private void postOrder(TNode node){
        if(node == null)
            return;
        postOrder(node.left);
        postOrder(node.right);
        System.out.println(node.data);
    }
    private void inOrder(TNode node){
        if(node == null)
            return;
        inOrder(node.left);
        System.out.println(node.data);
        inOrder(node.right);
    }
    private void preOrder(TNode node){
        if(node == null)
            return;
        System.out.println(node.data);
        preOrder(node.left);
        preOrder(node.right);
    }

    public void travLevelOrder(){
        if(wurzel == null)
            return;
        LinkedList<TNode> queue= new LinkedList<>();
        TNode currentNode;
        queue.add(wurzel);
        while(!queue.isEmpty()){
            currentNode = queue.pop();
            if(currentNode.left != null)
                queue.add(currentNode.left);
            if(currentNode.right != null)
                queue.add(currentNode.right);
            System.out.println(currentNode.data);
        }
    }
}
