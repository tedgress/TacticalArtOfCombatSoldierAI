package home;

public class BehaviorManager {
	//the role of this class is to make the ultimate decision
	//of the behavior of the soldier
	//according to the behavior tree
	
	public String getBehavior(Soldier st)
	{
		System.out.println("BehaviorManager:: Running getBehavior(Soldier st)");
		String behavior = st.a_star_path.getBehavior();
		
		return null;
		
	}
}
