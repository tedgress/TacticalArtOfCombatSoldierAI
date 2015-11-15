package home;
import java.util.ArrayList;


public class BehaviorTree {

	ArrayList<Node> root = new ArrayList<Node>();
	final int maximum_depth = 10;
	//to start out, every node is 50% and each level of the tree
	//contains all of the deciders. The first round is random.
	//The soldier goes through the A* algorithm continually
	//until a sufficient AI tree is built. Then
	//that path is saved for  play in the game
	//every leaf is a behavior
	
	//after reaching a behavior if it is successful
	//it back propagates as a success
	//otherwise it propagates as a failure
	
	//constructor for a behavior tree
	
	//about 70 behaviors
	
	//around 40 soldierstatse
	
	//need to actually build the tree though
	//below is an empty soldier states object for the tree
	
	 SoldierStats soldierStats = new SoldierStats();
	
	//how do we decide on the depth of the tree?
	 //play it by ear?
	 
	 int leaf_number = 0; //the number of the leaves on the tree
	 
	 
	 public void buildTree(Node n, int depth)
	 {
		 System.out.println("BehaviorTree:: Running buildTree(Node n, int depth)");
		 root.add(n);
		 recursiveBuildTree(n, depth);
	 }
	 
	 public void recursiveBuildTree(Node n, int depth)
	 {
		 System.out.println("BehaviorTree:: Running recursiveBuildTree(Node n, int depth");
		 depth++;
		 if (depth>maximum_depth)
		 {
			 //leaf node
			 Behaviors behaviorsMain = new Behaviors();
			 n.behavior = behaviorsMain.behaviors[leaf_number];
			 n.output = behaviorsMain.output[leaf_number];
			 leaf_number++;
			 return;
		 }
		 //make children
		 Node q1 = new Node();
		 Node q2 = new Node();
		 Node q3 = new Node();
		 Node q4 = new Node();
		 Node q5 = new Node();
		 Node q6 = new Node();
		 Node q7 = new Node();
		 Node q8 = new Node();
		 Node q9 = new Node();
		 Node q10 = new Node();
		 
		 //add children
		 n.neighbors.add(q1);
		 n.children.add(q1);
		 n.neighbors.add(q2);
		 n.children.add(q2);
		 n.neighbors.add(q3);
		 n.children.add(q3);
		 n.neighbors.add(q4);
		 n.children.add(q4);
		 n.neighbors.add(q5);
		 n.children.add(q5);
		 n.neighbors.add(q6);
		 n.children.add(q6);
		 n.neighbors.add(q7);
		 n.children.add(q7);
		 n.neighbors.add(q8);
		 n.children.add(q8);
		 n.neighbors.add(q9);
		 n.children.add(q9);
		 n.neighbors.add(q10);
		 n.children.add(q10);
		 
		 //create children from these
		 
		 recursiveBuildTree(q1,depth);
		 recursiveBuildTree(q2,depth);
		 recursiveBuildTree(q3,depth);
		 recursiveBuildTree(q4,depth);
		 recursiveBuildTree(q5,depth);
		 recursiveBuildTree(q6,depth);
		 recursiveBuildTree(q7,depth);
		 recursiveBuildTree(q8,depth);
		 recursiveBuildTree(q9,depth);
		 recursiveBuildTree(q10,depth);
		 
		 //
	 }
	 
	 
	 
	
	
	
}
