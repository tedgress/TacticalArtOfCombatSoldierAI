package home;

import simulation.SimulatedSoldiers;

public class MainAIEngine {

		
	Soldier soldier = new Soldier();
	
	
	//create a soldier
	//the behavior tree is in the soldier
	
	//may not have to run the intial random A* search. 
	//since all variables start out as 50%
	//run the initial random A* search
	
	//run the main A* continously, sorting A* tree
	//after a tree is sorted, will back propagate

//	public void mainEngine()
//	{
//		while(true)
//		{
//			A_Star_Path a_star_path = new A_Star_Path(soldier);
//			BackPropagator backPropagate = new BackPropagator(a_star_path, 0.0f, 0.0f);
//			
//		}
//	}
	
	//for training and demo purposes, otherwise use the main engine code
	SimulatedSoldiers sim_soldiers = new SimulatedSoldiers();
	
	
	//save the A* tree to database
}
