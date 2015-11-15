package home;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;


public class A_Star_Path {
	ArrayList<Node> nodesOnPath = new ArrayList<Node>();
	
	public A_Star_Path(Soldier st)
	{
		System.out.println("A_Star_Path:: Running constructor (Soldier st");
		TraversePath(st);
	}
	
	
	
	//traverse nodes on tree
	//comparing soldier stats to node soldier stats
	//until reaching leaf node (behaviors)
	
	
	//reads soldiers behavior tree
	//performs the A* search alogirhtm on it
	//return the path it found (in the form of an arrayList of nodes
	public ArrayList<Node> TraversePath(Soldier st)
	{
		System.out.println("A_Star_Path:: Running TraversePath(Soldier st)");
		ArrayList<Node> pathBeingTaken = new ArrayList<Node>();
		
		//use nodesOnPath for temporary storage
		
		//traverse the soldier's tree - store nodesOnPath
		
		//for each of the levels of the tree, check the decider children of the
		//current node.
		
		//The decider compares a fuzzy logic score and (for variety and
		//to keep the tree from going "stale". 
		//The decider also compares between the static&dynamic stats on the soldier
		//and the static&dynamic stats on the tree node
		
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
	
	
	public String getBehavior()
	{
		//getBehavior examines the leaves of the a*search and makes a decision
		//to the behavior to be picked for the soldier
		//iterate through nodesOnPath
		System.out.println("A_Star_Path:: Running getBehavior()");
		
		Behavior behavior = new Behavior();
		
		
		for (Node n: nodesOnPath)
		{
			//if no children we are on a leaf node
			if (n.children.isEmpty())
			{
				behavior = n.behavior;
			}
		}
		
		
		return null;
	}
	
}
