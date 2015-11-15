package home;

//this is specializes state machine
//that is child class of Node.java
//This is the "middle" of the tree
public class Decider extends Node
{
	int cost;		//cost when using A* search]
					//calculated by fuzzy logic and deciders
	
	float percentage = 0.50f; //a percentage for fuzzy logic
							  //starts out neutral
								//BackPropagator changes these weights
								//according to whether path was a success or failure

	
	String decisionType;	//this is the value that is being compared in the decider
							//could be MORALE or LOYALTY or REFLEX for example
}
