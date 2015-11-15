package simulation;

import home.A_Star_Path;
import home.BehaviorManager;
import home.BehaviorTree;
import home.InitialAStar;
import home.Node;
import home.Soldier;
import home.SoldierStats;

public class SimulatedSoldier extends Soldier{

	BehaviorManager behaviorManager = new BehaviorManager();
	
	public SimulatedSoldier()
	{
		System.out.println("Soldier:: Running constructor");
		Node n = new Node();
		behaviorTree.buildTree(n,10); //depth of ten
	}
	
	public void run(SimulatedSoldier st) 
	{
		System.out.println("SimulatedSoldier:: Running run()");
		//make a decision
		//run a*
		A_Star_Path a_star_path = new A_Star_Path(st);
		
		while(true)
		{
			//update deccisions
			a_star_path = new A_Star_Path(st);
			String decision = behaviorManager.getBehavior(st);
			//need to backpropagate as well ***
			//Pause for 4 seconds
            try {
				Thread.sleep(4000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
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
