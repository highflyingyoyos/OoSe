public class Aufgabe3 {
    public static void main(String[] args){
        Baum testBaum = new Baum(new TNode(10));
        testBaum.wurzel.left = new TNode(5);
        testBaum.wurzel.right = new TNode(12);
        testBaum.wurzel.left.left = new TNode( 3);
        testBaum.wurzel.left.right = new TNode(7);
        testBaum.wurzel.left.left.left = new TNode(4);
        testBaum.wurzel.right.right = new TNode(15);
        testBaum.wurzel.right.right.left = new TNode(13);

        testBaum.travPreOrder();
        System.out.println("\n");
        testBaum.travPostOrder();
        System.out.println("\n");
        testBaum.travInOrder();
        System.out.println("\n");
        testBaum.travLevelOrder();
        System.out.println("\n");
    }
}
 /*a)
 preoder: Vater links rechts: 10, 5, 3, 4, 7, 12, 15, 13
 postorder: links rechts Vater: 4, 3, 7, 5, 13, 15, 12, 10
 inorder: links Vater rechts: 3, 4, 5, 7, 10, 12, 13, 15
 levelorder: 10, 5, 12, 3, 7, 15, 4, 13
  */