package home;
import java.util.ArrayList;
import java.util.Random;

//master class for all objects in the behavior tree
public class Node {

	ArrayList<Node> children = new ArrayList<Node>();
	ArrayList<Node> neighbors = new ArrayList<Node>();
	SoldierStats soldierStats = new SoldierStats(); //the stats for this decider
	public float fuzziness;
	public float g_of_x = 1.0f;
	final float adjustment_value = 0.01f;
	
	Behavior behavior = new Behavior();
	
	//this function genrats a g(x) score from the soldierStats and the Nodes soldier stats
	//SoldierStats object is compared to incoming soldier
	public float gxScore(SoldierStats soldier_unit)
	{
		System.out.println("Node:: Running gxScore(SoldierStates soldier_unit");
		///return 0.50f;
		
		//calculate gxScore
		
		//need to generate a gxScore
		//cannot exceed 1
		//rate and multiply by probability
		//if above 0.5 total gx score, than it succeeds
		///probability works in a reverse way
		//the better the probabiity, the closet to 0
		
		//so if a soldier has a successful stats check
		//the stats g(xx) score decreases because that path
		//is now cost less
		if (soldier_unit.adrenaline > soldierStats.adrenaline)
		{
			g_of_x -= adjustment_value;
		}
		
		if (soldier_unit.aggression > soldierStats.aggression)
		{
			g_of_x -= adjustment_value;
		}
		if (soldier_unit.agility > soldierStats.agility)
		{
			g_of_x -= adjustment_value;
		}
		
		if (soldier_unit.aim > soldierStats.aim)
		{
			g_of_x -= adjustment_value;
		}
		
		if (soldier_unit.anger > soldierStats.anger)
		{
			g_of_x -= adjustment_value;
		}
		
		if (soldier_unit.balance > soldierStats.balance)
		{
			g_of_x -= adjustment_value;
		}
		
		if (soldier_unit.bloodPressure > soldierStats.balance)
		{
			g_of_x -= adjustment_value;
		}
		
		if (soldier_unit.breahting > soldierStats.breahting)
		{
			g_of_x -= adjustment_value;
		}
		
		if (soldier_unit.communication > soldierStats.communication)
		{
			g_of_x -= adjustment_value;
		}
	
		if (soldier_unit.complexMuscleMovements > soldierStats.complexMuscleMovements)
		{
			g_of_x -= adjustment_value;
		}
		
		if (soldier_unit.diseasesResistance > soldierStats.diseasesResistance)
		{
			g_of_x -= adjustment_value;
		}
		
		if (soldier_unit.drinking > soldierStats.drinking)
		{
			g_of_x -= adjustment_value;
		}
		
		if (soldier_unit.eating > soldierStats.eating)
		{
			g_of_x -= adjustment_value;
		}
		
		if (soldier_unit.emotion > soldierStats.emotion)
			
		{
			g_of_x -= adjustment_value;
		}
		
		if (soldier_unit.executiveFunctioning > soldierStats.executiveFunctioning)
		{
			g_of_x -= adjustment_value;
		}
		
		if (soldier_unit.eyesight > soldierStats.eyesight)
		{
			g_of_x -= adjustment_value;
		}
		
		if (soldier_unit.fear > soldierStats.fear)
		{
			g_of_x -= adjustment_value;
		}
			
		if (soldier_unit.hearing > soldierStats.hearing)
		{
			g_of_x -= adjustment_value;
		}
		
		if (soldier_unit.hearingDistance > soldierStats.hearingDistance)
		{
			g_of_x -= adjustment_value;
		}
		if (soldier_unit.hunger > soldierStats.hunger)
		{
			g_of_x -= adjustment_value;
		}
		
		if (soldier_unit.languageScore > soldierStats.languageScore)
		{
			g_of_x -= adjustment_value;
		}
		
		if (soldier_unit.learningScore > soldierStats.learningScore)
		{
			g_of_x -= adjustment_value;
		}
		
		if (soldier_unit.moods > soldierStats.moods)
		{
			g_of_x -= adjustment_value;
		}
		
		if (soldier_unit.morale > soldierStats.morale)
		{
			g_of_x -= adjustment_value;
		}
		
		if (soldier_unit.motives > soldierStats.motives)
		{
			g_of_x -= adjustment_value;
		}
		if (soldier_unit.motorSkills > soldierStats.motorSkills)
		{
			g_of_x -= adjustment_value;
		}
		
		if (soldier_unit.planning > soldierStats.planning)
		{
			g_of_x -= adjustment_value;
		}
		
		if (soldier_unit.pleasure > soldierStats.pleasure)
		{
			g_of_x -= adjustment_value;
		}
		
		if (soldier_unit.posture > soldierStats.posture)
		{
			g_of_x -= adjustment_value;
		}
		
		if (soldier_unit.pulse > soldierStats.pulse)
		{
			g_of_x -= adjustment_value;
		}
		
		if (soldier_unit.reflex > soldierStats.reflex)
		{
			g_of_x -= adjustment_value;
		}
		
		if (soldier_unit.sanity > soldierStats.sanity)
		{
			g_of_x -= adjustment_value;
		}
		
		if (soldier_unit.scope > soldierStats.scope)
		{
			g_of_x -= adjustment_value;
		}
		
		if (soldier_unit.sex > soldierStats.sex)
		{
			g_of_x -= adjustment_value;
		}
		
		if (soldier_unit.sleep > soldierStats.sleep)
		{
			g_of_x -= adjustment_value;
		}
		
		if (soldier_unit.socialBehavior > soldierStats.socialBehavior)
		{
			g_of_x -= adjustment_value;
		}
		if (soldier_unit.speed > soldierStats.speed)
		{
			g_of_x -= adjustment_value;
		}
		
		if (soldier_unit.thirst > soldierStats.thirst)
		{
			g_of_x -= adjustment_value;
		}
		if (soldier_unit.visionScor > soldierStats.visionScor)
		{
			g_of_x -= adjustment_value;
		}
		
		//generate random variable 
		Random random = new Random();
		float fuzziness = random.nextInt(10)/10;
		
		float random_var = 1.0f - fuzziness;
		g_of_x = g_of_x * random_var;
		
		return g_of_x;
		
		//39 conditions total
	}
	
	//this functioun represents a heuristeic (how much it costs to get tot he leaves on avg)
	public float hxScore()
	{
		System.out.println("Node:: running hxScore()");
		return 0.50f;
	}
	
	String output = new String(); //string output. represents behavior
	
}
