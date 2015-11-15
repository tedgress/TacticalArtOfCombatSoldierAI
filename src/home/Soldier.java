package home;

public class Soldier {

	//constructor
	
	public Soldier()
	{
		System.out.println("Soldier:: Running constructor");
		Node n = new Node();
		behaviorTree.buildTree(n,10); //depth of ten
		
	}
	
	
	
	SoldierStats soldierStats = new SoldierStats();
	
	//behavior tree for this soldier
	
	BehaviorTree behaviorTree = new BehaviorTree();
	
	
	
	//run soldier's initial run (variables are equal
	
	InitialAStar initialAStar = new InitialAStar(this);
	
	//runs soldiers general maintenance
	
	A_Star_Path a_star_path = new A_Star_Path(this);

	//relative to simulation
	
	
	
}
