import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;





public class TreeTest implements Comparator<Car> {

public static void main(String[] args) {

	Tree<Car> tree = new Tree<Car>();

tree.insertNode(new Car("453B55","2007 Porsche","Mary Jane"));

tree.insertNode(new Car("123T56", "2021 caddilac","Eliazabeth Wood"));

tree.insertNode(new Car("247H54", "New Yorker","Simpson Grant"));

tree.insertNode(new Car("237H54", "1998 Grand Jeep","Dan Jacobson"));

tree.insertNode(new Car("123F44", "2012 Lexus","Faniz Eliasvand "));

tree.insertNode(new Car("121A69", "2015 Mercades Benz", "Kevin Karma"));


System.out.print("Preorder traversal");
System.out.println();
tree.preorderTraversal();
System.out.println();
System.out.println();

System.out.print("Inorder traversal");
System.out.println();
tree.inorderTraversal();
System.out.println();
System.out.println();

System.out.print("Postorder traversal");
System.out.println();
tree.postorderTraversal();
System.out.println();
System.out.println();

}

@Override
public int compare(Car o1, Car o2) {
	// TODO Auto-generated method stub
	return 0;
}

}
