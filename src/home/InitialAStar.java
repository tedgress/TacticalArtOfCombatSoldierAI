package home;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

//NOTE SURE IF I NEED THIS INITIALASTAR
//REGULAR ASTAR MIGHT WORK
//SINCE REGULAR ASTAR INITS ITS VARIABLES TO 50%

public class InitialAStar {

	
	ArrayList<Node> nodesOnPath = new ArrayList<Node>();
	//runs A* randomly over the behavior tree
	//and records it on the A_Star_Path "nodes on path"
	
	//create a back propagator
	
	public InitialAStar(Soldier st)
	{
		//traverse tree randomly - until reach leaf
		//store leaf behavior
		//temporarily store nodes in nodesOnPath
		//create a back propagator object
		//pass nodesOnPatht o back propagator along with the behaviorTree

		//about 70 behaviors

		//around 40 soldierstat
		System.out.println("InitialAStar::Running InitialAStar(Soldier st)");
		TraversePath(st);
	}

	public ArrayList<Node> TraversePath(Soldier st)
	{
		System.out.println("InitialAStar::Running TraversePath(Soldier st)");
		ArrayList<Node> pathBeingTaken = new ArrayList<Node>();
		//////////////////////////////////
		//A* Algorithm
		////////////////////////////////
		Set<Node> openList = new HashSet<Node>();
		Set<Node> closedList = new HashSet<Node>();

		//put the starting node on the open list
		openList.add(st.behaviorTree.root.get(0));

		while (!openList.isEmpty())
		{
			//find the node with the least cost on the open list, call it q
			//iterate through nodes on open list
			Node q = new Node();
			for (Node  o : openList)
				if (o.gxScore(st.soldierStats) < q.gxScore(st.soldierStats))
				{
					q = o;
				}
			//pop the node 
			openList.remove(q);
			closedList.add(q);

			//foreach neighbor of q
			//(where q is current)
			for (Node child : q.children) //child is neighbor
			{
				//if child is in closed set, continue
				if (openList.contains(child))
				{
					continue;
				}

				//run state machine for this node
				//tentative g score
				float g_of_x = child.gxScore(st.soldierStats);
				if (!openList.contains(child)) //found a new node
				{
					openList.add(child);
				}

				//if this g(x) for this chid is greater than the others than
				//this is not better path, so continue
				for (Node n : q.neighbors)
					if (g_of_x > n.gxScore(st.soldierStats))
					{
						continue;
					}
				//best path until now, record it
				//record (current)
				nodesOnPath.add(q);

			}

		}



		return pathBeingTaken;
	}


}



